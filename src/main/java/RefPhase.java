import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashSet;

public class RefPhase extends RefMLBaseListener {

    private static int STACK_ID_COUNTER=1;

    private static final String INIT_PILE  =
            "\nexception Error ;\n" +
            "let stack = ref [] ;\n" +
            "let id = ref 0 ;\n" +
            "let generateId () = let x = !id in id := !id + 1 ; x ;\n" +
            "let pushId localId = stack := localId::!stack ;\n" +
            "let popId () =\n" +
                    "   begin match !stack with\n" +
                    "   | [] -> failwith \"Error, empty stack!\"\n" +
                    "   | hd::tl -> stack := tl\n" +
                    "   end\n" +
            "let checkId localId =\n" +
                    "   begin match !stack with\n" +
                    "   | [] -> failwith \"Error, stack id mismatch!\"\n" +
                    "   | hd::_ -> if hd != localId then failwith \"Error, stack id mismatch!\"\n" +
                    "   end\n\n";

    private ParseTreeProperty<Scope> scopes;
    private GlobalScope globals;
    private Scope currentScope; // resolve symbols starting in this scope
    private TokenStreamRewriter rewriter;
    private HashSet<ParserRuleContext> editedCtx = new HashSet<ParserRuleContext>(); // stores scopes for which push and pop fun have been added

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes, TokenStream tokens) {
        this.scopes = scopes;
        this.globals = globals;
        this.rewriter = new TokenStreamRewriter(tokens);
    }

    public TokenStreamRewriter getRewriter() {
        return rewriter;
    }

    @Override
    public void enterProgram(RefMLParser.ProgramContext ctx) {
        currentScope = globals;
        rewriter.insertAfter(ctx.start.getStartIndex()-1, INIT_PILE);
    }

    @Override
    public void enterVarDeclIn(RefMLParser.VarDeclInContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void enterFunDeclIn(RefMLParser.FunDeclInContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override public void exitVarDeclIn(RefMLParser.VarDeclInContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override public void exitFunDeclIn(RefMLParser.FunDeclInContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitVar(RefMLParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Translator.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
            Translator.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
    }

    @Override
    public void exitCall(RefMLParser.CallContext ctx) {

        String funcName = ctx.ID().getText();
        int callPos = ctx.ID().getSymbol().getStartIndex();
        Symbol symbol = currentScope.resolve(funcName);

        // we consider that library calls (free variable) must be defined (as func parameter)
        // otherwise, it should be an error (uninitialized variable)
        if (symbol==null) { Translator.error(ctx.ID().getSymbol(), "no such variable: " + funcName); }

        // we want free variables to be defined as function parameter
        // if it is defined as a variable, it is then by definition, not a free variable anymore
        else if ((symbol instanceof VariableSymbol) && (symbol.getType()==Type.SymbolType.FUN_ARG)) {


            // we detect a free variable, this is where we need to do a translation
            boolean backtrackDone=false; // to flag when we terminate our ascent
            ParserRuleContext ctxBrowser = ctx;
            Integer ruleCtx = null; // the kind of statement we find the call in

            do{ // we ascent until we find a context where we can declare our security functions

                if(ctxBrowser.getRuleIndex()==RefMLParser.RULE_functionDecl) {
                    backtrackDone=true;
                    ruleCtx=RefMLParser.RULE_functionDecl;
                }else if(ctxBrowser.getRuleIndex()==RefMLParser.RULE_variableDecl) {
                    backtrackDone=true;
                    ruleCtx=RefMLParser.RULE_variableDecl;
                }

                if(!backtrackDone){
                    System.out.println(ctxBrowser.getText() + " " + ctxBrowser.getRuleIndex());
                    ctxBrowser = ctxBrowser.getParent();
                }

            }while(!backtrackDone);

            Translator.message(ctx.ID().getSymbol(), funcName + " evaluated as a free variable");

            // we need to insert a check call after each free variable func call
            rewriter.insertAfter(ctx.argList().getStop().getTokenIndex(), createCheckCall());

            if(ruleCtx==RefMLParser.RULE_functionDecl){

                RefMLParser.FunctionDeclContext funCtx =  (RefMLParser.FunctionDeclContext) ctxBrowser;
                // the insertion of the security functions are different whether we are in an IN statement or not
                if(funCtx instanceof RefMLParser.FunDeclInContext){
                    RefMLParser.FunDeclInContext funInCtx =  (RefMLParser.FunDeclInContext) funCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made

                    if(funInCtx.IN().getSymbol().getStartIndex()<callPos){
                        if(editedCtx.add(funInCtx.statement(1))) {
                            System.out.println("in fun ctx after in");
                            rewriter.insertAfter(funInCtx.statement(1).getStart().getTokenIndex()-1, createPushCall(funInCtx.statement(1).hashCode()));
                            rewriter.insertAfter(funInCtx.statement(1).getStop().getTokenIndex()+1, createPopCall(funInCtx.statement(1).hashCode()));
                        }
                    }else{
                        if(editedCtx.add(funInCtx.statement(0))) {
                            System.out.println("in fun ctx before in");
                            rewriter.insertAfter(funInCtx.statement(0).getStart().getTokenIndex()-1, createPushCall(funInCtx.statement(0).hashCode()));
                            rewriter.insertAfter(funInCtx.statement(0).getStop().getTokenIndex()+1, createPopCall(funInCtx.statement(0).hashCode()));
                        }
                    }

                }
                if(funCtx instanceof RefMLParser.FunDeclContext){
                    System.out.println("simple fun ctx");
                    RefMLParser.FunDeclContext funSimplCtx =  (RefMLParser.FunDeclContext) funCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made
                    if(editedCtx.add(funSimplCtx)){
                        rewriter.insertAfter(funSimplCtx.statement().getStart().getTokenIndex()-1, createPushCall(funSimplCtx.hashCode()));
                        rewriter.insertAfter(funSimplCtx.statement().getStop().getTokenIndex()+1, createPopCall(funSimplCtx.hashCode()));
                    }
                }

            }else if(ruleCtx==RefMLParser.RULE_variableDecl){

                RefMLParser.VariableDeclContext varCtx =  (RefMLParser.VariableDeclContext) ctxBrowser;
                // the insertion of the security functions are different whether we are in an IN statement or not
                if(varCtx instanceof RefMLParser.VarDeclInContext){
                    System.out.println("in var ctx");
                    RefMLParser.VarDeclInContext varInCtx =  (RefMLParser.VarDeclInContext) varCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made
                    if(editedCtx.add(varInCtx)){
                        rewriter.insertAfter(varInCtx.statement().getStart().getTokenIndex()-1, createPushCall(varInCtx.hashCode()));
                        rewriter.insertAfter(varInCtx.statement().getStop().getTokenIndex()+1, createPopCall(varInCtx.hashCode()));
                    }
                }
                if(varCtx instanceof RefMLParser.VarDeclContext){
                    System.out.println("simple var ctx");
                    RefMLParser.VarDeclInContext varSimpleCtx =  (RefMLParser.VarDeclInContext) varCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made
                    if(editedCtx.add(varSimpleCtx)){
                        rewriter.insertAfter(varSimpleCtx.expr().getStart().getTokenIndex()-1, createPushCall(varSimpleCtx.hashCode()));
                        rewriter.insertAfter(varSimpleCtx.expr().getStop().getTokenIndex()+1, createPopCall(varSimpleCtx.hashCode()));
                    }
                }

            }



        }

    }

    private String createCheckCall() {
        return " ; checkId id" + STACK_ID_COUNTER + "";
    }

    private String createPushCall(int hash) {
        String res = "let id" + STACK_ID_COUNTER + " = generateId () in pushId id" + STACK_ID_COUNTER + " ; ";
        STACK_ID_COUNTER++;
        return res;
    }

    private String createPopCall(int hash) {
        STACK_ID_COUNTER--;
        return " ; popId () ";
    }
}
