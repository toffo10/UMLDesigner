// $ANTLR 3.5.1 D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g 2022-03-02 11:52:30

package compiler;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


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
	@Override public String getGrammarFileName() { return "D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g"; }


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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:40:1: initUml : ( abstractClassDefinition | classDefinition | interfaceDefinition )* ;
	public final void initUml() throws RecognitionException {
		 setUp(); 
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:42:5: ( ( abstractClassDefinition | classDefinition | interfaceDefinition )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:42:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )*
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:42:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )*
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
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:42:8: abstractClassDefinition
					{
					pushFollow(FOLLOW_abstractClassDefinition_in_initUml73);
					abstractClassDefinition();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:42:34: classDefinition
					{
					pushFollow(FOLLOW_classDefinition_in_initUml77);
					classDefinition();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:42:52: interfaceDefinition
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:45:1: classDefinition : 'class' classValues 'endClass' ;
	public final void classDefinition() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:46:5: ( 'class' classValues 'endClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:46:8: 'class' classValues 'endClass'
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:51:1: abstractClassDefinition : 'abstractClass' classValues 'endAbstractClass' ;
	public final void abstractClassDefinition() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:52:5: ( 'abstractClass' classValues 'endAbstractClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:52:8: 'abstractClass' classValues 'endAbstractClass'
			{
			match(input,23,FOLLOW_23_in_abstractClassDefinition144); 
			pushFollow(FOLLOW_classValues_in_abstractClassDefinition152);
			classValues();
			state._fsp--;

			match(input,28,FOLLOW_28_in_abstractClassDefinition161); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:57:1: classValues : 'id' COLON ID ( 'implements' COLON ( interfaces )+ )? ( 'extends' COLON ( classes )+ )? ( 'relations' COLON ( classRelations )+ )? ( 'params' COLON ( classParameters )+ )? ( 'methods' COLON ( classMethods )+ )? ;
	public final void classValues() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:58:5: ( 'id' COLON ID ( 'implements' COLON ( interfaces )+ )? ( 'extends' COLON ( classes )+ )? ( 'relations' COLON ( classRelations )+ )? ( 'params' COLON ( classParameters )+ )? ( 'methods' COLON ( classMethods )+ )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:59:9: 'id' COLON ID ( 'implements' COLON ( interfaces )+ )? ( 'extends' COLON ( classes )+ )? ( 'relations' COLON ( classRelations )+ )? ( 'params' COLON ( classParameters )+ )? ( 'methods' COLON ( classMethods )+ )?
			{
			match(input,32,FOLLOW_32_in_classValues190); 
			match(input,COLON,FOLLOW_COLON_in_classValues192); 
			match(input,ID,FOLLOW_ID_in_classValues194); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:60:8: ( 'implements' COLON ( interfaces )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==33) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:60:9: 'implements' COLON ( interfaces )+
					{
					match(input,33,FOLLOW_33_in_classValues204); 
					match(input,COLON,FOLLOW_COLON_in_classValues206); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:60:28: ( interfaces )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:60:29: interfaces
							{
							pushFollow(FOLLOW_interfaces_in_classValues209);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:61:8: ( 'extends' COLON ( classes )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==31) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:61:9: 'extends' COLON ( classes )+
					{
					match(input,31,FOLLOW_31_in_classValues224); 
					match(input,COLON,FOLLOW_COLON_in_classValues226); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:61:25: ( classes )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:61:26: classes
							{
							pushFollow(FOLLOW_classes_in_classValues229);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:62:8: ( 'relations' COLON ( classRelations )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==38) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:62:9: 'relations' COLON ( classRelations )+
					{
					match(input,38,FOLLOW_38_in_classValues244); 
					match(input,COLON,FOLLOW_COLON_in_classValues246); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:62:27: ( classRelations )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:62:28: classRelations
							{
							pushFollow(FOLLOW_classRelations_in_classValues249);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:63:8: ( 'params' COLON ( classParameters )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==37) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:63:9: 'params' COLON ( classParameters )+
					{
					match(input,37,FOLLOW_37_in_classValues263); 
					match(input,COLON,FOLLOW_COLON_in_classValues265); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:63:24: ( classParameters )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:63:25: classParameters
							{
							pushFollow(FOLLOW_classParameters_in_classValues268);
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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:64:8: ( 'methods' COLON ( classMethods )+ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==36) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:64:9: 'methods' COLON ( classMethods )+
					{
					match(input,36,FOLLOW_36_in_classValues282); 
					match(input,COLON,FOLLOW_COLON_in_classValues284); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:64:25: ( classMethods )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:64:26: classMethods
							{
							pushFollow(FOLLOW_classMethods_in_classValues287);
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:67:1: interfaceDefinition : 'interface' 'id' COLON ID ( 'params' COLON ( interfaceParams )+ )? ( 'methods' COLON ( interfaceMethods )+ )? 'endInterface' ;
	public final void interfaceDefinition() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:68:5: ( 'interface' 'id' COLON ID ( 'params' COLON ( interfaceParams )+ )? ( 'methods' COLON ( interfaceMethods )+ )? 'endInterface' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:68:8: 'interface' 'id' COLON ID ( 'params' COLON ( interfaceParams )+ )? ( 'methods' COLON ( interfaceMethods )+ )? 'endInterface'
			{
			match(input,35,FOLLOW_35_in_interfaceDefinition309); 
			match(input,32,FOLLOW_32_in_interfaceDefinition318); 
			match(input,COLON,FOLLOW_COLON_in_interfaceDefinition320); 
			match(input,ID,FOLLOW_ID_in_interfaceDefinition322); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:70:8: ( 'params' COLON ( interfaceParams )+ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==37) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:70:9: 'params' COLON ( interfaceParams )+
					{
					match(input,37,FOLLOW_37_in_interfaceDefinition332); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition334); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:70:24: ( interfaceParams )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:70:25: interfaceParams
							{
							pushFollow(FOLLOW_interfaceParams_in_interfaceDefinition337);
							interfaceParams();
							state._fsp--;

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

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:71:8: ( 'methods' COLON ( interfaceMethods )+ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==36) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:71:9: 'methods' COLON ( interfaceMethods )+
					{
					match(input,36,FOLLOW_36_in_interfaceDefinition351); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition353); 
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:71:25: ( interfaceMethods )+
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
							// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:71:26: interfaceMethods
							{
							pushFollow(FOLLOW_interfaceMethods_in_interfaceDefinition356);
							interfaceMethods();
							state._fsp--;

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

			match(input,30,FOLLOW_30_in_interfaceDefinition369); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:75:1: classRelations : ID cardinality ( COMMA ID cardinality )* ;
	public final void classRelations() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:76:5: ( ID cardinality ( COMMA ID cardinality )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:76:8: ID cardinality ( COMMA ID cardinality )*
			{
			match(input,ID,FOLLOW_ID_in_classRelations391); 
			pushFollow(FOLLOW_cardinality_in_classRelations393);
			cardinality();
			state._fsp--;

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:76:23: ( COMMA ID cardinality )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:76:24: COMMA ID cardinality
					{
					match(input,COMMA,FOLLOW_COMMA_in_classRelations396); 
					match(input,ID,FOLLOW_ID_in_classRelations398); 
					pushFollow(FOLLOW_cardinality_in_classRelations400);
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:79:1: interfaceParams : PLUS ID ( COLON type )? ;
	public final void interfaceParams() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:80:5: ( PLUS ID ( COLON type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:80:8: PLUS ID ( COLON type )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_interfaceParams420); 
			match(input,ID,FOLLOW_ID_in_interfaceParams422); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:80:16: ( COLON type )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==COLON) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:80:17: COLON type
					{
					match(input,COLON,FOLLOW_COLON_in_interfaceParams425); 
					pushFollow(FOLLOW_type_in_interfaceParams427);
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
	// $ANTLR end "interfaceParams"



	// $ANTLR start "interfaceMethods"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:83:1: interfaceMethods : PLUS ID LP ( methodParams )? RP ( COLON type )? ;
	public final void interfaceMethods() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:84:5: ( PLUS ID LP ( methodParams )? RP ( COLON type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:84:8: PLUS ID LP ( methodParams )? RP ( COLON type )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_interfaceMethods451); 
			match(input,ID,FOLLOW_ID_in_interfaceMethods453); 
			match(input,LP,FOLLOW_LP_in_interfaceMethods455); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:84:19: ( methodParams )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:84:19: methodParams
					{
					pushFollow(FOLLOW_methodParams_in_interfaceMethods457);
					methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_interfaceMethods460); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:84:36: ( COLON type )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==COLON) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:84:37: COLON type
					{
					match(input,COLON,FOLLOW_COLON_in_interfaceMethods463); 
					pushFollow(FOLLOW_type_in_interfaceMethods465);
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
	// $ANTLR end "interfaceMethods"



	// $ANTLR start "classParameters"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:87:1: classParameters : visibility ID ( COLON type )? ;
	public final void classParameters() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:88:5: ( visibility ID ( COLON type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:88:7: visibility ID ( COLON type )?
			{
			pushFollow(FOLLOW_visibility_in_classParameters484);
			visibility();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_classParameters486); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:88:21: ( COLON type )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==COLON) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:88:22: COLON type
					{
					match(input,COLON,FOLLOW_COLON_in_classParameters489); 
					pushFollow(FOLLOW_type_in_classParameters491);
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:91:1: interfaces : ID ( COMMA ID )* ;
	public final void interfaces() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:92:5: ( ID ( COMMA ID )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:92:9: ID ( COMMA ID )*
			{
			match(input,ID,FOLLOW_ID_in_interfaces516); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:92:12: ( COMMA ID )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:92:13: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaces519); 
					match(input,ID,FOLLOW_ID_in_interfaces521); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:95:1: classes : ID ( COMMA ID )* ;
	public final void classes() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:96:5: ( ID ( COMMA ID )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:96:8: ID ( COMMA ID )*
			{
			match(input,ID,FOLLOW_ID_in_classes541); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:96:11: ( COMMA ID )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:96:12: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_classes544); 
					match(input,ID,FOLLOW_ID_in_classes546); 
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:99:1: classMethods : visibility ID LP ( methodParams )? RP ( COLON type )? ;
	public final void classMethods() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:100:5: ( visibility ID LP ( methodParams )? RP ( COLON type )? )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:100:7: visibility ID LP ( methodParams )? RP ( COLON type )?
			{
			pushFollow(FOLLOW_visibility_in_classMethods573);
			visibility();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_classMethods575); 
			match(input,LP,FOLLOW_LP_in_classMethods577); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:100:24: ( methodParams )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ID) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:100:24: methodParams
					{
					pushFollow(FOLLOW_methodParams_in_classMethods579);
					methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_classMethods582); 
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:100:41: ( COLON type )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==COLON) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:100:42: COLON type
					{
					match(input,COLON,FOLLOW_COLON_in_classMethods585); 
					pushFollow(FOLLOW_type_in_classMethods587);
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



	// $ANTLR start "methodParams"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:103:1: methodParams : ID COLON type ( COMMA ID COLON type )* ;
	public final void methodParams() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:104:5: ( ID COLON type ( COMMA ID COLON type )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:104:9: ID COLON type ( COMMA ID COLON type )*
			{
			match(input,ID,FOLLOW_ID_in_methodParams612); 
			match(input,COLON,FOLLOW_COLON_in_methodParams614); 
			pushFollow(FOLLOW_type_in_methodParams616);
			type();
			state._fsp--;

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:104:23: ( COMMA ID COLON type )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:104:24: COMMA ID COLON type
					{
					match(input,COMMA,FOLLOW_COMMA_in_methodParams619); 
					match(input,ID,FOLLOW_ID_in_methodParams621); 
					match(input,COLON,FOLLOW_COLON_in_methodParams623); 
					pushFollow(FOLLOW_type_in_methodParams625);
					type();
					state._fsp--;

					}
					break;

				default :
					break loop25;
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
	// $ANTLR end "methodParams"



	// $ANTLR start "visibility"
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:107:1: visibility : ( PLUS | MINUS | HASHTAG ) ;
	public final void visibility() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:108:5: ( ( PLUS | MINUS | HASHTAG ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:111:1: cardinality : ( '0..1' | '1' | '0..*' | '1..*' ) ;
	public final void cardinality() throws RecognitionException {
		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:112:5: ( ( '0..1' | '1' | '0..*' | '1..*' ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:
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
	// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:115:1: type returns [Token t] : (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID ) ;
	public final Token type() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:116:3: ( (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:116:4: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID )
			{
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:116:4: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' |x= ID )
			int alt26=6;
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
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:116:6: x= 'int'
					{
					x=(Token)match(input,34,FOLLOW_34_in_type721); 
					}
					break;
				case 2 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:117:5: x= 'double'
					{
					x=(Token)match(input,27,FOLLOW_27_in_type733); 
					}
					break;
				case 3 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:118:5: x= 'char'
					{
					x=(Token)match(input,25,FOLLOW_25_in_type744); 
					}
					break;
				case 4 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:119:5: x= 'boolean'
					{
					x=(Token)match(input,24,FOLLOW_24_in_type755); 
					}
					break;
				case 5 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:120:5: x= 'String'
					{
					x=(Token)match(input,22,FOLLOW_22_in_type766); 
					}
					break;
				case 6 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\UmlDesigner.g:121:5: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_type777); 
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
	public static final BitSet FOLLOW_classValues_in_abstractClassDefinition152 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_abstractClassDefinition161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_classValues190 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues192 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classValues194 = new BitSet(new long[]{0x0000007280000002L});
	public static final BitSet FOLLOW_33_in_classValues204 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues206 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_interfaces_in_classValues209 = new BitSet(new long[]{0x0000007080000802L});
	public static final BitSet FOLLOW_31_in_classValues224 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues226 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_classes_in_classValues229 = new BitSet(new long[]{0x0000007000000802L});
	public static final BitSet FOLLOW_38_in_classValues244 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues246 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_classRelations_in_classValues249 = new BitSet(new long[]{0x0000003000000802L});
	public static final BitSet FOLLOW_37_in_classValues263 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues265 = new BitSet(new long[]{0x0000000000006400L});
	public static final BitSet FOLLOW_classParameters_in_classValues268 = new BitSet(new long[]{0x0000001000006402L});
	public static final BitSet FOLLOW_36_in_classValues282 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_classValues284 = new BitSet(new long[]{0x0000000000006400L});
	public static final BitSet FOLLOW_classMethods_in_classValues287 = new BitSet(new long[]{0x0000000000006402L});
	public static final BitSet FOLLOW_35_in_interfaceDefinition309 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_interfaceDefinition318 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition320 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceDefinition322 = new BitSet(new long[]{0x0000003040000000L});
	public static final BitSet FOLLOW_37_in_interfaceDefinition332 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition334 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_interfaceParams_in_interfaceDefinition337 = new BitSet(new long[]{0x0000001040004000L});
	public static final BitSet FOLLOW_36_in_interfaceDefinition351 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition353 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_interfaceMethods_in_interfaceDefinition356 = new BitSet(new long[]{0x0000000040004000L});
	public static final BitSet FOLLOW_30_in_interfaceDefinition369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_classRelations391 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations393 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_classRelations396 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classRelations398 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_classRelations400 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_PLUS_in_interfaceParams420 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceParams422 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_interfaceParams425 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_interfaceParams427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_interfaceMethods451 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaceMethods453 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_interfaceMethods455 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_methodParams_in_interfaceMethods457 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_interfaceMethods460 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_interfaceMethods463 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_interfaceMethods465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibility_in_classParameters484 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classParameters486 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_classParameters489 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_classParameters491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_interfaces516 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_interfaces519 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_interfaces521 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ID_in_classes541 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_classes544 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classes546 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_visibility_in_classMethods573 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_classMethods575 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_classMethods577 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_methodParams_in_classMethods579 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_RP_in_classMethods582 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COLON_in_classMethods585 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_classMethods587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodParams612 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_methodParams614 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_methodParams616 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_methodParams619 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_methodParams621 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_methodParams623 = new BitSet(new long[]{0x000000040B400800L});
	public static final BitSet FOLLOW_type_in_methodParams625 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_34_in_type721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_type733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_type744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_type755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_type766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type777 = new BitSet(new long[]{0x0000000000000002L});
}
