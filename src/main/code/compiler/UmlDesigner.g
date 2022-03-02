grammar UmlDesigner;

options {
  language = Java;
  k = 1;
}

@lexer::header {
package compiler;
}

@lexer::members {
}

@header {
package compiler;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
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
       ('params' COLON (p = interfaceParams)+   { h.addInterfaceParams($i, p); })?
       ('methods' COLON (m = interfaceMethods)+ { h.addMethodsParams($i, m);   })?
       'endInterface'
    ;    

classRelations
    :  ID cardinality (COMMA ID cardinality)*
    ;

interfaceParams
    :  PLUS ID (COLON type)?
    ;
    
interfaceMethods
    :  PLUS ID LP methodParams? RP (COLON type)?
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
    
methodParams
    :   ID COLON type (COMMA ID COLON type)*
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