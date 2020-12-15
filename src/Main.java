import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;



public class Main {
    public static void main(String[] args )
    {
        try {
            tpCGSLexer lexer = new tpCGSLexer(CharStreams.fromFileName("GCS_Project/src/test.txt"));
            CommonTokenStream stream = new CommonTokenStream(lexer);
            tpCGSParser parser = new tpCGSParser(stream);
            parser.main();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

