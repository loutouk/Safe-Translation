import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashSet;

public class RefPhase extends RefMLBaseListener {

    private static final String PUSH_CALL  = "let id = generateId{} in pushId{id} ; ";
    private static final String POP_CALL   = " ; popId{} ";
    private static final String CHECK_CALL = " ; checkId{id}";
    private static final String INIT_PILE  =
            "let pile = ref [] ;\n" +
            "let id = ref 0 ;\n" +
            "let generateId -> let x = !id in id := !id + 1 ; x ;\n" +
            "let pushId id -> pile := id::!pile ;\n" +
            "let popId -> pile := pop !pile ;\n" +
            "let checkId id -> if peek !pile = id then raise{} else () ;\n\n";

    private ParseTreeProperty<Scope> scopes;
    private GlobalScope globals;
    private Scope currentScope; // resolve symbols starting in this scope
    private TokenStreamRewriter rewriter;
    private HashSet<Scope> editedScopes = new HashSet<Scope>(); // stores scopes for which push and pop fun have been added

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
    public void enterFunctionDecl(RefMLParser.FunctionDeclContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void exitFunctionDecl(RefMLParser.FunctionDeclContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterInStat(RefMLParser.InStatContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void exitInStat(RefMLParser.InStatContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitVar(RefMLParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            CheckSymbols.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
            CheckSymbols.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
    }

    @Override
    public void exitCall(RefMLParser.CallContext ctx) {
        String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if ( meth==null ) {
            // we consider that library calls (free variable) must be defined (declared or received as func parameter)
            // otherwise, it should be an error (uninitialized variable)
            CheckSymbols.error(ctx.ID().getSymbol(), "no such function: "+funcName);
        }
        if ( meth instanceof VariableSymbol ) {
            // we detect a free variable, this is where we need to do a translation

            // move up to the context with the parent scope because this is where we want to add our custom functions
            // pushId at the beginning and popId at the end
            // checkId just after the each external function call

            ParserRuleContext ctxBrowser = ctx;
            Scope scopeBrowser = scopes.get(ctx);
            while(scopeBrowser==scopes.get(ctx)){
                ctxBrowser = ctxBrowser.getParent();
                scopeBrowser=scopes.get(ctxBrowser);
            }

            switch (ctxBrowser.getRuleIndex()){

                case RefMLParser.RULE_functionDecl:
                    CheckSymbols.message(ctx.ID().getSymbol(),
                            funcName+" evaluated as a free variable (func) inside a function declaration");
                    RefMLParser.FunctionDeclContext funCxt =  (RefMLParser.FunctionDeclContext) ctxBrowser;

                    rewriter.insertAfter(ctx.RCUR().getSymbol().getTokenIndex(), CHECK_CALL);
                    if(editedScopes.add(scopeBrowser)){
                        rewriter.insertAfter(funCxt.statement().start.getTokenIndex()-1, PUSH_CALL);
                        rewriter.insertAfter(funCxt.statement().stop.getTokenIndex(), POP_CALL);
                    }

                    break;

                case RefMLParser.RULE_statement:

                    CheckSymbols.message(ctx.ID().getSymbol(),
                            funcName+" evaluated as a free variable (func) inside a simple statement");
                    RefMLParser.StatementContext statCxt =  (RefMLParser.StatementContext) ctxBrowser;

                    rewriter.insertAfter(ctx.RCUR().getSymbol().getTokenIndex(), CHECK_CALL);
                    if(editedScopes.add(scopeBrowser)){
                        rewriter.insertAfter(statCxt.getStart().getTokenIndex()-1, PUSH_CALL);
                        rewriter.insertAfter(statCxt.getStop().getTokenIndex()+1, POP_CALL);
                        // TODO fix the hack
                        /*uses getTokenIndex()+1 to have the check() before the pop()
                        but this may lead to have the pop in the wrong place
                        should use getTokenIndex()
                        solution: place the check in the first pass and the pop() and push() in a second?*/
                    }

                    break;

                default:
                    System.err.println("context containing the free variable can not be handled (rule num. " + ctxBrowser.getRuleIndex() + ")");
                    break;
            }
        }


    }
}
