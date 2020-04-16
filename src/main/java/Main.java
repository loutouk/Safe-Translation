import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/main/examples/examplePrime";
        if ( args.length>0 ) inputFile = args[0];
        translate(inputFile);
    }

    public static void translate(String inputFile) {
        try {
            CharStream input = CharStreams.fromFileName(inputFile);

            MyLangLexer lexer = new MyLangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyLangParser parser = new MyLangParser(tokens);
            ParseTree tree = parser.program(); // parse with the start symbol first rule

            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
            Translator extractor = new Translator(tokens);
            walker.walk(extractor, tree); // initiate walk of tree with listener

            // print back ALTERED stream
            System.out.println(extractor.rewriter.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void visit(String inputFile){
        try {
            CharStream input = CharStreams.fromFileName(inputFile);
            MyLangLexer lexer = new MyLangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyLangParser parser = new MyLangParser(tokens);
            ParseTree tree = parser.program(); // parse

            CustomVisitor eval = new CustomVisitor();
            eval.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
