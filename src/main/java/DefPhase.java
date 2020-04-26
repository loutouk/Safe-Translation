/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends RefMLBaseListener {

    private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    private  GlobalScope globals;
    private  Scope currentScope; // define symbols in this scope

    public GlobalScope getGlobals() {
        return globals;
    }

    public ParseTreeProperty<Scope> getScopes() {
        return scopes;
    }

    @Override
    public void enterProgram(RefMLParser.ProgramContext ctx) {
        globals = new GlobalScope();
        currentScope = globals;
    }

    @Override
    public void exitProgram(RefMLParser.ProgramContext ctx) {
        //System.out.println("GLOBLS: " + globals);
    }

    @Override
    public void enterVarDeclIn(RefMLParser.VarDeclInContext ctx) {
        // push new local scope
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    @Override
    public void enterFunDeclIn(RefMLParser.FunDeclInContext ctx) {
        // push new local scope
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitFormalParameter(RefMLParser.FormalParameterContext ctx) {
        defineVar(ctx.ID().getSymbol(), Type.SymbolType.FUN_ARG);
    }


    @Override public void exitVarDecl(RefMLParser.VarDeclContext ctx) {
        defineVar(ctx.ID().getSymbol(), Type.SymbolType.VAR);
    }

    @Override public void exitVarDeclIn(RefMLParser.VarDeclInContext ctx) {
        defineVar(ctx.ID().getSymbol(), Type.SymbolType.VAR);
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }

    @Override public void exitFunDecl(RefMLParser.FunDeclContext ctx) {
        defineVar(ctx.ID().getSymbol(), Type.SymbolType.VAR);
    }

    @Override public void exitFunDeclIn(RefMLParser.FunDeclInContext ctx) {
        defineVar(ctx.ID().getSymbol(), Type.SymbolType.VAR);
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }

    void defineVar(Token nameToken, Type.SymbolType type) {
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var); // Define symbol in current scope
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }
}