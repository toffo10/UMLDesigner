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
import compiler.util.*;
import compiler.handlers.*;
}

@members {
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
}

initUml
@init { setUp(); }
    : (abstractClassDefinition | classDefinition | interfaceDefinition)* { h.setUpRelations(); }
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
    :
       ('implements' COLON (ifs = interfaces { h.addImplementation($i, ifs); })+ )?
       ('extends' COLON (c = classes { h.addExtension($i, c); })+ )?
       ('relations' COLON (classRelations)+)?
       ('params' COLON  (p = classParameters { h.addParams($i, p); })+)?
       ('methods' COLON (m = classMethods    { h.addMethod($i, m); })+)?
    ;
    
classParameters returns [Param ip]
    :	visibility i = ID (COLON t = type) { ip = h.returnParam($i, t); }
    ;

classMethods returns [Method im]
    :	v = visibility i = ID LP p = methodParams? RP (COLON t = type)? { im = h.returnMethod(v, $i, t, p); }
    ;

interfaceDefinition
    :  'interface'
       'id' COLON i = ID { h.createNewInterface($i); }
       ('params' COLON  (p = interfaceParams  { h.addParams($i, p); } )+ )?
       ('methods' COLON (m = interfaceMethods { h.addMethod($i, m); } )+ )?
       'endInterface'
    ;    

classRelations
    :  ID cardinality (COMMA ID cardinality)*
    ;

interfaceParams returns [Param ip]
    :  PLUS i = ID COLON t = type { ip = h.returnParam($i, t); }
    ;
    
interfaceMethods returns [Method im]
    :  v = PLUS i = ID LP p = methodParams? RP (COLON t = type)? { im = h.returnMethod($v, $i, t, p); }
    ;

methodParams returns [List<MethodParam> imp]
@init { imp = new ArrayList<MethodParam>(); }
    :   i1 = ID COLON t1 = type       { h.addMethodParam(imp, $i1, t1); }
       (COMMA i2 = ID COLON t2 = type { h.addMethodParam(imp, $i2, t2); } )* 
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
      
visibility returns [Token t]
    : (x = PLUS | x = MINUS | x = HASHTAG) { t = x; }
    ;
    
cardinality
    : ('0..1' | '1' | '0..*' | '1..*')
    ;
    
type returns [Token t]
  :( x = 'int' 	
  | x = 'double' 
  | x = 'char' 
  | x = 'boolean' 
  | x = 'String' 
  | x = ID) { t = x; }
    ;

// Lexer tokens
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
    
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
    
PLUS 
    : '+'
    ;
    
MINUS
    : '-'
    ;
    
HASHTAG
    : '#'
    ;

DOUBLE_DOT
    : '..'
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
COMMA
    : ','
    ;

COLON
    : ':'
    ;
    
LP
    : '('
    ;
    
RP
    : ')'
    ;
    
DOLLAR
    : '$'
    ;

ASTERISK
    : '*'
    ;
    
SCAN_ERROR : . ;