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
    : (abstractClassDefinition | classDefinition | interfaceDefinition)*
    ;
    
classDefinition
    :  'class' 
    	classValues
       'endClass'
    ;
    
abstractClassDefinition
    :  'abstractClass'
    	classValues
       'endAbstractClass'
    ;
    
classValues
    :
        'id' COLON ID
       ('implements' COLON (interfaces)+ )?
       ('extends' COLON (classes)+ )?
       ('relations' COLON (classRelations)+)?
       ('params' COLON (classParameters)+)?
       ('methods' COLON (classMethods)+)?
    ;

interfaceDefinition
    :  'interface'
       'id' COLON i = ID { h.createNewInterface($i); }
       ('params' COLON  (p = interfaceParams  { h.interfaces.addInterfaceParams($i, p); } )+ )?
       ('methods' COLON (m = interfaceMethods { h.interfaces.addInterfaceMethod($i, m); } )+ )?
       'endInterface'
    ;    

classRelations
    :  ID cardinality (COMMA ID cardinality)*
    ;

interfaceParams returns [Param ip]
    :  PLUS i = ID COLON t = type { ip = h.interfaces.returnParam($i, t); }
    ;
    
interfaceMethods returns [Method im]
    :  PLUS i = ID LP p = methodParams? RP (COLON t = type)? { im = h.interfaces.returnMethod($i, t, p); }
    ;

methodParams returns [List<MethodParam> imp]
@init { imp = new ArrayList<MethodParam>(); }
    :   i1 = ID COLON t1 = type       { h.interfaces.addInterfaceMethodParam(imp, $i1, t1); }
       (COMMA i2 = ID COLON t2 = type { h.interfaces.addInterfaceMethodParam(imp, $i2, t2); } )* 
    ;
    
classParameters
    :	visibility ID (COLON type)?
    ;
    
interfaces
    :   ID (COMMA ID)*
    ;

classes
    :  ID (COMMA ID)*
    ;
        
classMethods
    :	visibility ID LP methodParams? RP (COLON type)?
    ;
    
visibility
    : (PLUS | MINUS | HASHTAG)
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