package compiler;

import compiler.generated.UmlDesignerParser;
import org.antlr.runtime.CommonTokenStream;

public class Parser {
    static UmlDesignerParser parser;

    public static StringBuffer sb = new StringBuffer();

    public static void doParsing(String input) {
        sb.delete(0, sb.length());

        try {
            sb.append("Parsing con ANTLR lexer\n");
            sb.append("-----------------------\n");
            parser = new UmlDesignerParser(input);
            parser.initUml();
            sb.append("Parsing terminato correttamente\n");
        } catch (Exception e) {
            sb.append("Parsing con ANTLR abortito\n");
            sb.append(e.getMessage());
            sb.append("\n");
        }
    }
}
