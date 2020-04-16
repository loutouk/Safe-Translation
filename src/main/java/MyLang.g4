grammar MyLang;

program: term+ ;

term: simple_term                   # simpleTerm
| LET IDENT EQUAL simple_term       # let
| REF term                          # varDeclaration
| term simple_term                  # application
| term SEQ term                     # sequence
| term COLEQ term                   # association
| simple_term TIMES simple_term     # multiplication
| simple_term PLUS simple_term      # addition
| simple_term MINUS simple_term     # substraction
| simple_term EQUAL simple_term     # equal
| simple_term LEQ simple_term       # lessThan
| IF term THEN term ELSE term       # ifThenElse
| term COMMA term                   # pair
| LET IDENT+ EQUAL term IN term     # letIn
| FUN IDENT* ARROW term             # funDeclaration
| POP IDENT                         # listPopId
| POP list                          # listPopList
| simple_term PUSH IDENT            # listPushId
| simple_term PUSH list             # listPushList
;

simple_term: BANG simple_term
| IDENT
| constant
| LPAR term RPAR
| list
;

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