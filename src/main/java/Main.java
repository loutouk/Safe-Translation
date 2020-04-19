import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/main/examples/fibo";
        if ( args.length>0 ) inputFile = args[0];

        try {
            CharStream input = CharStreams.fromFileName(inputFile);

            RefMLLexer lexer = new RefMLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RefMLParser parser = new RefMLParser(tokens);
            ParseTree tree = parser.program(); // parse with the start symbol first rule

            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
            // TODO
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
