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
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope

    @Override
    public void enterProgram(RefMLParser.ProgramContext ctx) {
        globals = new GlobalScope();
        currentScope = globals;
    }

    @Override
    public void exitProgram(RefMLParser.ProgramContext ctx) {
        System.out.println("GLOBLS: " + globals);
    }

    @Override
    public void enterFunctionDecl(RefMLParser.FunctionDeclContext ctx) {
        String name = ctx.ID().getText();
        // push new scope by making new one that points to enclosing scope
        FunctionSymbol function = new FunctionSymbol(name, currentScope);
        currentScope.define(function); // Define function in current scope
        saveScope(ctx, function);      // Push: set function's parent to current
        currentScope = function;       // Current scope is now function scope
    }

    @Override
    public void exitFunctionDecl(RefMLParser.FunctionDeclContext ctx) {
        System.out.println("LOCALS: " + currentScope);
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }

    @Override
    public void enterInStat(RefMLParser.InStatContext ctx) {
        // push new local scope
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitInStat(RefMLParser.InStatContext ctx) {
        System.out.println("LOCALS: " + currentScope);
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }

    @Override
    public void exitFormalParameter(RefMLParser.FormalParameterContext ctx) {
        defineVar(ctx.ID().getSymbol());
    }

    @Override
    public void exitVarDecl(RefMLParser.VarDeclContext ctx) {
        defineVar(ctx.ID().getSymbol());
    }

    void defineVar(Token nameToken) {
        VariableSymbol var = new VariableSymbol(nameToken.getText());
        currentScope.define(var); // Define symbol in current scope
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }
}