// $ANTLR 3.5.1 D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g 2022-08-30 21:06:17

package compiler.generated;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import javafx.util.Pair;
import compiler.objects.*;
import compiler.handlers.*;
import compiler.error.Error;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class UmlDesignerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "COMMA", "COMMENT", "DOUBLE_DOT", 
		"GREATER", "ID", "LESSER", "LP", "MINUS", "PLUS", "RP", "SCAN_ERROR", 
		"WS", "'/'", "'0..*'", "'0..1'", "'1'", "'1..*'", "'String'", "'abstractClass'", 
		"'boolean'", "'char'", "'class'", "'double'", "'endAbstractClass'", "'endClass'", 
		"'endInterface'", "'extends'", "'id'", "'implements'", "'int'", "'interface'", 
		"'methods'", "'params'", "'relations'"
	};
	public static final int EOF=-1;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int COLON=4;
	public static final int COMMA=5;
	public static final int COMMENT=6;
	public static final int DOUBLE_DOT=7;
	public static final int GREATER=8;
	public static final int ID=9;
	public static final int LESSER=10;
	public static final int LP=11;
	public static final int MINUS=12;
	public static final int PLUS=13;
	public static final int RP=14;
	public static final int SCAN_ERROR=15;
	public static final int WS=16;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public UmlDesignerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public UmlDesignerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return UmlDesignerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g"; }


	    UmlHandler h;
	    
	    void setUp() {
	    	h = new UmlHandler();
	    }
		
	    public UmlDesignerParser(FileReader fileIn) throws 
			FileNotFoundException, IOException {
		this(new CommonTokenStream(
				new UmlDesignerLexer(
					new ANTLRReaderStream(
					 fileIn
					 ))));
	     }
	     
	    public UmlDesignerParser(String input) throws
	            FileNotFoundException, IOException {
	        this(new CommonTokenStream(
	                new UmlDesignerLexer(
	                        new ANTLRReaderStream(
	                                new StringReader(input)
	                        ))));
	    }
	    
	    // Per gestire gli errori da GUI
	    @Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	        String hdr = " * " + getErrorHeader(e);
	        String msg = " - " + getErrorMessage(e, tokenNames);
	        Token tk = input.LT(1);
	        h.handleError(tokenNames, e, hdr, msg);
	    }
	    
	    public List<Error> getErrorList () {
	    	return h.getErrorList();
	    }



	// $ANTLR start "initUml"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:69:1: initUml : ( abstractClassDefinition | classDefinition | interfaceDefinition )+ ;
	public final void initUml() throws RecognitionException {
		 setUp(); 
		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:71:5: ( ( abstractClassDefinition | classDefinition | interfaceDefinition )+ )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:71:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )+
			{
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:71:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case 23:
					{
					alt1=1;
					}
					break;
				case 26:
					{
					alt1=2;
					}
					break;
				case 35:
					{
					alt1=3;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:71:8: abstractClassDefinition
					{
					pushFollow(FOLLOW_abstractClassDefinition_in_initUml73);
					abstractClassDefinition();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:71:34: classDefinition
					{
					pushFollow(FOLLOW_classDefinition_in_initUml77);
					classDefinition();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:71:52: interfaceDefinition
					{
					pushFollow(FOLLOW_interfaceDefinition_in_initUml81);
					interfaceDefinition();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 h.setUpRelations(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "initUml"



	// $ANTLR start "classDefinition"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:74:1: classDefinition : 'class' 'id' COLON i= ID classValues[$i] 'endClass' ;
	public final void classDefinition() throws RecognitionException {
		Token i=null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:75:5: ( 'class' 'id' COLON i= ID classValues[$i] 'endClass' )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:75:8: 'class' 'id' COLON i= ID classValues[$i] 'endClass'
			{
			match(input,26,FOLLOW_26_in_classDefinition107); 
			match(input,32,FOLLOW_32_in_classDefinition117); 
			match(input,COLON,FOLLOW_COLON_in_classDefinition119); 
			i=(Token)match(input,ID,FOLLOW_ID_in_classDefinition125); 
			 h.createNewClass(i); 
			pushFollow(FOLLOW_classValues_in_classDefinition134);
			classValues(i);
			state._fsp--;

			match(input,29,FOLLOW_29_in_classDefinition144); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classDefinition"



	// $ANTLR start "abstractClassDefinition"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:81:1: abstractClassDefinition : 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass' ;
	public final void abstractClassDefinition() throws RecognitionException {
		Token i=null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:82:5: ( 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass' )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:82:8: 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass'
			{
			match(input,23,FOLLOW_23_in_abstractClassDefinition166); 
			match(input,32,FOLLOW_32_in_abstractClassDefinition175); 
			match(input,COLON,FOLLOW_COLON_in_abstractClassDefinition177); 
			i=(Token)match(input,ID,FOLLOW_ID_in_abstractClassDefinition183); 
			 h.createNewClass(i); 
			pushFollow(FOLLOW_classValues_in_abstractClassDefinition192);
			classValues(i);
			state._fsp--;

			match(input,28,FOLLOW_28_in_abstractClassDefinition202); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "abstractClassDefinition"



	// $ANTLR start "classValues"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:1: classValues[Token i] : ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= classRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )? ;
	public final void classValues(Token i) throws RecognitionException {
		List<String> ifs =null;
		List<String> c =null;
		List<Pair> cr =null;
		Param p =null;
		Method m =null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:89:5: ( ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= classRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )? )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:90:8: ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= classRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )?
			{
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:90:8: ( 'implements' COLON (ifs= interfaces )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==33) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:90:9: 'implements' COLON (ifs= interfaces )+
					{
					match(input,33,FOLLOW_33_in_classValues233); 
					match(input,COLON,FOLLOW_COLON_in_classValues235); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:90:28: (ifs= interfaces )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==ID) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:90:29: ifs= interfaces
							{
							pushFollow(FOLLOW_interfaces_in_classValues242);
							ifs=interfaces();
							state._fsp--;

							 h.addImplementation(i, ifs); 
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					}
					break;

			}

			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:91:8: ( 'extends' COLON (c= classes )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==31) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:91:9: 'extends' COLON (c= classes )+
					{
					match(input,31,FOLLOW_31_in_classValues259); 
					match(input,COLON,FOLLOW_COLON_in_classValues261); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:91:25: (c= classes )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:91:26: c= classes
							{
							pushFollow(FOLLOW_classes_in_classValues268);
							c=classes();
							state._fsp--;

							 h.addExtension(i, c); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;

			}

			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:92:8: ( 'relations' COLON (cr= classRelations )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==38) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:92:9: 'relations' COLON (cr= classRelations )+
					{
					match(input,38,FOLLOW_38_in_classValues285); 
					match(input,COLON,FOLLOW_COLON_in_classValues287); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:92:27: (cr= classRelations )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:92:28: cr= classRelations
							{
							pushFollow(FOLLOW_classRelations_in_classValues294);
							cr=classRelations();
							state._fsp--;

							 h.addRelations(i, cr); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

			}

			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:8: ( 'params' COLON (p= classParameters )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==37) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:9: 'params' COLON (p= classParameters )+
					{
					match(input,37,FOLLOW_37_in_classValues310); 
					match(input,COLON,FOLLOW_COLON_in_classValues312); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:25: (p= classParameters )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= MINUS && LA8_0 <= PLUS)) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:26: p= classParameters
							{
							pushFollow(FOLLOW_classParameters_in_classValues320);
							p=classParameters();
							state._fsp--;

							 h.addParams(i, p); 
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					}
					break;

			}

			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:94:8: ( 'methods' COLON (m= classMethods )+ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==36) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:94:9: 'methods' COLON (m= classMethods )+
					{
					match(input,36,FOLLOW_36_in_classValues336); 
					match(input,COLON,FOLLOW_COLON_in_classValues338); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:94:25: (m= classMethods )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= MINUS && LA10_0 <= PLUS)) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:94:26: m= classMethods
							{
							pushFollow(FOLLOW_classMethods_in_classValues345);
							m=classMethods();
							state._fsp--;

							 h.addMethod(i, m); 
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classValues"



	// $ANTLR start "interfaces"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:1: interfaces returns [List<String> ifList] : i= ID ( COMMA i1= ID )* ;
	public final List<String> interfaces() throws RecognitionException {
		List<String> ifList = null;


		Token i=null;
		Token i1=null;

		 ifList = new ArrayList<String>(); 
		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:99:5: (i= ID ( COMMA i1= ID )* )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:99:9: i= ID ( COMMA i1= ID )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaces392); 
			 ifList.add(i.getText());  
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:100:9: ( COMMA i1= ID )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:100:10: COMMA i1= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaces407); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_interfaces413); 
					 ifList.add(i1.getText()); 
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ifList;
	}
	// $ANTLR end "interfaces"



	// $ANTLR start "classes"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:103:1: classes returns [List<String> classList] : i= ID ( COMMA i1= ID )* ;
	public final List<String> classes() throws RecognitionException {
		List<String> classList = null;


		Token i=null;
		Token i1=null;

		 classList = new ArrayList<String>(); 
		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:105:5: (i= ID ( COMMA i1= ID )* )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:105:8: i= ID ( COMMA i1= ID )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_classes449); 
			 classList.add(i.getText()) ; 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:106:7: ( COMMA i1= ID )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:106:8: COMMA i1= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_classes462); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_classes468); 
					 classList.add(i1.getText()); 
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return classList;
	}
	// $ANTLR end "classes"



	// $ANTLR start "classRelations"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:109:1: classRelations returns [List<Pair> classList] : i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )* ;
	public final List<Pair> classRelations() throws RecognitionException {
		List<Pair> classList = null;


		Token i=null;
		Token i1=null;
		Token c1 =null;
		Token c2 =null;
		Token c3 =null;
		Token c4 =null;

		 classList = new ArrayList<>(); 
		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:111:5: (i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )* )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:111:8: i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_classRelations510); 
			pushFollow(FOLLOW_cardinality_in_classRelations516);
			c1=cardinality();
			state._fsp--;

			match(input,17,FOLLOW_17_in_classRelations518); 
			pushFollow(FOLLOW_cardinality_in_classRelations524);
			c2=cardinality();
			state._fsp--;

			 classList.add(new Pair<>(i.getText(),  c1.getText() + '/' + c2.getText())); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:112:7: ( COMMA i1= ID c3= cardinality '/' c4= cardinality )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:112:8: COMMA i1= ID c3= cardinality '/' c4= cardinality
					{
					match(input,COMMA,FOLLOW_COMMA_in_classRelations543); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_classRelations549); 
					pushFollow(FOLLOW_cardinality_in_classRelations555);
					c3=cardinality();
					state._fsp--;

					match(input,17,FOLLOW_17_in_classRelations557); 
					pushFollow(FOLLOW_cardinality_in_classRelations563);
					c4=cardinality();
					state._fsp--;

					 classList.add(new Pair<>(i1.getText(),  c3.getText() + '/' + c4.getText())); 
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return classList;
	}
	// $ANTLR end "classRelations"



	// $ANTLR start "classParameters"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:115:1: classParameters returns [Param ip] : visibility i= ID ( COLON t= type ) ;
	public final Param classParameters() throws RecognitionException {
		Param ip = null;


		Token i=null;
		String t =null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:116:5: ( visibility i= ID ( COLON t= type ) )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:116:7: visibility i= ID ( COLON t= type )
			{
			pushFollow(FOLLOW_visibility_in_classParameters593);
			visibility();
			state._fsp--;

			i=(Token)match(input,ID,FOLLOW_ID_in_classParameters599); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:116:25: ( COLON t= type )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:116:26: COLON t= type
			{
			match(input,COLON,FOLLOW_COLON_in_classParameters602); 
			pushFollow(FOLLOW_type_in_classParameters608);
			t=type();
			state._fsp--;

			}

			 ip = h.returnParam(i.getText(), t); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ip;
	}
	// $ANTLR end "classParameters"



	// $ANTLR start "classMethods"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:119:1: classMethods returns [Method im] : v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )? ;
	public final Method classMethods() throws RecognitionException {
		Method im = null;


		Token i=null;
		Token v =null;
		List<MethodParam> p =null;
		String t =null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:120:5: (v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )? )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:120:7: v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )?
			{
			pushFollow(FOLLOW_visibility_in_classMethods636);
			v=visibility();
			state._fsp--;

			i=(Token)match(input,ID,FOLLOW_ID_in_classMethods642); 
			match(input,LP,FOLLOW_LP_in_classMethods644); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:120:34: (p= methodParams )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:120:34: p= methodParams
					{
					pushFollow(FOLLOW_methodParams_in_classMethods650);
					p=methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_classMethods653); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:120:53: ( COLON t= type )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==COLON) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:120:54: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_classMethods656); 
					pushFollow(FOLLOW_type_in_classMethods662);
					t=type();
					state._fsp--;

					}
					break;

			}

			 im = h.returnMethod(v, i, t, p); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return im;
	}
	// $ANTLR end "classMethods"



	// $ANTLR start "interfaceDefinition"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:123:1: interfaceDefinition : 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' ;
	public final void interfaceDefinition() throws RecognitionException {
		Token i=null;
		Param p =null;
		Method m =null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:124:5: ( 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:124:8: 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface'
			{
			match(input,35,FOLLOW_35_in_interfaceDefinition684); 
			match(input,32,FOLLOW_32_in_interfaceDefinition693); 
			match(input,COLON,FOLLOW_COLON_in_interfaceDefinition695); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceDefinition701); 
			 h.createNewInterface(i); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:126:8: ( 'params' COLON (p= interfaceParams )+ )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==37) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:126:9: 'params' COLON (p= interfaceParams )+
					{
					match(input,37,FOLLOW_37_in_interfaceDefinition713); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition715); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:126:25: (p= interfaceParams )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==PLUS) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:126:26: p= interfaceParams
							{
							pushFollow(FOLLOW_interfaceParams_in_interfaceDefinition723);
							p=interfaceParams();
							state._fsp--;

							 h.addParams(i, p); 
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					}
					break;

			}

			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:127:8: ( 'methods' COLON (m= interfaceMethods )+ )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==36) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:127:9: 'methods' COLON (m= interfaceMethods )+
					{
					match(input,36,FOLLOW_36_in_interfaceDefinition742); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition744); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:127:25: (m= interfaceMethods )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==PLUS) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:127:26: m= interfaceMethods
							{
							pushFollow(FOLLOW_interfaceMethods_in_interfaceDefinition751);
							m=interfaceMethods();
							state._fsp--;

							 h.addMethod(i, m); 
							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					}
					break;

			}

			match(input,30,FOLLOW_30_in_interfaceDefinition768); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interfaceDefinition"



	// $ANTLR start "interfaceParams"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:131:1: interfaceParams returns [Param ip] : PLUS i= ID COLON t= type ;
	public final Param interfaceParams() throws RecognitionException {
		Param ip = null;


		Token i=null;
		String t =null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:132:5: ( PLUS i= ID COLON t= type )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:132:8: PLUS i= ID COLON t= type
			{
			match(input,PLUS,FOLLOW_PLUS_in_interfaceParams794); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceParams800); 
			match(input,COLON,FOLLOW_COLON_in_interfaceParams802); 
			pushFollow(FOLLOW_type_in_interfaceParams808);
			t=type();
			state._fsp--;

			 ip = h.returnParam(i.getText(), t); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ip;
	}
	// $ANTLR end "interfaceParams"



	// $ANTLR start "interfaceMethods"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:135:1: interfaceMethods returns [Method im] : v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? ;
	public final Method interfaceMethods() throws RecognitionException {
		Method im = null;


		Token v=null;
		Token i=null;
		List<MethodParam> p =null;
		String t =null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:5: (v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:8: v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )?
			{
			v=(Token)match(input,PLUS,FOLLOW_PLUS_in_interfaceMethods840); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceMethods846); 
			match(input,LP,FOLLOW_LP_in_interfaceMethods848); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:29: (p= methodParams )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ID) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:29: p= methodParams
					{
					pushFollow(FOLLOW_methodParams_in_interfaceMethods854);
					p=methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_interfaceMethods857); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:48: ( COLON t= type )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==COLON) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:49: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_interfaceMethods860); 
					pushFollow(FOLLOW_type_in_interfaceMethods866);
					t=type();
					state._fsp--;

					}
					break;

			}

			 im = h.returnMethod(v, i, t, p); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return im;
	}
	// $ANTLR end "interfaceMethods"



	// $ANTLR start "methodParams"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:139:1: methodParams returns [List<MethodParam> imp] : i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* ;
	public final List<MethodParam> methodParams() throws RecognitionException {
		List<MethodParam> imp = null;


		Token i1=null;
		Token i2=null;
		String t1 =null;
		String t2 =null;

		 imp = new ArrayList<MethodParam>(); 
		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:5: (i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:9: i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )*
			{
			i1=(Token)match(input,ID,FOLLOW_ID_in_methodParams902); 
			match(input,COLON,FOLLOW_COLON_in_methodParams904); 
			pushFollow(FOLLOW_type_in_methodParams910);
			t1=type();
			state._fsp--;

			 h.addMethodParam(imp, i1.getText(), t1); 
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:142:8: ( COMMA i2= ID COLON t2= type )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:142:9: COMMA i2= ID COLON t2= type
					{
					match(input,COMMA,FOLLOW_COMMA_in_methodParams928); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_methodParams934); 
					match(input,COLON,FOLLOW_COLON_in_methodParams936); 
					pushFollow(FOLLOW_type_in_methodParams942);
					t2=type();
					state._fsp--;

					 h.addMethodParam(imp, i2.getText(), t2); 
					}
					break;

				default :
					break loop23;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return imp;
	}
	// $ANTLR end "methodParams"



	// $ANTLR start "visibility"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:145:1: visibility returns [Token t] : (x= PLUS |x= MINUS ) ;
	public final Token visibility() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:146:5: ( (x= PLUS |x= MINUS ) )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:146:7: (x= PLUS |x= MINUS )
			{
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:146:7: (x= PLUS |x= MINUS )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==PLUS) ) {
				alt24=1;
			}
			else if ( (LA24_0==MINUS) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:146:8: x= PLUS
					{
					x=(Token)match(input,PLUS,FOLLOW_PLUS_in_visibility980); 
					}
					break;
				case 2 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:146:19: x= MINUS
					{
					x=(Token)match(input,MINUS,FOLLOW_MINUS_in_visibility988); 
					}
					break;

			}

			 t = x; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "visibility"



	// $ANTLR start "cardinality"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:149:1: cardinality returns [Token t] : (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' ) ;
	public final Token cardinality() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:150:5: ( (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' ) )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:150:7: (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' )
			{
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:150:7: (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' )
			int alt25=4;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt25=1;
				}
				break;
			case 20:
				{
				alt25=2;
				}
				break;
			case 18:
				{
				alt25=3;
				}
				break;
			case 21:
				{
				alt25=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:150:8: x= '0..1'
					{
					x=(Token)match(input,19,FOLLOW_19_in_cardinality1021); 
					}
					break;
				case 2 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:151:7: x= '1'
					{
					x=(Token)match(input,20,FOLLOW_20_in_cardinality1034); 
					}
					break;
				case 3 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:152:7: x= '0..*'
					{
					x=(Token)match(input,18,FOLLOW_18_in_cardinality1047); 
					}
					break;
				case 4 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:153:7: x= '1..*'
					{
					x=(Token)match(input,21,FOLLOW_21_in_cardinality1060); 
					}
					break;

			}

			 t = x; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "cardinality"



	// $ANTLR start "type"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:157:1: type returns [String t] : ( (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' ) |x= ID (gen= generics )? );
	public final String type() throws RecognitionException {
		String t = null;


		Token x=null;
		String gen =null;

		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:158:3: ( (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' ) |x= ID (gen= generics )? )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==22||(LA28_0 >= 24 && LA28_0 <= 25)||LA28_0==27||LA28_0==34) ) {
				alt28=1;
			}
			else if ( (LA28_0==ID) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:158:5: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' )
					{
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:158:5: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' )
					int alt26=5;
					switch ( input.LA(1) ) {
					case 34:
						{
						alt26=1;
						}
						break;
					case 27:
						{
						alt26=2;
						}
						break;
					case 25:
						{
						alt26=3;
						}
						break;
					case 24:
						{
						alt26=4;
						}
						break;
					case 22:
						{
						alt26=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}
					switch (alt26) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:158:7: x= 'int'
							{
							x=(Token)match(input,34,FOLLOW_34_in_type1096); 
							}
							break;
						case 2 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:159:5: x= 'double'
							{
							x=(Token)match(input,27,FOLLOW_27_in_type1108); 
							}
							break;
						case 3 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:160:5: x= 'char'
							{
							x=(Token)match(input,25,FOLLOW_25_in_type1119); 
							}
							break;
						case 4 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:161:5: x= 'boolean'
							{
							x=(Token)match(input,24,FOLLOW_24_in_type1130); 
							}
							break;
						case 5 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:162:5: x= 'String'
							{
							x=(Token)match(input,22,FOLLOW_22_in_type1141); 
							}
							break;

					}

					 t = x.getText(); 
					}
					break;
				case 2 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:163:5: x= ID (gen= generics )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_type1155); 
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:163:16: (gen= generics )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==LESSER) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:163:16: gen= generics
							{
							pushFollow(FOLLOW_generics_in_type1161);
							gen=generics();
							state._fsp--;

							}
							break;

					}

					 t = gen == null ? x.getText() : x.getText() + gen;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "type"



	// $ANTLR start "generics"
	// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:166:1: generics returns [String s] : LESSER t= type ( COMMA t1= type )* GREATER ;
	public final String generics() throws RecognitionException {
		String s = null;


		String t =null;
		String t1 =null;

		 String generics = ""; 
		try {
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:168:3: ( LESSER t= type ( COMMA t1= type )* GREATER )
			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:168:5: LESSER t= type ( COMMA t1= type )* GREATER
			{
			match(input,LESSER,FOLLOW_LESSER_in_generics1188); 
			pushFollow(FOLLOW_type_in_generics1194);
			t=type();
			state._fsp--;

			// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:168:21: ( COMMA t1= type )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMMA) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Programming\\Universit�\\UMLDesigner\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:168:22: COMMA t1= type
					{
					match(input,COMMA,FOLLOW_COMMA_in_generics1197); 
					pushFollow(FOLLOW_type_in_generics1203);
					t1=type();
					state._fsp--;

					 generics += "," + t1; 
					}
					break;

				default :
					break loop29;
				}
			}

			match(input,GREATER,FOLLOW_GREATER_in_generics1209); 
			 s = "<" + t + generics + ">"; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "generics"

	// Delegated rules



	public static final BitSet FOLLOW_abstractClassDefinition_in_initUml73 = new BitSet(new long[]{0x0000000804800002L});
	public static final BitSet FOLLOW_classDefinition_in_initUml77 = new BitSet(new long[]{0x0000000804800002L});
	public static final BitSet FOLLOW_interfaceDefinition_in_initUml81 = new BitSet(new long[]{0x0000000804800002L});
	public static final BitSet FOLLOW_26_in_classDefinition107 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_classDefinition117 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classDefinition119 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classDefinition125 = new BitSet(new long[]{0x00000072A0000000L});
	public static final BitSet FOLLOW_classValues_in_classDefinition134 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_classDefinition144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_abstractClassDefinition166 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_abstractClassDefinition175 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_abstractClassDefinition177 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_abstractClassDefinition183 = new BitSet(new long[]{0x0000007290000000L});
	public static final BitSet FOLLOW_classValues_in_abstractClassDefinition192 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_abstractClassDefinition202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_classValues233 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues235 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_interfaces_in_classValues242 = new BitSet(new long[]{0x0000007080000202L});
	public static final BitSet FOLLOW_31_in_classValues259 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues261 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_classes_in_classValues268 = new BitSet(new long[]{0x0000007000000202L});
	public static final BitSet FOLLOW_38_in_classValues285 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues287 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_classRelations_in_classValues294 = new BitSet(new long[]{0x0000003000000202L});
	public static final BitSet FOLLOW_37_in_classValues310 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues312 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_classParameters_in_classValues320 = new BitSet(new long[]{0x0000001000003002L});
	public static final BitSet FOLLOW_36_in_classValues336 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues338 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_classMethods_in_classValues345 = new BitSet(new long[]{0x0000000000003002L});
	public static final BitSet FOLLOW_ID_in_interfaces392 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_interfaces407 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaces413 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ID_in_classes449 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_classes462 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classes468 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ID_in_classRelations510 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations516 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_classRelations518 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations524 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_classRelations543 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classRelations549 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations555 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_classRelations557 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations563 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_visibility_in_classParameters593 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classParameters599 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classParameters602 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_classParameters608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibility_in_classMethods636 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classMethods642 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_LP_in_classMethods644 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_methodParams_in_classMethods650 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_RP_in_classMethods653 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COLON_in_classMethods656 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_classMethods662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_interfaceDefinition684 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_interfaceDefinition693 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition695 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaceDefinition701 = new BitSet(new long[]{0x0000003040000000L});
	public static final BitSet FOLLOW_37_in_interfaceDefinition713 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition715 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_interfaceParams_in_interfaceDefinition723 = new BitSet(new long[]{0x0000001040002000L});
	public static final BitSet FOLLOW_36_in_interfaceDefinition742 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition744 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_interfaceMethods_in_interfaceDefinition751 = new BitSet(new long[]{0x0000000040002000L});
	public static final BitSet FOLLOW_30_in_interfaceDefinition768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_interfaceParams794 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaceParams800 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceParams802 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_interfaceParams808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_interfaceMethods840 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaceMethods846 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_LP_in_interfaceMethods848 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_methodParams_in_interfaceMethods854 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_RP_in_interfaceMethods857 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COLON_in_interfaceMethods860 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_interfaceMethods866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodParams902 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_methodParams904 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_methodParams910 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_methodParams928 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_methodParams934 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_methodParams936 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_methodParams942 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_PLUS_in_visibility980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_visibility988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_cardinality1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_cardinality1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_cardinality1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_cardinality1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_type1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_type1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_type1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_type1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_type1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type1155 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_generics_in_type1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_generics1188 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_generics1194 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_generics1197 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_generics1203 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_GREATER_in_generics1209 = new BitSet(new long[]{0x0000000000000002L});
}
