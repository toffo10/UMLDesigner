// $ANTLR 3.5.1 D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g 2022-03-10 16:08:27

package compiler.generated;

import compiler.handlers.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class UmlDesignerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public UmlDesignerLexer() {} 
	public UmlDesignerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public UmlDesignerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:15:7: ( '0..*' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:15:9: '0..*'
			{
			match("0..*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:16:7: ( '0..1' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:16:9: '0..1'
			{
			match("0..1"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:17:7: ( '1' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:17:9: '1'
			{
			match('1'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:18:7: ( '1..*' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:18:9: '1..*'
			{
			match("1..*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:19:7: ( 'String' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:19:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:20:7: ( 'abstractClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:20:9: 'abstractClass'
			{
			match("abstractClass"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:21:7: ( 'boolean' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:21:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:22:7: ( 'char' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:22:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:23:7: ( 'class' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:23:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:24:7: ( 'double' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:24:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:25:7: ( 'endAbstractClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:25:9: 'endAbstractClass'
			{
			match("endAbstractClass"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:26:7: ( 'endClass' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:26:9: 'endClass'
			{
			match("endClass"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:27:7: ( 'endInterface' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:27:9: 'endInterface'
			{
			match("endInterface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:28:7: ( 'extends' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:28:9: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:29:7: ( 'id' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:29:9: 'id'
			{
			match("id"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:30:7: ( 'implements' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:30:9: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:31:7: ( 'int' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:31:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:32:7: ( 'interface' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:32:9: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:33:7: ( 'methods' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:33:9: 'methods'
			{
			match("methods"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:34:7: ( 'params' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:34:9: 'params'
			{
			match("params"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:35:7: ( 'relations' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:35:9: 'relations'
			{
			match("relations"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:162:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:162:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:162:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:166:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:166:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:166:14: (~ ( '\\n' | '\\r' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:166:28: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:166:28: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:170:5: ( '+' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:170:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:174:5: ( '-' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:174:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "HASHTAG"
	public final void mHASHTAG() throws RecognitionException {
		try {
			int _type = HASHTAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:178:5: ( '#' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:178:7: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASHTAG"

	// $ANTLR start "DOUBLE_DOT"
	public final void mDOUBLE_DOT() throws RecognitionException {
		try {
			int _type = DOUBLE_DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:182:5: ( '..' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:182:7: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_DOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:185:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:185:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:193:5: ( ',' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:193:7: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:197:5: ( ':' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:197:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:201:5: ( '(' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:201:7: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:205:5: ( ')' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:205:7: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:209:5: ( '$' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:209:7: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:213:5: ( '*' )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:213:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASTERISK"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:216:12: ( . )
			// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:216:14: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | ID | COMMENT | PLUS | MINUS | HASHTAG | DOUBLE_DOT | WS | COMMA | COLON | LP | RP | DOLLAR | ASTERISK | SCAN_ERROR )
		int alt4=35;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:52: T__25
				{
				mT__25(); 

				}
				break;
			case 9 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:58: T__26
				{
				mT__26(); 

				}
				break;
			case 10 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:64: T__27
				{
				mT__27(); 

				}
				break;
			case 11 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:70: T__28
				{
				mT__28(); 

				}
				break;
			case 12 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:76: T__29
				{
				mT__29(); 

				}
				break;
			case 13 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:82: T__30
				{
				mT__30(); 

				}
				break;
			case 14 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:88: T__31
				{
				mT__31(); 

				}
				break;
			case 15 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:94: T__32
				{
				mT__32(); 

				}
				break;
			case 16 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:100: T__33
				{
				mT__33(); 

				}
				break;
			case 17 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:106: T__34
				{
				mT__34(); 

				}
				break;
			case 18 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:112: T__35
				{
				mT__35(); 

				}
				break;
			case 19 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:118: T__36
				{
				mT__36(); 

				}
				break;
			case 20 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:124: T__37
				{
				mT__37(); 

				}
				break;
			case 21 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:130: T__38
				{
				mT__38(); 

				}
				break;
			case 22 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:136: ID
				{
				mID(); 

				}
				break;
			case 23 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:139: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 24 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:147: PLUS
				{
				mPLUS(); 

				}
				break;
			case 25 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:152: MINUS
				{
				mMINUS(); 

				}
				break;
			case 26 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:158: HASHTAG
				{
				mHASHTAG(); 

				}
				break;
			case 27 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:166: DOUBLE_DOT
				{
				mDOUBLE_DOT(); 

				}
				break;
			case 28 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:177: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:180: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 30 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:186: COLON
				{
				mCOLON(); 

				}
				break;
			case 31 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:192: LP
				{
				mLP(); 

				}
				break;
			case 32 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:195: RP
				{
				mRP(); 

				}
				break;
			case 33 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:198: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 34 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:205: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 35 :
				// D:\\Code\\UMLDesigner\\src\\main\\code\\compiler\\generated\\UmlDesigner.g:1:214: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\1\32\1\35\12\37\1\uffff\1\32\3\uffff\1\32\13\uffff\1\37\1\uffff"+
		"\7\37\1\102\5\37\15\uffff\10\37\1\uffff\1\37\1\126\3\37\2\uffff\3\37\1"+
		"\135\10\37\1\uffff\6\37\1\uffff\1\154\12\37\1\167\2\37\1\uffff\1\172\7"+
		"\37\1\u0082\1\37\1\uffff\1\37\1\u0085\1\uffff\3\37\1\u0089\2\37\1\u008c"+
		"\1\uffff\2\37\1\uffff\1\37\1\u0090\1\37\1\uffff\2\37\1\uffff\3\37\1\uffff"+
		"\2\37\1\u0099\1\u009a\3\37\1\u009e\2\uffff\3\37\1\uffff\2\37\1\u00a4\1"+
		"\u00a5\1\37\2\uffff\2\37\1\u00a9\1\uffff";
	static final String DFA4_eofS =
		"\u00aa\uffff";
	static final String DFA4_minS =
		"\1\0\2\56\1\164\1\142\1\157\1\150\1\157\1\156\1\144\1\145\1\141\1\145"+
		"\1\uffff\1\57\3\uffff\1\56\10\uffff\1\56\2\uffff\1\162\1\uffff\1\163\1"+
		"\157\2\141\1\165\1\144\1\164\1\60\1\160\2\164\1\162\1\154\14\uffff\1\52"+
		"\1\151\1\164\1\154\1\162\1\163\1\142\1\101\1\145\1\uffff\1\154\1\60\1"+
		"\150\2\141\2\uffff\1\156\1\162\1\145\1\60\1\163\1\154\1\142\1\154\2\156"+
		"\1\145\1\162\1\uffff\1\157\1\155\1\164\1\147\2\141\1\uffff\1\60\1\145"+
		"\1\163\1\141\1\164\1\144\1\155\1\146\1\144\1\163\1\151\1\60\1\143\1\156"+
		"\1\uffff\1\60\1\164\1\163\1\145\1\163\1\145\1\141\1\163\1\60\1\157\1\uffff"+
		"\1\164\1\60\1\uffff\1\162\1\163\1\162\1\60\1\156\1\143\1\60\1\uffff\1"+
		"\156\1\103\1\uffff\1\141\1\60\1\146\1\uffff\1\164\1\145\1\uffff\1\163"+
		"\1\154\1\143\1\uffff\1\141\1\163\2\60\1\141\1\164\1\143\1\60\2\uffff\1"+
		"\163\1\103\1\145\1\uffff\1\163\1\154\2\60\1\141\2\uffff\2\163\1\60\1\uffff";
	static final String DFA4_maxS =
		"\1\uffff\2\56\1\164\1\142\1\157\1\154\1\157\1\170\1\156\1\145\1\141\1"+
		"\145\1\uffff\1\57\3\uffff\1\56\10\uffff\1\56\2\uffff\1\162\1\uffff\1\163"+
		"\1\157\2\141\1\165\1\144\1\164\1\172\1\160\2\164\1\162\1\154\14\uffff"+
		"\1\61\1\151\1\164\1\154\1\162\1\163\1\142\1\111\1\145\1\uffff\1\154\1"+
		"\172\1\150\2\141\2\uffff\1\156\1\162\1\145\1\172\1\163\1\154\1\142\1\154"+
		"\2\156\1\145\1\162\1\uffff\1\157\1\155\1\164\1\147\2\141\1\uffff\1\172"+
		"\1\145\1\163\1\141\1\164\1\144\1\155\1\146\1\144\1\163\1\151\1\172\1\143"+
		"\1\156\1\uffff\1\172\1\164\1\163\1\145\1\163\1\145\1\141\1\163\1\172\1"+
		"\157\1\uffff\1\164\1\172\1\uffff\1\162\1\163\1\162\1\172\1\156\1\143\1"+
		"\172\1\uffff\1\156\1\103\1\uffff\1\141\1\172\1\146\1\uffff\1\164\1\145"+
		"\1\uffff\1\163\1\154\1\143\1\uffff\1\141\1\163\2\172\1\141\1\164\1\143"+
		"\1\172\2\uffff\1\163\1\103\1\145\1\uffff\1\163\1\154\2\172\1\141\2\uffff"+
		"\2\163\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\15\uffff\1\26\1\uffff\1\30\1\31\1\32\1\uffff\1\34\1\35\1\36\1\37\1\40"+
		"\1\41\1\42\1\43\1\uffff\1\4\1\3\1\uffff\1\26\15\uffff\1\27\1\30\1\31\1"+
		"\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\11\uffff\1\17\5\uffff\1\1"+
		"\1\2\14\uffff\1\21\6\uffff\1\10\16\uffff\1\11\12\uffff\1\5\2\uffff\1\12"+
		"\7\uffff\1\24\2\uffff\1\7\3\uffff\1\16\2\uffff\1\23\3\uffff\1\14\10\uffff"+
		"\1\22\1\25\3\uffff\1\20\5\uffff\1\15\1\6\3\uffff\1\13";
	static final String DFA4_specialS =
		"\1\0\u00a9\uffff}>";
	static final String[] DFA4_transitionS = {
			"\11\32\2\23\2\32\1\23\22\32\1\23\2\32\1\21\1\30\3\32\1\26\1\27\1\31\1"+
			"\17\1\24\1\20\1\22\1\16\1\1\1\2\10\32\1\25\6\32\22\15\1\3\7\15\4\32\1"+
			"\15\1\32\1\4\1\5\1\6\1\7\1\10\3\15\1\11\3\15\1\12\2\15\1\13\1\15\1\14"+
			"\10\15\uff85\32",
			"\1\33",
			"\1\34",
			"\1\36",
			"\1\40",
			"\1\41",
			"\1\42\3\uffff\1\43",
			"\1\44",
			"\1\45\11\uffff\1\46",
			"\1\47\10\uffff\1\50\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"",
			"\1\55",
			"",
			"",
			"",
			"\1\61",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\71",
			"",
			"",
			"\1\72",
			"",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\110\6\uffff\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120\1\uffff\1\121\5\uffff\1\122",
			"\1\123",
			"",
			"\1\124",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\4\37\1\125\25\37",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"",
			"\1\132",
			"\1\133",
			"\1\134",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\170",
			"\1\171",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u0083",
			"",
			"\1\u0084",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u008a",
			"\1\u008b",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u008d",
			"\1\u008e",
			"",
			"\1\u008f",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u0091",
			"",
			"\1\u0092",
			"\1\u0093",
			"",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"\1\u0097",
			"\1\u0098",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u00a6",
			"",
			"",
			"\1\u00a7",
			"\1\u00a8",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | ID | COMMENT | PLUS | MINUS | HASHTAG | DOUBLE_DOT | WS | COMMA | COLON | LP | RP | DOLLAR | ASTERISK | SCAN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA4_0 = input.LA(1);
						s = -1;
						if ( (LA4_0=='0') ) {s = 1;}
						else if ( (LA4_0=='1') ) {s = 2;}
						else if ( (LA4_0=='S') ) {s = 3;}
						else if ( (LA4_0=='a') ) {s = 4;}
						else if ( (LA4_0=='b') ) {s = 5;}
						else if ( (LA4_0=='c') ) {s = 6;}
						else if ( (LA4_0=='d') ) {s = 7;}
						else if ( (LA4_0=='e') ) {s = 8;}
						else if ( (LA4_0=='i') ) {s = 9;}
						else if ( (LA4_0=='m') ) {s = 10;}
						else if ( (LA4_0=='p') ) {s = 11;}
						else if ( (LA4_0=='r') ) {s = 12;}
						else if ( ((LA4_0 >= 'A' && LA4_0 <= 'R')||(LA4_0 >= 'T' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'f' && LA4_0 <= 'h')||(LA4_0 >= 'j' && LA4_0 <= 'l')||(LA4_0 >= 'n' && LA4_0 <= 'o')||LA4_0=='q'||(LA4_0 >= 's' && LA4_0 <= 'z')) ) {s = 13;}
						else if ( (LA4_0=='/') ) {s = 14;}
						else if ( (LA4_0=='+') ) {s = 15;}
						else if ( (LA4_0=='-') ) {s = 16;}
						else if ( (LA4_0=='#') ) {s = 17;}
						else if ( (LA4_0=='.') ) {s = 18;}
						else if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {s = 19;}
						else if ( (LA4_0==',') ) {s = 20;}
						else if ( (LA4_0==':') ) {s = 21;}
						else if ( (LA4_0=='(') ) {s = 22;}
						else if ( (LA4_0==')') ) {s = 23;}
						else if ( (LA4_0=='$') ) {s = 24;}
						else if ( (LA4_0=='*') ) {s = 25;}
						else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\b')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\u001F')||(LA4_0 >= '!' && LA4_0 <= '\"')||(LA4_0 >= '%' && LA4_0 <= '\'')||(LA4_0 >= '2' && LA4_0 <= '9')||(LA4_0 >= ';' && LA4_0 <= '@')||(LA4_0 >= '[' && LA4_0 <= '^')||LA4_0=='`'||(LA4_0 >= '{' && LA4_0 <= '\uFFFF')) ) {s = 26;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 4, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
