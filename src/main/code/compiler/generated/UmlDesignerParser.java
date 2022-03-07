// $ANTLR 3.5.1 D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g 2022-03-07 16:04:29

package compiler.generated;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
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
		"RP", "SCAN_ERROR", "WS", "'0..*'", "'0..1'", "'1'", "'1..*'", "'String'", 
		"'abstractClass'", "'boolean'", "'char'", "'class'", "'double'", "'endAbstractClass'", 
		"'endClass'", "'endInterface'", "'extends'", "'id'", "'implements'", "'int'", 
		"'interface'", "'methods'", "'params'", "'relations'"
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
		
	    public UmlDesignerParser(String fileIn) throws 
			FileNotFoundException, IOException {
		this(new CommonTokenStream(
				new UmlDesignerLexer(
					new ANTLRReaderStream(
					 new FileReader(fileIn)
					 ))));
	     }



	// $ANTLR start "initUml"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:44:1: initUml : ( abstractClassDefinition | classDefinition | interfaceDefinition )* ;
	public final void initUml() throws RecognitionException {
		 setUp(); 
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:46:5: ( ( abstractClassDefinition | classDefinition | interfaceDefinition )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:46:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )*
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:46:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )*
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
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:46:8: abstractClassDefinition
					{
					pushFollow(FOLLOW_abstractClassDefinition_in_initUml73);
					abstractClassDefinition();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:46:34: classDefinition
					{
					pushFollow(FOLLOW_classDefinition_in_initUml77);
					classDefinition();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:46:52: interfaceDefinition
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:49:1: classDefinition : 'class' classValues 'endClass' ;
	public final void classDefinition() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:50:5: ( 'class' classValues 'endClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:50:8: 'class' classValues 'endClass'
			{
			match(input,26,FOLLOW_26_in_classDefinition105); 
			pushFollow(FOLLOW_classValues_in_classDefinition113);
			classValues();
			state._fsp--;

			match(input,29,FOLLOW_29_in_classDefinition122); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:55:1: abstractClassDefinition : 'abstractClass' classValues 'endAbstractClass' ;
	public final void abstractClassDefinition() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:56:5: ( 'abstractClass' classValues 'endAbstractClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:56:8: 'abstractClass' classValues 'endAbstractClass'
			{
			match(input,23,FOLLOW_23_in_abstractClassDefinition144); 
			pushFollow(FOLLOW_classValues_in_abstractClassDefinition151);
			classValues();
			state._fsp--;

			match(input,28,FOLLOW_28_in_abstractClassDefinition160); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:61:1: classValues : 'id' COLON ID ( 'implements' COLON ( interfaces )+ )? ( 'extends' COLON ( classes )+ )? ( 'relations' COLON ( classRelations )+ )? ( 'params' COLON ( classParameters )+ )? ( 'methods' COLON ( classMethods )+ )? ;
	public final void classValues() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:62:5: ( 'id' COLON ID ( 'implements' COLON ( interfaces )+ )? ( 'extends' COLON ( classes )+ )? ( 'relations' COLON ( classRelations )+ )? ( 'params' COLON ( classParameters )+ )? ( 'methods' COLON ( classMethods )+ )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:63:9: 'id' COLON ID ( 'implements' COLON ( interfaces )+ )? ( 'extends' COLON ( classes )+ )? ( 'relations' COLON ( classRelations )+ )? ( 'params' COLON ( classParameters )+ )? ( 'methods' COLON ( classMethods )+ )?
			{
			match(input,32,FOLLOW_32_in_classValues189); 
			match(input,COLON,FOLLOW_COLON_in_classValues191); 
			match(input,ID,FOLLOW_ID_in_classValues193); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:64:8: ( 'implements' COLON ( interfaces )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==33) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:64:9: 'implements' COLON ( interfaces )+
					{
					match(input,33,FOLLOW_33_in_classValues203); 
					match(input,COLON,FOLLOW_COLON_in_classValues205); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:64:28: ( interfaces )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:64:29: interfaces
							{
							pushFollow(FOLLOW_interfaces_in_classValues208);
							interfaces();
							state._fsp--;

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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:8: ( 'extends' COLON ( classes )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==31) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:9: 'extends' COLON ( classes )+
					{
					match(input,31,FOLLOW_31_in_classValues223); 
					match(input,COLON,FOLLOW_COLON_in_classValues225); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:25: ( classes )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:65:26: classes
							{
							pushFollow(FOLLOW_classes_in_classValues228);
							classes();
							state._fsp--;

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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:66:8: ( 'relations' COLON ( classRelations )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==38) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:66:9: 'relations' COLON ( classRelations )+
					{
					match(input,38,FOLLOW_38_in_classValues243); 
					match(input,COLON,FOLLOW_COLON_in_classValues245); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:66:27: ( classRelations )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:66:28: classRelations
							{
							pushFollow(FOLLOW_classRelations_in_classValues248);
							classRelations();
							state._fsp--;

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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:67:8: ( 'params' COLON ( classParameters )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==37) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:67:9: 'params' COLON ( classParameters )+
					{
					match(input,37,FOLLOW_37_in_classValues262); 
					match(input,COLON,FOLLOW_COLON_in_classValues264); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:67:24: ( classParameters )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:67:25: classParameters
							{
							pushFollow(FOLLOW_classParameters_in_classValues267);
							classParameters();
							state._fsp--;

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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:68:8: ( 'methods' COLON ( classMethods )+ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==36) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:68:9: 'methods' COLON ( classMethods )+
					{
					match(input,36,FOLLOW_36_in_classValues281); 
					match(input,COLON,FOLLOW_COLON_in_classValues283); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:68:25: ( classMethods )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:68:26: classMethods
							{
							pushFollow(FOLLOW_classMethods_in_classValues286);
							classMethods();
							state._fsp--;

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



	// $ANTLR start "interfaceDefinition"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:71:1: interfaceDefinition : 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' ;
	public final void interfaceDefinition() throws RecognitionException {
		Token i=null;
		Param p =null;
		Method m =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:72:5: ( 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:72:8: 'interface' 'id' COLON i= ID ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface'
			{
			match(input,35,FOLLOW_35_in_interfaceDefinition308); 
			match(input,32,FOLLOW_32_in_interfaceDefinition317); 
			match(input,COLON,FOLLOW_COLON_in_interfaceDefinition319); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceDefinition325); 
			 h.createNewInterface(i); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:74:8: ( 'params' COLON (p= interfaceParams )+ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==37) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:74:9: 'params' COLON (p= interfaceParams )+
					{
					match(input,37,FOLLOW_37_in_interfaceDefinition337); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition339); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:74:25: (p= interfaceParams )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==PLUS) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:74:26: p= interfaceParams
							{
							pushFollow(FOLLOW_interfaceParams_in_interfaceDefinition347);
							p=interfaceParams();
							state._fsp--;

							 h.interfaces.addInterfaceParams(i, p); 
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					}
					break;

			}

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:75:8: ( 'methods' COLON (m= interfaceMethods )+ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==36) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:75:9: 'methods' COLON (m= interfaceMethods )+
					{
					match(input,36,FOLLOW_36_in_interfaceDefinition366); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition368); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:75:25: (m= interfaceMethods )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:75:26: m= interfaceMethods
							{
							pushFollow(FOLLOW_interfaceMethods_in_interfaceDefinition375);
							m=interfaceMethods();
							state._fsp--;

							 h.interfaces.addInterfaceMethod(i, m); 
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

			match(input,30,FOLLOW_30_in_interfaceDefinition392); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:79:1: classRelations : ID cardinality ( COMMA ID cardinality )* ;
	public final void classRelations() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:80:5: ( ID cardinality ( COMMA ID cardinality )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:80:8: ID cardinality ( COMMA ID cardinality )*
			{
			match(input,ID,FOLLOW_ID_in_classRelations414); 
			pushFollow(FOLLOW_cardinality_in_classRelations416);
			cardinality();
			state._fsp--;

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:80:23: ( COMMA ID cardinality )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:80:24: COMMA ID cardinality
					{
					match(input,COMMA,FOLLOW_COMMA_in_classRelations419); 
					match(input,ID,FOLLOW_ID_in_classRelations421); 
					pushFollow(FOLLOW_cardinality_in_classRelations423);
					cardinality();
					state._fsp--;

					}
					break;

				default :
					break loop16;
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
	}
	// $ANTLR end "classRelations"



	// $ANTLR start "interfaceParams"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:83:1: interfaceParams returns [Param ip] : PLUS i= ID COLON t= type ;
	public final Param interfaceParams() throws RecognitionException {
		Param ip = null;


		Token i=null;
		Token t =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:84:5: ( PLUS i= ID COLON t= type )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:84:8: PLUS i= ID COLON t= type
			{
			match(input,PLUS,FOLLOW_PLUS_in_interfaceParams447); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceParams453); 
			match(input,COLON,FOLLOW_COLON_in_interfaceParams455); 
			pushFollow(FOLLOW_type_in_interfaceParams461);
			t=type();
			state._fsp--;

			 ip = h.interfaces.returnParam(i, t); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:87:1: interfaceMethods returns [Method im] : PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? ;
	public final Method interfaceMethods() throws RecognitionException {
		Method im = null;


		Token i=null;
		List<MethodParam> p =null;
		Token t =null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:5: ( PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:8: PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_interfaceMethods489); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceMethods495); 
			match(input,LP,FOLLOW_LP_in_interfaceMethods497); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:25: (p= methodParams )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:25: p= methodParams
					{
					pushFollow(FOLLOW_methodParams_in_interfaceMethods503);
					p=methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_interfaceMethods506); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:44: ( COLON t= type )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==COLON) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:88:45: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_interfaceMethods509); 
					pushFollow(FOLLOW_type_in_interfaceMethods515);
					t=type();
					state._fsp--;

					}
					break;

			}

			 im = h.interfaces.returnMethod(i, t, p); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:91:1: methodParams returns [List<MethodParam> imp] : i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* ;
	public final List<MethodParam> methodParams() throws RecognitionException {
		List<MethodParam> imp = null;


		Token i1=null;
		Token i2=null;
		Token t1 =null;
		Token t2 =null;

		 imp = new ArrayList<MethodParam>(); 
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:5: (i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:93:9: i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )*
			{
			i1=(Token)match(input,ID,FOLLOW_ID_in_methodParams551); 
			match(input,COLON,FOLLOW_COLON_in_methodParams553); 
			pushFollow(FOLLOW_type_in_methodParams559);
			t1=type();
			state._fsp--;

			 h.interfaces.addInterfaceMethodParam(imp, i1, t1); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:94:8: ( COMMA i2= ID COLON t2= type )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:94:9: COMMA i2= ID COLON t2= type
					{
					match(input,COMMA,FOLLOW_COMMA_in_methodParams577); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_methodParams583); 
					match(input,COLON,FOLLOW_COLON_in_methodParams585); 
					pushFollow(FOLLOW_type_in_methodParams591);
					t2=type();
					state._fsp--;

					 h.interfaces.addInterfaceMethodParam(imp, i2, t2); 
					}
					break;

				default :
					break loop19;
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



	// $ANTLR start "classParameters"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:97:1: classParameters : visibility ID ( COLON type )? ;
	public final void classParameters() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:98:5: ( visibility ID ( COLON type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:98:7: visibility ID ( COLON type )?
			{
			pushFollow(FOLLOW_visibility_in_classParameters618);
			visibility();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_classParameters620); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:98:21: ( COLON type )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==COLON) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:98:22: COLON type
					{
					match(input,COLON,FOLLOW_COLON_in_classParameters623); 
					pushFollow(FOLLOW_type_in_classParameters625);
					type();
					state._fsp--;

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
	// $ANTLR end "classParameters"



	// $ANTLR start "interfaces"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:101:1: interfaces : ID ( COMMA ID )* ;
	public final void interfaces() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:102:5: ( ID ( COMMA ID )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:102:9: ID ( COMMA ID )*
			{
			match(input,ID,FOLLOW_ID_in_interfaces650); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:102:12: ( COMMA ID )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:102:13: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaces653); 
					match(input,ID,FOLLOW_ID_in_interfaces655); 
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
	}
	// $ANTLR end "interfaces"



	// $ANTLR start "classes"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:105:1: classes : ID ( COMMA ID )* ;
	public final void classes() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:106:5: ( ID ( COMMA ID )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:106:8: ID ( COMMA ID )*
			{
			match(input,ID,FOLLOW_ID_in_classes675); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:106:11: ( COMMA ID )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:106:12: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_classes678); 
					match(input,ID,FOLLOW_ID_in_classes680); 
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
	}
	// $ANTLR end "classes"



	// $ANTLR start "classMethods"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:109:1: classMethods : visibility ID LP ( methodParams )? RP ( COLON type )? ;
	public final void classMethods() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:5: ( visibility ID LP ( methodParams )? RP ( COLON type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:7: visibility ID LP ( methodParams )? RP ( COLON type )?
			{
			pushFollow(FOLLOW_visibility_in_classMethods707);
			visibility();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_classMethods709); 
			match(input,LP,FOLLOW_LP_in_classMethods711); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:24: ( methodParams )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ID) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:24: methodParams
					{
					pushFollow(FOLLOW_methodParams_in_classMethods713);
					methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_classMethods716); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:41: ( COLON type )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==COLON) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:110:42: COLON type
					{
					match(input,COLON,FOLLOW_COLON_in_classMethods719); 
					pushFollow(FOLLOW_type_in_classMethods721);
					type();
					state._fsp--;

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
	// $ANTLR end "classMethods"



	// $ANTLR start "visibility"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:113:1: visibility : ( PLUS | MINUS | HASHTAG ) ;
	public final void visibility() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:114:5: ( ( PLUS | MINUS | HASHTAG ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:
			{
			if ( input.LA(1)==HASHTAG||(input.LA(1) >= MINUS && input.LA(1) <= PLUS) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "visibility"



	// $ANTLR start "cardinality"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:117:1: cardinality : ( '0..1' | '1' | '0..*' | '1..*' ) ;
	public final void cardinality() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:118:5: ( ( '0..1' | '1' | '0..*' | '1..*' ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:
			{
			if ( (input.LA(1) >= 18 && input.LA(1) <= 21) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "cardinality"



	// $ANTLR start "type"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:121:1: type returns [Token t] : (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID ) ;
	public final Token type() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:122:3: ( (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:122:4: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID )
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:122:4: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID )
			int alt25=6;
			switch ( input.LA(1) ) {
			case 34:
				{
				alt25=1;
				}
				break;
			case 27:
				{
				alt25=2;
				}
				break;
			case 25:
				{
				alt25=3;
				}
				break;
			case 24:
				{
				alt25=4;
				}
				break;
			case 22:
				{
				alt25=5;
				}
				break;
			case ID:
				{
				alt25=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:122:6: x= 'int'
					{
					x=(Token)match(input,34,FOLLOW_34_in_type817); 
					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:123:5: x= 'double'
					{
					x=(Token)match(input,27,FOLLOW_27_in_type829); 
					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:124:5: x= 'char'
					{
					x=(Token)match(input,25,FOLLOW_25_in_type840); 
					}
					break;
				case 4 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:125:5: x= 'boolean'
					{
					x=(Token)match(input,24,FOLLOW_24_in_type851); 
					}
					break;
				case 5 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:126:5: x= 'String'
					{
					x=(Token)match(input,22,FOLLOW_22_in_type862); 
					}
					break;
				case 6 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:127:5: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_type873); 
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



	public static final BitSet FOLLOW_abstractClassDefinition_in_initUml73 = new BitSet(new long[]{0x0000000804800002L});
	public static final BitSet FOLLOW_classDefinition_in_initUml77 = new BitSet(new long[]{0x0000000804800002L});
	public static final BitSet FOLLOW_interfaceDefinition_in_initUml81 = new BitSet(new long[]{0x0000000804800002L});
	public static final BitSet FOLLOW_26_in_classDefinition105 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classValues_in_classDefinition113 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_classDefinition122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_abstractClassDefinition144 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classValues_in_abstractClassDefinition151 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_abstractClassDefinition160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_classValues189 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues191 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classValues193 = new BitSet(new long[]{0x0000007280000002L});
	public static final BitSet FOLLOW_33_in_classValues203 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues205 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_interfaces_in_classValues208 = new BitSet(new long[]{0x0000007080000802L});
	public static final BitSet FOLLOW_31_in_classValues223 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues225 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_classes_in_classValues228 = new BitSet(new long[]{0x0000007000000802L});
	public static final BitSet FOLLOW_38_in_classValues243 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues245 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_classRelations_in_classValues248 = new BitSet(new long[]{0x0000003000000802L});
	public static final BitSet FOLLOW_37_in_classValues262 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues264 = new BitSet(new long[]{0x0000000000006400L});
	public static final BitSet FOLLOW_classParameters_in_classValues267 = new BitSet(new long[]{0x0000001000006402L});
	public static final BitSet FOLLOW_36_in_classValues281 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues283 = new BitSet(new long[]{0x0000000000006400L});
	public static final BitSet FOLLOW_classMethods_in_classValues286 = new BitSet(new long[]{0x0000000000006402L});
	public static final BitSet FOLLOW_35_in_interfaceDefinition308 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_interfaceDefinition317 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition319 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceDefinition325 = new BitSet(new long[]{0x0000003040000000L});
	public static final BitSet FOLLOW_37_in_interfaceDefinition337 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition339 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_interfaceParams_in_interfaceDefinition347 = new BitSet(new long[]{0x0000001040004000L});
	public static final BitSet FOLLOW_36_in_interfaceDefinition366 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition368 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_interfaceMethods_in_interfaceDefinition375 = new BitSet(new long[]{0x0000000040004000L});
	public static final BitSet FOLLOW_30_in_interfaceDefinition392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_classRelations414 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations416 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_classRelations419 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classRelations421 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations423 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_PLUS_in_interfaceParams447 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceParams453 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceParams455 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_interfaceParams461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_interfaceMethods489 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceMethods495 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_interfaceMethods497 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_methodParams_in_interfaceMethods503 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_interfaceMethods506 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_interfaceMethods509 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_interfaceMethods515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodParams551 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_methodParams553 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_methodParams559 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_methodParams577 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_methodParams583 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_methodParams585 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_methodParams591 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_visibility_in_classParameters618 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classParameters620 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_classParameters623 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_classParameters625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_interfaces650 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_interfaces653 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaces655 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ID_in_classes675 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_classes678 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classes680 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_visibility_in_classMethods707 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classMethods709 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_classMethods711 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_methodParams_in_classMethods713 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_classMethods716 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_classMethods719 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_classMethods721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_type817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_type829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_type840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_type851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_type862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type873 = new BitSet(new long[]{0x0000000000000002L});
}
