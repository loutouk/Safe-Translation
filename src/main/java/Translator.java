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
import org.antlr.v4.runtime.tree.ParseTree;

public class Translator extends MyLangBaseListener {
    TokenStreamRewriter rewriter;

    public Translator(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterProgram(MyLangParser.ProgramContext ctx) {
    	String statement = "\nlet pile = [] ; ";
        rewriter.insertBefore(ctx.start, statement);
    }

    @Override
    public void enterApplication(MyLangParser.ApplicationContext ctx) {
        String checkId = " ; checkId()";
        rewriter.insertAfter(ctx.stop, checkId);
    }

    @Override
    public void exitLetIn(MyLangParser.LetInContext ctx) {

        // sets the pop at the end
        String popId = " ; popId()";

        // sets the push at the beginning, depending on the term structure
        String pushId = "pushId() ; ";

        ParseTree inStatement = ctx.term().get(1);

        // case in fun a b c -> expression
        if(inStatement.getChild(0).getText().equals("fun")){
            // write the push call just after the ->
            for(int i=1 ; i<inStatement.getChildCount() ; i++){
                if(inStatement.getChild(i).getText().equals("->")) {
                    rewriter.insertBefore(inStatement.getChild(i+1).getSourceInterval().a, pushId);
                    rewriter.insertAfter(inStatement.getChild(inStatement.getChildCount()-1).getSourceInterval().b, popId);
                }
            }
        }
        else {
            boolean equalsExpr=false;
            for(int i=0 ; i<inStatement.getChildCount() ; i++){
                // let identifier a b c = expression
                if(inStatement.getChild(i).getText().equals("=")) {
                    equalsExpr=true;
                    rewriter.insertBefore(inStatement.getChild(i+1).getSourceInterval().a, pushId);
                    rewriter.insertAfter(inStatement.getChild(inStatement.getChildCount()-1).getSourceInterval().b, popId);
                }
            }

            // other simple in expression
            if(!equalsExpr){
                rewriter.insertBefore(inStatement.getChild(0).getSourceInterval().a, pushId);
                rewriter.insertAfter(inStatement.getChild(inStatement.getChildCount()-1).getSourceInterval().b, popId);
            }
        }
        // other cases (simple expression)
        // do nothing?


    }
}