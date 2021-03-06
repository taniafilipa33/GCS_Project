import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;



public class Main {
    public static void main(String[] args )
    {
        try {
            tpCGSLexer lexer = new tpCGSLexer(CharStreams.fromFileName("GCS_Project/src/test2.txt"));
            CommonTokenStream stream = new CommonTokenStream(lexer);
            tpCGSParser parser = new tpCGSParser(stream);
            parser.sistema();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

