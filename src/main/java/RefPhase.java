import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.HashSet;

public class RefPhase extends RefMLBaseListener {

    private static int STACK_ID_COUNTER=1;
    private static HashMap<Integer, Integer> scopeToVarId = new HashMap<Integer, Integer>();

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

        // library calls (free variable) may appear as a call to an undeclared function
        // free variables can also be defined as function parameter
        // if it is defined as a variable, it is then by definition, not a free variable anymore
        if ((symbol==null) || ((symbol instanceof VariableSymbol) && (symbol.getType()==Type.SymbolType.FUN_ARG))){
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
                    ctxBrowser = ctxBrowser.getParent();
                }

            }while(!backtrackDone);

            Translator.message(ctx.ID().getSymbol(), funcName + " evaluated as a free variable");

            // we need to insert a check call after each free variable func call
            rewriter.insertAfter(ctx.argList().getStop().getTokenIndex(), createCheckCall(ctxBrowser.hashCode()));

            if(ruleCtx==RefMLParser.RULE_functionDecl){


                RefMLParser.FunctionDeclContext funCtx =  (RefMLParser.FunctionDeclContext) ctxBrowser;
                // the insertion of the security functions are different whether we are in an IN statement or not
                if(funCtx instanceof RefMLParser.FunDeclInContext){
                    RefMLParser.FunDeclInContext funInCtx =  (RefMLParser.FunDeclInContext) funCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made

                    if(funInCtx.IN().getSymbol().getStartIndex()<callPos){
                        if(editedCtx.add(funInCtx.statement(1))) {
                            rewriter.insertAfter(funInCtx.statement(1).getStart().getTokenIndex()-1, createPushCall(ctxBrowser.hashCode()));
                            rewriter.insertBefore(funInCtx.statement(1).getStop().getTokenIndex()+1, createPopCall(ctxBrowser.hashCode()));
                        }
                    }else{
                        if(editedCtx.add(funInCtx.statement(0))) {
                            rewriter.insertAfter(funInCtx.statement(0).getStart().getTokenIndex()-1, createPushCall(ctxBrowser.hashCode()));
                            rewriter.insertBefore(funInCtx.statement(0).getStop().getTokenIndex()+1, createPopCall(ctxBrowser.hashCode()));
                        }
                    }

                }

                if(funCtx instanceof RefMLParser.FunDeclContext){
                    RefMLParser.FunDeclContext funSimplCtx =  (RefMLParser.FunDeclContext) funCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made
                    if(editedCtx.add(funSimplCtx)){
                        rewriter.insertAfter(funSimplCtx.statement().getStart().getTokenIndex()-1, createPushCall(ctxBrowser.hashCode()));
                        rewriter.insertBefore(funSimplCtx.statement().getStop().getTokenIndex()+1, createPopCall(ctxBrowser.hashCode()));
                    }
                }

            }else if(ruleCtx==RefMLParser.RULE_variableDecl){

                RefMLParser.VariableDeclContext varCtx =  (RefMLParser.VariableDeclContext) ctxBrowser;
                // the insertion of the security functions are different whether we are in an IN statement or not
                if(varCtx instanceof RefMLParser.VarDeclInContext){
                    RefMLParser.VarDeclInContext varInCtx =  (RefMLParser.VarDeclInContext) varCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made
                    if(editedCtx.add(varInCtx)){
                        rewriter.insertAfter(varInCtx.statement().getStart().getTokenIndex()-1, createPushCall(ctxBrowser.hashCode()));
                        rewriter.insertBefore(varInCtx.statement().getStop().getTokenIndex()+1, createPopCall(ctxBrowser.hashCode()));
                    }
                }
                if(varCtx instanceof RefMLParser.VarDeclContext){
                    RefMLParser.VarDeclInContext varSimpleCtx =  (RefMLParser.VarDeclInContext) varCtx;
                    // we only need to insert the push and pop func once in a context statement
                    // no matter hwo many external func calls are made
                    if(editedCtx.add(varSimpleCtx)){
                        rewriter.insertAfter(varSimpleCtx.expr().getStart().getTokenIndex()-1, createPushCall(ctxBrowser.hashCode()));
                        rewriter.insertBefore(varSimpleCtx.expr().getStop().getTokenIndex()+1, createPopCall(ctxBrowser.hashCode()));
                    }
                }

            }
        }

    }

    private String createCheckCall(int hash) {
        if(!scopeToVarId.containsKey(hash)) scopeToVarId.put(hash, STACK_ID_COUNTER++);
        return " ; checkId id" + scopeToVarId.get(hash) + "";
    }

    private String createPushCall(int hash) {
        if(!scopeToVarId.containsKey(hash)) scopeToVarId.put(hash, STACK_ID_COUNTER++);
        String res = "let return_stat" + scopeToVarId.get(hash) + " = let id" + scopeToVarId.get(hash) + " = generateId () in pushId id" + scopeToVarId.get(hash) + " ; ";
        return res;
    }

    private String createPopCall(int hash) {
        if(!scopeToVarId.containsKey(hash)) scopeToVarId.put(hash, STACK_ID_COUNTER++);
        String str = " in popId () ; return_stat" + scopeToVarId.get(hash) + " ";
        // ensuring no ambiguous same name symbol in different scopes with unique id
        return str;
    }
}
