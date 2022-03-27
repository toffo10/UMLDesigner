// $ANTLR 3.5.1 D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g 2022-03-27 16:25:20

package compiler.generated;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import javafx.util.Pair;
import compiler.util.*;
import compiler.handlers.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class UmlDesignerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASTERISK", "COLON", "COMMA", 
		"COMMENT", "DOLLAR", "DOUBLE_DOT", "HASHTAG", "ID", "LP", "MINUS", "PLUS", 
		"RP", "SCAN_ERROR", "WS", "'/'", "'0..*'", "'0..1'", "'1'", "'1..*'", 
		"'String'", "'abstractClass'", "'boolean'", "'char'", "'class'", "'double'", 
		"'endAbstractClass'", "'endClass'", "'endInterface'", "'extends'", "'id'", 
		"'implements'", "'int'", "'interface'", "'methods'", "'params'", "'relations'"
	};
	public static final int EOF=-1;
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
	public static final int T__39=39;
	public static final int ASTERISK=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DOLLAR=8;
	public static final int DOUBLE_DOT=9;
	public static final int HASHTAG=10;
	public static final int ID=11;
	public static final int LP=12;
	public static final int MINUS=13;
	public static final int PLUS=14;
	public static final int RP=15;
	public static final int SCAN_ERROR=16;
	public static final int WS=17;

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
	@Override public String getGrammarFileName() { return "D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g"; }


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
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        throw new RuntimeException(hdr + ":" + msg);
	    }



	// $ANTLR start "initUml"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:63:1: initUml : ( abstractClassDefinition | classDefinition | interfaceDefinition )* ;
	public final void initUml() throws RecognitionException {
		 setUp(); 
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:5: ( ( abstractClassDefinition | classDefinition | interfaceDefinition )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )*
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )*
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case 24:
					{
					alt1=1;
					}
					break;
				case 27:
					{
					alt1=2;
					}
					break;
				case 36:
					{
					alt1=3;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:8: abstractClassDefinition
					{
					pushFollow(FOLLOW_abstractClassDefinition_in_initUml73);
					abstractClassDefinition();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:34: classDefinition
					{
					pushFollow(FOLLOW_classDefinition_in_initUml77);
					classDefinition();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:52: interfaceDefinition
					{
					pushFollow(FOLLOW_interfaceDefinition_in_initUml81);
					interfaceDefinition();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:68:1: classDefinition : 'class' 'id' COLON i= ID classValues[$i] 'endClass' ;
	public final void classDefinition() throws RecognitionException {
		Token i=null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:69:5: ( 'class' 'id' COLON i= ID classValues[$i] 'endClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:69:8: 'class' 'id' COLON i= ID classValues[$i] 'endClass'
			{
			match(input,27,FOLLOW_27_in_classDefinition107); 
			match(input,33,FOLLOW_33_in_classDefinition117); 
			match(input,COLON,FOLLOW_COLON_in_classDefinition119); 
			i=(Token)match(input,ID,FOLLOW_ID_in_classDefinition125); 
			 h.createNewClass(i); 
			pushFollow(FOLLOW_classValues_in_classDefinition134);
			classValues(i);
			state._fsp--;

			match(input,30,FOLLOW_30_in_classDefinition144); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:75:1: abstractClassDefinition : 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass' ;
	public final void abstractClassDefinition() throws RecognitionException {
		Token i=null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:77:5: ( 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:77:8: 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass'
			{
			match(input,24,FOLLOW_24_in_abstractClassDefinition167); 
			match(input,33,FOLLOW_33_in_abstractClassDefinition176); 
			match(input,COLON,FOLLOW_COLON_in_abstractClassDefinition178); 
			i=(Token)match(input,ID,FOLLOW_ID_in_abstractClassDefinition184); 
			 h.createNewClass(i); 
			pushFollow(FOLLOW_classValues_in_abstractClassDefinition193);
			classValues(i);
			state._fsp--;

			match(input,29,FOLLOW_29_in_abstractClassDefinition203); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:83:1: classValues[Token i] : ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= classRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )? ;
	public final void classValues(Token i) throws RecognitionException {
		List<String> ifs =null;
		List<String> c =null;
		List<Pair> cr =null;
		Param p =null;
		Method m =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:84:5: ( ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= classRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:85:8: ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= classRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )?
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:85:8: ( 'implements' COLON (ifs= interfaces )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==34) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:85:9: 'implements' COLON (ifs= interfaces )+
					{
					match(input,34,FOLLOW_34_in_classValues234); 
					match(input,COLON,FOLLOW_COLON_in_classValues236); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:85:28: (ifs= interfaces )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:85:29: ifs= interfaces
							{
							pushFollow(FOLLOW_interfaces_in_classValues243);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:86:8: ( 'extends' COLON (c= classes )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==32) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:86:9: 'extends' COLON (c= classes )+
					{
					match(input,32,FOLLOW_32_in_classValues260); 
					match(input,COLON,FOLLOW_COLON_in_classValues262); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:86:25: (c= classes )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:86:26: c= classes
							{
							pushFollow(FOLLOW_classes_in_classValues269);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:87:8: ( 'relations' COLON (cr= classRelations )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==39) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:87:9: 'relations' COLON (cr= classRelations )+
					{
					match(input,39,FOLLOW_39_in_classValues286); 
					match(input,COLON,FOLLOW_COLON_in_classValues288); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:87:27: (cr= classRelations )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:87:28: cr= classRelations
							{
							pushFollow(FOLLOW_classRelations_in_classValues295);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:8: ( 'params' COLON (p= classParameters )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==38) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:9: 'params' COLON (p= classParameters )+
					{
					match(input,38,FOLLOW_38_in_classValues311); 
					match(input,COLON,FOLLOW_COLON_in_classValues313); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:25: (p= classParameters )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==HASHTAG||(LA8_0 >= MINUS && LA8_0 <= PLUS)) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:26: p= classParameters
							{
							pushFollow(FOLLOW_classParameters_in_classValues321);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:89:8: ( 'methods' COLON (m= classMethods )+ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==37) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:89:9: 'methods' COLON (m= classMethods )+
					{
					match(input,37,FOLLOW_37_in_classValues337); 
					match(input,COLON,FOLLOW_COLON_in_classValues339); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:89:25: (m= classMethods )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==HASHTAG||(LA10_0 >= MINUS && LA10_0 <= PLUS)) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:89:26: m= classMethods
							{
							pushFollow(FOLLOW_classMethods_in_classValues346);
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



	// $ANTLR start "classParameters"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:92:1: classParameters returns [Param ip] : visibility i= ID ( COLON t= type ) ;
	public final Param classParameters() throws RecognitionException {
		Param ip = null;


		Token i=null;
		Token t =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:5: ( visibility i= ID ( COLON t= type ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:7: visibility i= ID ( COLON t= type )
			{
			pushFollow(FOLLOW_visibility_in_classParameters380);
			visibility();
			state._fsp--;

			i=(Token)match(input,ID,FOLLOW_ID_in_classParameters386); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:25: ( COLON t= type )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:26: COLON t= type
			{
			match(input,COLON,FOLLOW_COLON_in_classParameters389); 
			pushFollow(FOLLOW_type_in_classParameters395);
			t=type();
			state._fsp--;

			}

			 ip = h.returnParam(i, t); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:96:1: classMethods returns [Method im] : v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )? ;
	public final Method classMethods() throws RecognitionException {
		Method im = null;


		Token i=null;
		Token v =null;
		List<MethodParam> p =null;
		Token t =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:5: (v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:7: v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )?
			{
			pushFollow(FOLLOW_visibility_in_classMethods423);
			v=visibility();
			state._fsp--;

			i=(Token)match(input,ID,FOLLOW_ID_in_classMethods429); 
			match(input,LP,FOLLOW_LP_in_classMethods431); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:34: (p= methodParams )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:34: p= methodParams
					{
					pushFollow(FOLLOW_methodParams_in_classMethods437);
					p=methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_classMethods440); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:53: ( COLON t= type )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==COLON) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:54: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_classMethods443); 
					pushFollow(FOLLOW_type_in_classMethods449);
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:100:1: interfaceDefinition : 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' ;
	public final void interfaceDefinition() throws RecognitionException {
		Token i=null;
		Param p =null;
		Method m =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:101:5: ( 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:101:8: 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface'
			{
			match(input,36,FOLLOW_36_in_interfaceDefinition471); 
			match(input,33,FOLLOW_33_in_interfaceDefinition480); 
			match(input,COLON,FOLLOW_COLON_in_interfaceDefinition482); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceDefinition488); 
			 h.createNewInterface(i); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:103:8: ( 'params' COLON (p= interfaceParams )+ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==38) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:103:9: 'params' COLON (p= interfaceParams )+
					{
					match(input,38,FOLLOW_38_in_interfaceDefinition500); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition502); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:103:25: (p= interfaceParams )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==PLUS) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:103:26: p= interfaceParams
							{
							pushFollow(FOLLOW_interfaceParams_in_interfaceDefinition510);
							p=interfaceParams();
							state._fsp--;

							 h.addParams(i, p); 
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					}
					break;

			}

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:104:8: ( 'methods' COLON (m= interfaceMethods )+ )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==37) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:104:9: 'methods' COLON (m= interfaceMethods )+
					{
					match(input,37,FOLLOW_37_in_interfaceDefinition529); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition531); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:104:25: (m= interfaceMethods )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==PLUS) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:104:26: m= interfaceMethods
							{
							pushFollow(FOLLOW_interfaceMethods_in_interfaceDefinition538);
							m=interfaceMethods();
							state._fsp--;

							 h.addMethod(i, m); 
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					}
					break;

			}

			match(input,31,FOLLOW_31_in_interfaceDefinition555); 
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



	// $ANTLR start "classRelations"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:108:1: classRelations returns [List<Pair> classList] : i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )* ;
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
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:5: (i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:8: i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_classRelations590); 
			pushFollow(FOLLOW_cardinality_in_classRelations596);
			c1=cardinality();
			state._fsp--;

			match(input,18,FOLLOW_18_in_classRelations598); 
			pushFollow(FOLLOW_cardinality_in_classRelations604);
			c2=cardinality();
			state._fsp--;

			 classList.add(new Pair<>(i.getText(),  c1.getText() + '/' + c2.getText())); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:111:7: ( COMMA i1= ID c3= cardinality '/' c4= cardinality )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:111:8: COMMA i1= ID c3= cardinality '/' c4= cardinality
					{
					match(input,COMMA,FOLLOW_COMMA_in_classRelations623); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_classRelations629); 
					pushFollow(FOLLOW_cardinality_in_classRelations635);
					c3=cardinality();
					state._fsp--;

					match(input,18,FOLLOW_18_in_classRelations637); 
					pushFollow(FOLLOW_cardinality_in_classRelations643);
					c4=cardinality();
					state._fsp--;

					 classList.add(new Pair<>(i.getText(),  c3.getText() + '/' + c4.getText())); 
					}
					break;

				default :
					break loop18;
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



	// $ANTLR start "interfaceParams"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:114:1: interfaceParams returns [Param ip] : PLUS i= ID COLON t= type ;
	public final Param interfaceParams() throws RecognitionException {
		Param ip = null;


		Token i=null;
		Token t =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:115:5: ( PLUS i= ID COLON t= type )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:115:8: PLUS i= ID COLON t= type
			{
			match(input,PLUS,FOLLOW_PLUS_in_interfaceParams670); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceParams676); 
			match(input,COLON,FOLLOW_COLON_in_interfaceParams678); 
			pushFollow(FOLLOW_type_in_interfaceParams684);
			t=type();
			state._fsp--;

			 ip = h.returnParam(i, t); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:118:1: interfaceMethods returns [Method im] : v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? ;
	public final Method interfaceMethods() throws RecognitionException {
		Method im = null;


		Token v=null;
		Token i=null;
		List<MethodParam> p =null;
		Token t =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:119:5: (v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:119:8: v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )?
			{
			v=(Token)match(input,PLUS,FOLLOW_PLUS_in_interfaceMethods716); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceMethods722); 
			match(input,LP,FOLLOW_LP_in_interfaceMethods724); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:119:29: (p= methodParams )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ID) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:119:29: p= methodParams
					{
					pushFollow(FOLLOW_methodParams_in_interfaceMethods730);
					p=methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_interfaceMethods733); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:119:48: ( COLON t= type )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==COLON) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:119:49: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_interfaceMethods736); 
					pushFollow(FOLLOW_type_in_interfaceMethods742);
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:122:1: methodParams returns [List<MethodParam> imp] : i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* ;
	public final List<MethodParam> methodParams() throws RecognitionException {
		List<MethodParam> imp = null;


		Token i1=null;
		Token i2=null;
		Token t1 =null;
		Token t2 =null;

		 imp = new ArrayList<MethodParam>(); 
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:124:5: (i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:124:9: i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )*
			{
			i1=(Token)match(input,ID,FOLLOW_ID_in_methodParams778); 
			match(input,COLON,FOLLOW_COLON_in_methodParams780); 
			pushFollow(FOLLOW_type_in_methodParams786);
			t1=type();
			state._fsp--;

			 h.addMethodParam(imp, i1, t1); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:125:8: ( COMMA i2= ID COLON t2= type )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:125:9: COMMA i2= ID COLON t2= type
					{
					match(input,COMMA,FOLLOW_COMMA_in_methodParams804); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_methodParams810); 
					match(input,COLON,FOLLOW_COLON_in_methodParams812); 
					pushFollow(FOLLOW_type_in_methodParams818);
					t2=type();
					state._fsp--;

					 h.addMethodParam(imp, i2, t2); 
					}
					break;

				default :
					break loop21;
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



	// $ANTLR start "interfaces"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:128:1: interfaces returns [List<String> ifList] : i= ID ( COMMA i1= ID )* ;
	public final List<String> interfaces() throws RecognitionException {
		List<String> ifList = null;


		Token i=null;
		Token i1=null;

		 ifList = new ArrayList<String>(); 
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:130:5: (i= ID ( COMMA i1= ID )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:130:9: i= ID ( COMMA i1= ID )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaces860); 
			 ifList.add(i.getText());  
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:131:9: ( COMMA i1= ID )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:131:10: COMMA i1= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaces875); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_interfaces881); 
					 ifList.add(i1.getText()); 
					}
					break;

				default :
					break loop22;
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:134:1: classes returns [List<String> classList] : i= ID ( COMMA i1= ID )* ;
	public final List<String> classes() throws RecognitionException {
		List<String> classList = null;


		Token i=null;
		Token i1=null;

		 classList = new ArrayList<String>(); 
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:5: (i= ID ( COMMA i1= ID )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:136:8: i= ID ( COMMA i1= ID )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_classes918); 
			 classList.add(i.getText()) ; 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:137:7: ( COMMA i1= ID )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:137:8: COMMA i1= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_classes931); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_classes937); 
					 classList.add(i1.getText()); 
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
		return classList;
	}
	// $ANTLR end "classes"



	// $ANTLR start "visibility"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:140:1: visibility returns [Token t] : (x= PLUS |x= MINUS |x= HASHTAG ) ;
	public final Token visibility() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:5: ( (x= PLUS |x= MINUS |x= HASHTAG ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:7: (x= PLUS |x= MINUS |x= HASHTAG )
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:7: (x= PLUS |x= MINUS |x= HASHTAG )
			int alt24=3;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt24=1;
				}
				break;
			case MINUS:
				{
				alt24=2;
				}
				break;
			case HASHTAG:
				{
				alt24=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:8: x= PLUS
					{
					x=(Token)match(input,PLUS,FOLLOW_PLUS_in_visibility976); 
					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:19: x= MINUS
					{
					x=(Token)match(input,MINUS,FOLLOW_MINUS_in_visibility984); 
					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:141:31: x= HASHTAG
					{
					x=(Token)match(input,HASHTAG,FOLLOW_HASHTAG_in_visibility992); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:144:1: cardinality returns [Token t] : (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' ) ;
	public final Token cardinality() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:145:5: ( (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:145:7: (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' )
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:145:7: (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' )
			int alt25=4;
			switch ( input.LA(1) ) {
			case 20:
				{
				alt25=1;
				}
				break;
			case 21:
				{
				alt25=2;
				}
				break;
			case 19:
				{
				alt25=3;
				}
				break;
			case 22:
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
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:145:8: x= '0..1'
					{
					x=(Token)match(input,20,FOLLOW_20_in_cardinality1025); 
					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:146:7: x= '1'
					{
					x=(Token)match(input,21,FOLLOW_21_in_cardinality1038); 
					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:147:7: x= '0..*'
					{
					x=(Token)match(input,19,FOLLOW_19_in_cardinality1051); 
					}
					break;
				case 4 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:148:7: x= '1..*'
					{
					x=(Token)match(input,22,FOLLOW_22_in_cardinality1064); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:152:1: type returns [Token t] : (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID ) ;
	public final Token type() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:153:3: ( (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:153:4: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID )
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:153:4: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID )
			int alt26=6;
			switch ( input.LA(1) ) {
			case 35:
				{
				alt26=1;
				}
				break;
			case 28:
				{
				alt26=2;
				}
				break;
			case 26:
				{
				alt26=3;
				}
				break;
			case 25:
				{
				alt26=4;
				}
				break;
			case 23:
				{
				alt26=5;
				}
				break;
			case ID:
				{
				alt26=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:153:6: x= 'int'
					{
					x=(Token)match(input,35,FOLLOW_35_in_type1099); 
					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:154:5: x= 'double'
					{
					x=(Token)match(input,28,FOLLOW_28_in_type1111); 
					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:155:5: x= 'char'
					{
					x=(Token)match(input,26,FOLLOW_26_in_type1122); 
					}
					break;
				case 4 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:156:5: x= 'boolean'
					{
					x=(Token)match(input,25,FOLLOW_25_in_type1133); 
					}
					break;
				case 5 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:157:5: x= 'String'
					{
					x=(Token)match(input,23,FOLLOW_23_in_type1144); 
					}
					break;
				case 6 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:158:5: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_type1155); 
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
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_abstractClassDefinition_in_initUml73 = new BitSet(new long[]{0x0000001009000002L});
	public static final BitSet FOLLOW_classDefinition_in_initUml77 = new BitSet(new long[]{0x0000001009000002L});
	public static final BitSet FOLLOW_interfaceDefinition_in_initUml81 = new BitSet(new long[]{0x0000001009000002L});
	public static final BitSet FOLLOW_27_in_classDefinition107 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_classDefinition117 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classDefinition119 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classDefinition125 = new BitSet(new long[]{0x000000E540000000L});
	public static final BitSet FOLLOW_classValues_in_classDefinition134 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_classDefinition144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_abstractClassDefinition167 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_abstractClassDefinition176 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_abstractClassDefinition178 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_abstractClassDefinition184 = new BitSet(new long[]{0x000000E520000000L});
	public static final BitSet FOLLOW_classValues_in_abstractClassDefinition193 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_abstractClassDefinition203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_classValues234 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues236 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_interfaces_in_classValues243 = new BitSet(new long[]{0x000000E100000802L});
	public static final BitSet FOLLOW_32_in_classValues260 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues262 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_classes_in_classValues269 = new BitSet(new long[]{0x000000E000000802L});
	public static final BitSet FOLLOW_39_in_classValues286 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues288 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_classRelations_in_classValues295 = new BitSet(new long[]{0x0000006000000802L});
	public static final BitSet FOLLOW_38_in_classValues311 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues313 = new BitSet(new long[]{0x0000000000006400L});
	public static final BitSet FOLLOW_classParameters_in_classValues321 = new BitSet(new long[]{0x0000002000006402L});
	public static final BitSet FOLLOW_37_in_classValues337 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues339 = new BitSet(new long[]{0x0000000000006400L});
	public static final BitSet FOLLOW_classMethods_in_classValues346 = new BitSet(new long[]{0x0000000000006402L});
	public static final BitSet FOLLOW_visibility_in_classParameters380 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classParameters386 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classParameters389 = new BitSet(new long[]{0x0000000816800800L});
	public static final BitSet FOLLOW_type_in_classParameters395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibility_in_classMethods423 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classMethods429 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_classMethods431 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_methodParams_in_classMethods437 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_classMethods440 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_classMethods443 = new BitSet(new long[]{0x0000000816800800L});
	public static final BitSet FOLLOW_type_in_classMethods449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_interfaceDefinition471 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_interfaceDefinition480 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition482 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceDefinition488 = new BitSet(new long[]{0x0000006080000000L});
	public static final BitSet FOLLOW_38_in_interfaceDefinition500 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition502 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_interfaceParams_in_interfaceDefinition510 = new BitSet(new long[]{0x0000002080004000L});
	public static final BitSet FOLLOW_37_in_interfaceDefinition529 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition531 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_interfaceMethods_in_interfaceDefinition538 = new BitSet(new long[]{0x0000000080004000L});
	public static final BitSet FOLLOW_31_in_interfaceDefinition555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_classRelations590 = new BitSet(new long[]{0x0000000000780000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations596 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_classRelations598 = new BitSet(new long[]{0x0000000000780000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations604 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_classRelations623 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classRelations629 = new BitSet(new long[]{0x0000000000780000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations635 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_classRelations637 = new BitSet(new long[]{0x0000000000780000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations643 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_PLUS_in_interfaceParams670 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceParams676 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceParams678 = new BitSet(new long[]{0x0000000816800800L});
	public static final BitSet FOLLOW_type_in_interfaceParams684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_interfaceMethods716 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceMethods722 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_interfaceMethods724 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_methodParams_in_interfaceMethods730 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_interfaceMethods733 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_interfaceMethods736 = new BitSet(new long[]{0x0000000816800800L});
	public static final BitSet FOLLOW_type_in_interfaceMethods742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodParams778 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_methodParams780 = new BitSet(new long[]{0x0000000816800800L});
	public static final BitSet FOLLOW_type_in_methodParams786 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_methodParams804 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_methodParams810 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_methodParams812 = new BitSet(new long[]{0x0000000816800800L});
	public static final BitSet FOLLOW_type_in_methodParams818 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ID_in_interfaces860 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_interfaces875 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaces881 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ID_in_classes918 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_classes931 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classes937 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_PLUS_in_visibility976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_visibility984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASHTAG_in_visibility992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_cardinality1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_cardinality1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_cardinality1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_cardinality1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_type1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_type1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_type1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_type1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_type1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type1155 = new BitSet(new long[]{0x0000000000000002L});
}
