/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import java.util.HashMap;
import java.util.Map;

public class CustomVisitor extends MyLangBaseVisitor<Integer> {
    /** "memory" variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitApplication(MyLangParser.ApplicationContext ctx) {
        System.out.println("visit application");
        System.out.println(ctx.term().getText());
        System.out.println(ctx.simple_term().getText());


        return super.visitApplication(ctx);
    }
}