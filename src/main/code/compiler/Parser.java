package compiler;

import compiler.generated.UmlDesignerParser;
import org.antlr.runtime.CommonTokenStream;

public class ParserTester  {
	static UmlDesignerParser parser;
  
	public static void main(String[] args) {
		CommonTokenStream tokens;
	  	String fileIn = ".\\src\\main\\resources\\input.file";
	  	String fileOut1 = ".\\src\\main\\resources\\parser.ANTLR.out.txt";
	  	String fileErr1 = ".\\src\\main\\resources\\parser.ANTLR.err.txt";

		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");
			parser = new UmlDesignerParser(fileIn);
			parser.initUml();
			System.out.println ("T'appost");
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

  }
}
