package compiler;

import compiler.generated.UmlDesignerParser;
import org.antlr.runtime.CommonTokenStream;

public class Parser {
    static UmlDesignerParser parser;

    public static StringBuffer sb = new StringBuffer();

    public static void doParsing(String input) {
        sb.delete(0, sb.length());

        try {
            parser = new UmlDesignerParser(input);
            parser.initUml();
        } catch (Exception e) {
            sb.append(e.getMessage());
            sb.append("\n");
        }

        if (sb.isEmpty()) {
            sb.append("Tutto ok! \n");
        } else {
            sb.insert(0, "Compilazione terminata con errori: \n");
        }
    }
}
