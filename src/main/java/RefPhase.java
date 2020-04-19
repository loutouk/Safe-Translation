import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class RefPhase extends RefMLBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }

    @Override
    public void enterProgram(RefMLParser.ProgramContext ctx) {
        currentScope = globals;
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
            CheckSymbols.error(ctx.ID().getSymbol(), funcName+" evaluated as a free variable (func)");

            // move up to the context with the parent scope because this is where we want to add our custom functions
            // pushId at the beginning and popId at the end
            // checkId just after the function call

            ParserRuleContext ctxBrowser = ctx;
            Scope scopeBrowser = scopes.get(ctx);
            while(scopeBrowser==scopes.get(ctx)){
                ctxBrowser = ctxBrowser.getParent();
                scopeBrowser=scopes.get(ctxBrowser);
            }

            switch (ctxBrowser.getRuleIndex()){
                case RefMLParser.RULE_functionDecl:
                    System.err.println("inside a function declaration");
                    RefMLParser.FunctionDeclContext funCxt =  (RefMLParser.FunctionDeclContext) ctxBrowser;
                    System.out.println(funCxt.statement().start.getStartIndex());
                    System.out.println(funCxt.statement().stop.getStopIndex());
                    break;
                case RefMLParser.RULE_varDecl:
                    System.err.println("inside a variable declaration (not implemented yet)");
                    break;
                case RefMLParser.RULE_statement:
                    System.err.println("in a simple statement");
                    RefMLParser.StatementContext statCxt =  (RefMLParser.StatementContext) ctxBrowser;
                    System.out.println(statCxt.start.getStartIndex());
                    System.out.println(statCxt.stop.getStopIndex());
                    break;
                default:
                    System.err.println("context containing the free variable can not be handled (rule num. " + ctxBrowser.getRuleIndex() + ")");
                    break;
            }
        }


    }
}
