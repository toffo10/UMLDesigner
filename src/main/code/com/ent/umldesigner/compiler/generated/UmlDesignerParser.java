// $ANTLR 3.5.1 D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g 2022-09-15 22:17:32

package com.ent.umldesigner.compiler.generated;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import javafx.util.Pair;
import com.ent.umldesigner.compiler.objects.*;
import com.ent.umldesigner.compiler.handlers.*;
import com.ent.umldesigner.compiler.error.Error;


import org.antlr.runtime.*;

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
	@Override public String getGrammarFileName() { return "D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g"; }


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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:69:1: initUml : ( abstractClassDefinition | classDefinition | interfaceDefinition )+ ;
	public final void initUml() throws RecognitionException {
		 setUp(); 
		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:71:5: ( ( abstractClassDefinition | classDefinition | interfaceDefinition )+ )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:71:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )+
			{
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:71:7: ( abstractClassDefinition | classDefinition | interfaceDefinition )+
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
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:71:8: abstractClassDefinition
					{
					pushFollow(FOLLOW_abstractClassDefinition_in_initUml73);
					abstractClassDefinition();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:71:34: classDefinition
					{
					pushFollow(FOLLOW_classDefinition_in_initUml77);
					classDefinition();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:71:52: interfaceDefinition
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:74:1: classDefinition : 'class' 'id' COLON i= ID classValues[$i] 'endClass' ;
	public final void classDefinition() throws RecognitionException {
		Token i=null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:75:5: ( 'class' 'id' COLON i= ID classValues[$i] 'endClass' )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:75:8: 'class' 'id' COLON i= ID classValues[$i] 'endClass'
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:81:1: abstractClassDefinition : 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass' ;
	public final void abstractClassDefinition() throws RecognitionException {
		Token i=null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:82:5: ( 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass' )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:82:8: 'abstractClass' 'id' COLON i= ID classValues[$i] 'endAbstractClass'
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:88:1: classValues[Token i] : ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= componentRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )? ;
	public final void classValues(Token i) throws RecognitionException {
		List<String> ifs =null;
		List<String> c =null;
		List<Pair> cr =null;
		Param p =null;
		Method m =null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:89:5: ( ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= componentRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )? )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:89:8: ( 'implements' COLON (ifs= interfaces )+ )? ( 'extends' COLON (c= classes )+ )? ( 'relations' COLON (cr= componentRelations )+ )? ( 'params' COLON (p= classParameters )+ )? ( 'methods' COLON (m= classMethods )+ )?
			{
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:89:8: ( 'implements' COLON (ifs= interfaces )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==33) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:89:9: 'implements' COLON (ifs= interfaces )+
					{
					match(input,33,FOLLOW_33_in_classValues227); 
					match(input,COLON,FOLLOW_COLON_in_classValues229); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:89:28: (ifs= interfaces )+
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
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:89:29: ifs= interfaces
							{
							pushFollow(FOLLOW_interfaces_in_classValues236);
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

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:90:8: ( 'extends' COLON (c= classes )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==31) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:90:9: 'extends' COLON (c= classes )+
					{
					match(input,31,FOLLOW_31_in_classValues253); 
					match(input,COLON,FOLLOW_COLON_in_classValues255); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:90:25: (c= classes )+
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
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:90:26: c= classes
							{
							pushFollow(FOLLOW_classes_in_classValues262);
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

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:91:8: ( 'relations' COLON (cr= componentRelations )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==38) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:91:9: 'relations' COLON (cr= componentRelations )+
					{
					match(input,38,FOLLOW_38_in_classValues279); 
					match(input,COLON,FOLLOW_COLON_in_classValues281); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:91:27: (cr= componentRelations )+
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
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:91:28: cr= componentRelations
							{
							pushFollow(FOLLOW_componentRelations_in_classValues288);
							cr=componentRelations();
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

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:92:8: ( 'params' COLON (p= classParameters )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==37) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:92:9: 'params' COLON (p= classParameters )+
					{
					match(input,37,FOLLOW_37_in_classValues304); 
					match(input,COLON,FOLLOW_COLON_in_classValues306); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:92:25: (p= classParameters )+
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
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:92:26: p= classParameters
							{
							pushFollow(FOLLOW_classParameters_in_classValues314);
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

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:93:8: ( 'methods' COLON (m= classMethods )+ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==36) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:93:9: 'methods' COLON (m= classMethods )+
					{
					match(input,36,FOLLOW_36_in_classValues330); 
					match(input,COLON,FOLLOW_COLON_in_classValues332); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:93:25: (m= classMethods )+
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
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:93:26: m= classMethods
							{
							pushFollow(FOLLOW_classMethods_in_classValues339);
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:96:1: interfaces returns [List<String> ifList] : i= ID ( COMMA i1= ID )* ;
	public final List<String> interfaces() throws RecognitionException {
		List<String> ifList = null;


		Token i=null;
		Token i1=null;

		 ifList = new ArrayList<String>(); 
		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:98:5: (i= ID ( COMMA i1= ID )* )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:98:9: i= ID ( COMMA i1= ID )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaces386); 
			 ifList.add(i.getText());  
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:99:9: ( COMMA i1= ID )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:99:10: COMMA i1= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_interfaces401); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_interfaces407); 
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:102:1: classes returns [List<String> classList] : i= ID ( COMMA i1= ID )* ;
	public final List<String> classes() throws RecognitionException {
		List<String> classList = null;


		Token i=null;
		Token i1=null;

		 classList = new ArrayList<String>(); 
		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:104:5: (i= ID ( COMMA i1= ID )* )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:104:8: i= ID ( COMMA i1= ID )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_classes443); 
			 classList.add(i.getText()) ; 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:105:7: ( COMMA i1= ID )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:105:8: COMMA i1= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_classes456); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_classes462); 
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



	// $ANTLR start "componentRelations"
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:108:1: componentRelations returns [List<Pair> classList] : i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )* ;
	public final List<Pair> componentRelations() throws RecognitionException {
		List<Pair> classList = null;


		Token i=null;
		Token i1=null;
		Token c1 =null;
		Token c2 =null;
		Token c3 =null;
		Token c4 =null;

		 classList = new ArrayList<>(); 
		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:110:5: (i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )* )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:110:8: i= ID c1= cardinality '/' c2= cardinality ( COMMA i1= ID c3= cardinality '/' c4= cardinality )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_componentRelations504); 
			pushFollow(FOLLOW_cardinality_in_componentRelations510);
			c1=cardinality();
			state._fsp--;

			match(input,17,FOLLOW_17_in_componentRelations512); 
			pushFollow(FOLLOW_cardinality_in_componentRelations518);
			c2=cardinality();
			state._fsp--;

			 classList.add(new Pair<>(i.getText(),  c1.getText() + '/' + c2.getText())); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:111:7: ( COMMA i1= ID c3= cardinality '/' c4= cardinality )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:111:8: COMMA i1= ID c3= cardinality '/' c4= cardinality
					{
					match(input,COMMA,FOLLOW_COMMA_in_componentRelations537); 
					i1=(Token)match(input,ID,FOLLOW_ID_in_componentRelations543); 
					pushFollow(FOLLOW_cardinality_in_componentRelations549);
					c3=cardinality();
					state._fsp--;

					match(input,17,FOLLOW_17_in_componentRelations551); 
					pushFollow(FOLLOW_cardinality_in_componentRelations557);
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
	// $ANTLR end "componentRelations"



	// $ANTLR start "classParameters"
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:114:1: classParameters returns [Param ip] : v= visibility i= ID ( COLON t= type ) ;
	public final Param classParameters() throws RecognitionException {
		Param ip = null;


		Token i=null;
		Token v =null;
		String t =null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:115:5: (v= visibility i= ID ( COLON t= type ) )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:115:7: v= visibility i= ID ( COLON t= type )
			{
			pushFollow(FOLLOW_visibility_in_classParameters591);
			v=visibility();
			state._fsp--;

			i=(Token)match(input,ID,FOLLOW_ID_in_classParameters597); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:115:29: ( COLON t= type )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:115:30: COLON t= type
			{
			match(input,COLON,FOLLOW_COLON_in_classParameters600); 
			pushFollow(FOLLOW_type_in_classParameters606);
			t=type();
			state._fsp--;

			}

			 ip = h.returnParam(i.getText(), v.getText(), t); 
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:118:1: classMethods returns [Method im] : v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )? ;
	public final Method classMethods() throws RecognitionException {
		Method im = null;


		Token i=null;
		Token v =null;
		List<MethodParam> p =null;
		String t =null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:119:5: (v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )? )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:119:7: v= visibility i= ID LP (p= methodParams )? RP ( COLON t= type )?
			{
			pushFollow(FOLLOW_visibility_in_classMethods634);
			v=visibility();
			state._fsp--;

			i=(Token)match(input,ID,FOLLOW_ID_in_classMethods640); 
			match(input,LP,FOLLOW_LP_in_classMethods642); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:119:34: (p= methodParams )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:119:34: p= methodParams
					{
					pushFollow(FOLLOW_methodParams_in_classMethods648);
					p=methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_classMethods651); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:119:53: ( COLON t= type )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==COLON) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:119:54: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_classMethods654); 
					pushFollow(FOLLOW_type_in_classMethods660);
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



	// $ANTLR start "methodParams"
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:122:1: methodParams returns [List<MethodParam> imp] : i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* ;
	public final List<MethodParam> methodParams() throws RecognitionException {
		List<MethodParam> imp = null;


		Token i1=null;
		Token i2=null;
		String t1 =null;
		String t2 =null;

		 imp = new ArrayList<MethodParam>(); 
		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:124:5: (i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )* )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:124:9: i1= ID COLON t1= type ( COMMA i2= ID COLON t2= type )*
			{
			i1=(Token)match(input,ID,FOLLOW_ID_in_methodParams700); 
			match(input,COLON,FOLLOW_COLON_in_methodParams702); 
			pushFollow(FOLLOW_type_in_methodParams708);
			t1=type();
			state._fsp--;

			 h.addMethodParam(imp, i1.getText(), t1); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:125:8: ( COMMA i2= ID COLON t2= type )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:125:9: COMMA i2= ID COLON t2= type
					{
					match(input,COMMA,FOLLOW_COMMA_in_methodParams726); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_methodParams732); 
					match(input,COLON,FOLLOW_COLON_in_methodParams734); 
					pushFollow(FOLLOW_type_in_methodParams740);
					t2=type();
					state._fsp--;

					 h.addMethodParam(imp, i2.getText(), t2); 
					}
					break;

				default :
					break loop17;
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



	// $ANTLR start "interfaceDefinition"
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:129:1: interfaceDefinition : 'interface' 'id' COLON i= ID ( 'extends' COLON (ifs= interfaces )+ )? ( 'relations' COLON (cr= componentRelations )+ )? ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' ;
	public final void interfaceDefinition() throws RecognitionException {
		Token i=null;
		List<String> ifs =null;
		List<Pair> cr =null;
		Param p =null;
		Method m =null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:130:5: ( 'interface' 'id' COLON i= ID ( 'extends' COLON (ifs= interfaces )+ )? ( 'relations' COLON (cr= componentRelations )+ )? ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface' )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:130:8: 'interface' 'id' COLON i= ID ( 'extends' COLON (ifs= interfaces )+ )? ( 'relations' COLON (cr= componentRelations )+ )? ( 'params' COLON (p= interfaceParams )+ )? ( 'methods' COLON (m= interfaceMethods )+ )? 'endInterface'
			{
			match(input,35,FOLLOW_35_in_interfaceDefinition771); 
			match(input,32,FOLLOW_32_in_interfaceDefinition780); 
			match(input,COLON,FOLLOW_COLON_in_interfaceDefinition782); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceDefinition788); 
			 h.createNewInterface(i); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:132:8: ( 'extends' COLON (ifs= interfaces )+ )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==31) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:132:9: 'extends' COLON (ifs= interfaces )+
					{
					match(input,31,FOLLOW_31_in_interfaceDefinition800); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition802); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:132:25: (ifs= interfaces )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==ID) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:132:26: ifs= interfaces
							{
							pushFollow(FOLLOW_interfaces_in_interfaceDefinition809);
							ifs=interfaces();
							state._fsp--;

							 h.addExtension(i, ifs); 
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					}
					break;

			}

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:133:8: ( 'relations' COLON (cr= componentRelations )+ )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==38) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:133:9: 'relations' COLON (cr= componentRelations )+
					{
					match(input,38,FOLLOW_38_in_interfaceDefinition826); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition828); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:133:27: (cr= componentRelations )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==ID) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:133:28: cr= componentRelations
							{
							pushFollow(FOLLOW_componentRelations_in_interfaceDefinition835);
							cr=componentRelations();
							state._fsp--;

							 h.addRelations(i, cr); 
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					}
					break;

			}

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:134:8: ( 'params' COLON (p= interfaceParams )+ )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==37) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:134:9: 'params' COLON (p= interfaceParams )+
					{
					match(input,37,FOLLOW_37_in_interfaceDefinition851); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition853); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:134:25: (p= interfaceParams )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==PLUS) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:134:26: p= interfaceParams
							{
							pushFollow(FOLLOW_interfaceParams_in_interfaceDefinition861);
							p=interfaceParams();
							state._fsp--;

							 h.addParams(i, p); 
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					}
					break;

			}

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:135:8: ( 'methods' COLON (m= interfaceMethods )+ )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==36) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:135:9: 'methods' COLON (m= interfaceMethods )+
					{
					match(input,36,FOLLOW_36_in_interfaceDefinition880); 
					match(input,COLON,FOLLOW_COLON_in_interfaceDefinition882); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:135:25: (m= interfaceMethods )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==PLUS) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:135:26: m= interfaceMethods
							{
							pushFollow(FOLLOW_interfaceMethods_in_interfaceDefinition889);
							m=interfaceMethods();
							state._fsp--;

							 h.addMethod(i, m); 
							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					}
					break;

			}

			match(input,30,FOLLOW_30_in_interfaceDefinition906); 
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:139:1: interfaceParams returns [Param ip] : v= PLUS i= ID COLON t= type ;
	public final Param interfaceParams() throws RecognitionException {
		Param ip = null;


		Token v=null;
		Token i=null;
		String t =null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:140:5: (v= PLUS i= ID COLON t= type )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:140:8: v= PLUS i= ID COLON t= type
			{
			v=(Token)match(input,PLUS,FOLLOW_PLUS_in_interfaceParams936); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceParams942); 
			match(input,COLON,FOLLOW_COLON_in_interfaceParams944); 
			pushFollow(FOLLOW_type_in_interfaceParams950);
			t=type();
			state._fsp--;

			 ip = h.returnParam(i.getText(), v.getText(), t); 
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:143:1: interfaceMethods returns [Method im] : v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? ;
	public final Method interfaceMethods() throws RecognitionException {
		Method im = null;


		Token v=null;
		Token i=null;
		List<MethodParam> p =null;
		String t =null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:144:5: (v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )? )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:144:8: v= PLUS i= ID LP (p= methodParams )? RP ( COLON t= type )?
			{
			v=(Token)match(input,PLUS,FOLLOW_PLUS_in_interfaceMethods982); 
			i=(Token)match(input,ID,FOLLOW_ID_in_interfaceMethods988); 
			match(input,LP,FOLLOW_LP_in_interfaceMethods990); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:144:29: (p= methodParams )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ID) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:144:29: p= methodParams
					{
					pushFollow(FOLLOW_methodParams_in_interfaceMethods996);
					p=methodParams();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_interfaceMethods999); 
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:144:48: ( COLON t= type )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==COLON) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:144:49: COLON t= type
					{
					match(input,COLON,FOLLOW_COLON_in_interfaceMethods1002); 
					pushFollow(FOLLOW_type_in_interfaceMethods1008);
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



	// $ANTLR start "visibility"
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:147:1: visibility returns [Token t] : (x= PLUS |x= MINUS ) ;
	public final Token visibility() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:148:5: ( (x= PLUS |x= MINUS ) )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:148:7: (x= PLUS |x= MINUS )
			{
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:148:7: (x= PLUS |x= MINUS )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==PLUS) ) {
				alt28=1;
			}
			else if ( (LA28_0==MINUS) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:148:8: x= PLUS
					{
					x=(Token)match(input,PLUS,FOLLOW_PLUS_in_visibility1042); 
					}
					break;
				case 2 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:148:19: x= MINUS
					{
					x=(Token)match(input,MINUS,FOLLOW_MINUS_in_visibility1050); 
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:151:1: cardinality returns [Token t] : (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' ) ;
	public final Token cardinality() throws RecognitionException {
		Token t = null;


		Token x=null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:152:5: ( (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' ) )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:152:7: (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' )
			{
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:152:7: (x= '0..1' |x= '1' |x= '0..*' |x= '1..*' )
			int alt29=4;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt29=1;
				}
				break;
			case 20:
				{
				alt29=2;
				}
				break;
			case 18:
				{
				alt29=3;
				}
				break;
			case 21:
				{
				alt29=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:152:8: x= '0..1'
					{
					x=(Token)match(input,19,FOLLOW_19_in_cardinality1083); 
					}
					break;
				case 2 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:153:7: x= '1'
					{
					x=(Token)match(input,20,FOLLOW_20_in_cardinality1096); 
					}
					break;
				case 3 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:154:7: x= '0..*'
					{
					x=(Token)match(input,18,FOLLOW_18_in_cardinality1109); 
					}
					break;
				case 4 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:155:7: x= '1..*'
					{
					x=(Token)match(input,21,FOLLOW_21_in_cardinality1122); 
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:159:1: type returns [String t] : ( (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' ) |x= ID (gen= generics )? );
	public final String type() throws RecognitionException {
		String t = null;


		Token x=null;
		String gen =null;

		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:160:3: ( (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' ) |x= ID (gen= generics )? )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==22||(LA32_0 >= 24 && LA32_0 <= 25)||LA32_0==27||LA32_0==34) ) {
				alt32=1;
			}
			else if ( (LA32_0==ID) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:160:5: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' )
					{
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:160:5: (x= 'int' |x= 'double' |x= 'char' |x= 'boolean' |x= 'String' )
					int alt30=5;
					switch ( input.LA(1) ) {
					case 34:
						{
						alt30=1;
						}
						break;
					case 27:
						{
						alt30=2;
						}
						break;
					case 25:
						{
						alt30=3;
						}
						break;
					case 24:
						{
						alt30=4;
						}
						break;
					case 22:
						{
						alt30=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}
					switch (alt30) {
						case 1 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:160:7: x= 'int'
							{
							x=(Token)match(input,34,FOLLOW_34_in_type1158); 
							}
							break;
						case 2 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:161:5: x= 'double'
							{
							x=(Token)match(input,27,FOLLOW_27_in_type1170); 
							}
							break;
						case 3 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:162:5: x= 'char'
							{
							x=(Token)match(input,25,FOLLOW_25_in_type1181); 
							}
							break;
						case 4 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:163:5: x= 'boolean'
							{
							x=(Token)match(input,24,FOLLOW_24_in_type1192); 
							}
							break;
						case 5 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:164:5: x= 'String'
							{
							x=(Token)match(input,22,FOLLOW_22_in_type1203); 
							}
							break;

					}

					 t = x.getText(); 
					}
					break;
				case 2 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:165:5: x= ID (gen= generics )?
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_type1217); 
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:165:16: (gen= generics )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==LESSER) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:165:16: gen= generics
							{
							pushFollow(FOLLOW_generics_in_type1223);
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
	// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:168:1: generics returns [String s] : LESSER t= type ( COMMA t1= type )* GREATER ;
	public final String generics() throws RecognitionException {
		String s = null;


		String t =null;
		String t1 =null;

		 String generics = ""; 
		try {
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:170:3: ( LESSER t= type ( COMMA t1= type )* GREATER )
			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:170:5: LESSER t= type ( COMMA t1= type )* GREATER
			{
			match(input,LESSER,FOLLOW_LESSER_in_generics1250); 
			pushFollow(FOLLOW_type_in_generics1256);
			t=type();
			state._fsp--;

			// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:170:21: ( COMMA t1= type )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\Programming\\Universita\\UMLDesigner\\UMLDesigner\\src\\main\\code\\com.ent.umldesigner.compiler\\generated\\UmlDesigner.g:170:22: COMMA t1= type
					{
					match(input,COMMA,FOLLOW_COMMA_in_generics1259); 
					pushFollow(FOLLOW_type_in_generics1265);
					t1=type();
					state._fsp--;

					 generics += "," + t1; 
					}
					break;

				default :
					break loop33;
				}
			}

			match(input,GREATER,FOLLOW_GREATER_in_generics1271); 
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
	public static final BitSet FOLLOW_33_in_classValues227 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues229 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_interfaces_in_classValues236 = new BitSet(new long[]{0x0000007080000202L});
	public static final BitSet FOLLOW_31_in_classValues253 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues255 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_classes_in_classValues262 = new BitSet(new long[]{0x0000007000000202L});
	public static final BitSet FOLLOW_38_in_classValues279 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues281 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_componentRelations_in_classValues288 = new BitSet(new long[]{0x0000003000000202L});
	public static final BitSet FOLLOW_37_in_classValues304 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues306 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_classParameters_in_classValues314 = new BitSet(new long[]{0x0000001000003002L});
	public static final BitSet FOLLOW_36_in_classValues330 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classValues332 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_classMethods_in_classValues339 = new BitSet(new long[]{0x0000000000003002L});
	public static final BitSet FOLLOW_ID_in_interfaces386 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_interfaces401 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaces407 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ID_in_classes443 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_classes456 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classes462 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ID_in_componentRelations504 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_componentRelations510 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_componentRelations512 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_componentRelations518 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_componentRelations537 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_componentRelations543 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_componentRelations549 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_componentRelations551 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_cardinality_in_componentRelations557 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_visibility_in_classParameters591 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classParameters597 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_classParameters600 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_classParameters606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_visibility_in_classMethods634 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_classMethods640 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_LP_in_classMethods642 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_methodParams_in_classMethods648 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_RP_in_classMethods651 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COLON_in_classMethods654 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_classMethods660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodParams700 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_methodParams702 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_methodParams708 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_methodParams726 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_methodParams732 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_methodParams734 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_methodParams740 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_35_in_interfaceDefinition771 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_interfaceDefinition780 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition782 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaceDefinition788 = new BitSet(new long[]{0x00000070C0000000L});
	public static final BitSet FOLLOW_31_in_interfaceDefinition800 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition802 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_interfaces_in_interfaceDefinition809 = new BitSet(new long[]{0x0000007040000200L});
	public static final BitSet FOLLOW_38_in_interfaceDefinition826 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition828 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_componentRelations_in_interfaceDefinition835 = new BitSet(new long[]{0x0000003040000200L});
	public static final BitSet FOLLOW_37_in_interfaceDefinition851 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition853 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_interfaceParams_in_interfaceDefinition861 = new BitSet(new long[]{0x0000001040002000L});
	public static final BitSet FOLLOW_36_in_interfaceDefinition880 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceDefinition882 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_interfaceMethods_in_interfaceDefinition889 = new BitSet(new long[]{0x0000000040002000L});
	public static final BitSet FOLLOW_30_in_interfaceDefinition906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_interfaceParams936 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaceParams942 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_COLON_in_interfaceParams944 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_interfaceParams950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_interfaceMethods982 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_interfaceMethods988 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_LP_in_interfaceMethods990 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_methodParams_in_interfaceMethods996 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_RP_in_interfaceMethods999 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COLON_in_interfaceMethods1002 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_interfaceMethods1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_visibility1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_visibility1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_cardinality1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_cardinality1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_cardinality1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_cardinality1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_type1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_type1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_type1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_type1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_type1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type1217 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_generics_in_type1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_generics1250 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_generics1256 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_COMMA_in_generics1259 = new BitSet(new long[]{0x000000040B400200L});
	public static final BitSet FOLLOW_type_in_generics1265 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_GREATER_in_generics1271 = new BitSet(new long[]{0x0000000000000002L});
}
