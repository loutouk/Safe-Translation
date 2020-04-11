/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class PileInitializer extends MyLangBaseListener {
    TokenStreamRewriter rewriter;

    public PileInitializer(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override public void enterProgram(MyLangParser.ProgramContext ctx) { 
    	String field = "\nlet pile = [] ; ";
        rewriter.insertBefore(ctx.start, field);
    }

}