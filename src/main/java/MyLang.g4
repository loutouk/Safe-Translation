grammar MyLang;

program: term+ ;

term: simple_term
| LET IDENT EQUAL simple_term // var declaration
| REF term // reference
| term simple_term // application
| term SEQ term // sequence
| term COLEQ term // assoc
| simple_term TIMES simple_term
| simple_term PLUS simple_term
| simple_term MINUS simple_term
| simple_term EQUAL simple_term
| simple_term LEQ simple_term
| IF term THEN term ELSE term
| term COMMA term // pair
| LET IDENT parameters? EQUAL term IN term // let
| FUN IDENT ARROW term
| POP IDENT // list pop
| POP list // list pop
| simple_term PUSH IDENT // list push
| simple_term PUSH list // list push
;

simple_term: BANG simple_term
| IDENT
| constant
| LPAR term RPAR
| list
;

parameters : parameter (parameter)* ;

parameter : IDENT ;

bool: TRUE | FALSE ;

list : LBRA (list_elements)? RBRA ;

list_elements : list_element (SEQ list_element)* ;

list_element : constant ;

constant: INT
| bool
| UNIT
;


TRUE   : 'TRUE' ;
FALSE  : 'FALSE';
LPAR   : '(' ;
RPAR   : ')' ;
LBRA   : '[' ;
RBRA   : ']' ;
REF    : 'ref' ;
UNIT   : '()' ;
LET    : 'let' ;
REC    : 'rec' ;
BANG   : '!' ;
EQUAL  : '=' ;
IN     : 'in' ;
ARROW  : '->' ;
LEQ    : '<' ;
TIMES  : '*' ;
PLUS   : '+' ;
MINUS  : '-' ;
SEQ    : ';' ;
COLEQ  : ':=' ;
IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
FUN    : 'fun' ;
COMMA  : ',' ;
POP    : 'pop' ;
PUSH   : '::' ;

IDENT  : [a-zA-Z]+ ;
INT    : [0-9]+ ;

// sets the channel number so that it’s ignored but preserved by the parser
WS     : [ \n\t\r]+ -> channel(HIDDEN) ;