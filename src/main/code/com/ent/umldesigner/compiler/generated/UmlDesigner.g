grammar UmlDesigner;

options {
  language = Java;
  k = 1;
}

@lexer::header {
package compiler.generated;

import compiler.handlers.*;
}

@lexer::members {
}

@header {
package compiler.generated;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import javafx.util.Pair;
import compiler.objects.*;
import compiler.handlers.*;
import compiler.error.Error;
}

@members {
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
}

initUml
@init { setUp(); }
    : (abstractClassDefinition | classDefinition | interfaceDefinition)+ { h.setUpRelations(); }
    ;
    
classDefinition
    :  'class' 
       'id' COLON i = ID { h.createNewClass($i); }
    	classValues[$i]
       'endClass'
    ;
    
abstractClassDefinition
    :  'abstractClass'
       'id' COLON i = ID { h.createNewClass($i); }
    	classValues[$i]
       'endAbstractClass'
    ;
    
classValues [Token i]
    :  ('implements' COLON (ifs = interfaces { h.addImplementation($i, ifs); })+ )?
       ('extends' COLON (c = classes { h.addExtension($i, c); })+ )?
       ('relations' COLON (cr = componentRelations { h.addRelations($i, cr); })+)?
       ('params' COLON  (p = classParameters { h.addParams($i, p); })+)?
       ('methods' COLON (m = classMethods    { h.addMethod($i, m); })+)?
    ;
      
interfaces returns [List<String> ifList]
@init { ifList = new ArrayList<String>(); }
    :   i = ID 		{ ifList.add($i.getText());  }
        (COMMA i1 = ID  { ifList.add($i1.getText()); })*
    ;

classes returns [List<String> classList]
@init { classList = new ArrayList<String>(); }
    :  i = ID 		{ classList.add($i.getText()) ; }
      (COMMA i1 = ID    { classList.add($i1.getText()); })*
    ;
    
componentRelations returns [List<Pair> classList]
@init { classList = new ArrayList<>(); }
    :  i = ID c1 = cardinality '/' c2 = cardinality	        { classList.add(new Pair<>($i.getText(),  c1.getText() + '/' + c2.getText())); }
      (COMMA i1 = ID c3 = cardinality '/' c4 = cardinality 	{ classList.add(new Pair<>($i1.getText(),  c3.getText() + '/' + c4.getText())); })*
    ;
    
classParameters returns [Param ip]
    :	v = visibility i = ID (COLON t = type) { ip = h.returnParam($i.getText(), v.getText(), t); }
    ;

classMethods returns [Method im]
    :	v = visibility i = ID LP p = methodParams? RP (COLON t = type)? { im = h.returnMethod(v, $i, t, p); }
    ;
    
methodParams returns [List<MethodParam> imp]
@init { imp = new ArrayList<MethodParam>(); }
    :   i1 = ID COLON t1 = type       { h.addMethodParam(imp, $i1.getText(), t1); }
       (COMMA i2 = ID COLON t2 = type { h.addMethodParam(imp, $i2.getText(), t2); } )* 
    ;
      

interfaceDefinition
    :  'interface'
       'id' COLON i = ID { h.createNewInterface($i); }
       ('extends' COLON (ifs = interfaces { h.addExtension($i, ifs); })+ )?
       ('relations' COLON (cr = componentRelations { h.addRelations($i, cr); })+)?
       ('params' COLON  (p = interfaceParams  { h.addParams($i, p); } )+ )?
       ('methods' COLON (m = interfaceMethods { h.addMethod($i, m); } )+ )?
       'endInterface'
    ;    

interfaceParams returns [Param ip]
    :  v = PLUS i = ID COLON t = type { ip = h.returnParam($i.getText(), v.getText(), t); }
    ;
    
interfaceMethods returns [Method im]
    :  v = PLUS i = ID LP p = methodParams? RP (COLON t = type)? { im = h.returnMethod($v, $i, t, p); }
    ;
    
visibility returns [Token t]
    : (x = PLUS | x = MINUS) { t = x; }
    ;
    
cardinality returns [Token t]
    : (x = '0..1' 
    | x = '1' 
    | x = '0..*' 
    | x = '1..*')
    { t = x; }
    ;
    
type returns [String t]
  : ( x = 'int' 	
  | x = 'double' 
  | x = 'char' 
  | x = 'boolean' 
  | x = 'String' ) { t = x.getText(); }
  | x = ID gen = generics? { t = gen == null ? x.getText() : x.getText() + gen; }
    ;

generics returns [String s]
@init { String generics = ""; }
  : LESSER t = type (COMMA t1 = type { generics += "," + t1; })* GREATER { s = "<" + t + generics + ">"; }
  ;

// Lexer tokens

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
    ; // Per identificare le variabili e il loro tipo
    
PLUS 
    : '+' // Per specificare la visibilità pubblica
    ;
    
MINUS
    : '-' // Per specificare la visibilità privata
    ;

DOUBLE_DOT
    : '..' // Per identificare la cardinalità nelle relazioni
    ;

COMMA
    : ',' // Per separare i parametri dei metodi
    ;

COLON
    : ':' // Per definire il tipo delle variabili
    ;
    
LP
    : '(' // Apertura di un metodo
    ;

GREATER
    : '>' // Per gestione generics
    ;
    
LESSER
    : '<' // Per gestione generics
    ;		
    
RP
    : ')' // Chiusura di un metodo
    ;    
WS  :   ( ' ' // Spazi
    | '\t'
    | '\r'
    | '\n'
) {$channel=HIDDEN;}
    ;
    
COMMENT // Commenti
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
     
SCAN_ERROR : . ; // Per raggruppare i token non accettati