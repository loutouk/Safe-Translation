/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

public class CheckSymbols {

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
    }

    public static void message(Token t, String msg) {
        System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
    }

    public void process(String[] args) throws Exception {
        String inputFile = "src/main/examples/fiboVulnerable";
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        CharStream input = CharStreams.fromStream(is);
        RefMLLexer lexer = new RefMLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RefMLParser parser = new RefMLParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        // show tree in text form
        // System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);

        // create next phase and feed symbol table info from def to ref phase
        RefPhase ref = new RefPhase(def.globals, def.scopes);
        walker.walk(ref, tree);
    }

    public static void main(String[] args) throws Exception {
        new CheckSymbols().process(args);
    }
}