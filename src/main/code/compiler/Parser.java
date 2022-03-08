package compiler;

import compiler.generated.UmlDesignerParser;
import org.antlr.runtime.CommonTokenStream;

public class Parser {
	static UmlDesignerParser parser;

	public static void doParsing(String input) {
		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");
			parser = new UmlDesignerParser(input);
			parser.initUml();
			System.out.println ("Parsing terminato correttamente");
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
		System.out.println ("");
	}
}
