grammar RefML;

program: (functionDecl | varDecl)+ ;

functionDecl: LET ID formalParameters? ARROW statement ;

formalParameters: formalParameter (formalParameter)* ;

formalParameter: ID ;

varDecl: LET ID EQUAL REF? statement ;

statement : statement IN statement              # InStat
    | statement SEQ statement                   # SeqStat
    | expr                                      # ExprSta
    | varDecl                                   # VarStat
    | functionDecl                              # FuncStat
    | IF expr THEN statement (ELSE statement)?  # IfStat
    ;

expr:   ID exprList            # Call
    |   BANG expr              # Bang
    |   expr TIMES expr        # Mult
    |   expr PLUS expr         # Add
    |   expr MINUS expr        # Sub
    // not implemented yet because it overrides the expr above like (n-1), use (0-x) instead
    //  |   MINUS expr             # Negate
    |   expr EQUAL expr        # Equal
    |   expr COLEQ expr        # Association
    |   expr LEQ expr          # LessEqual
    |   ID                     # Var
    |   LPAR expr RPAR         # Parenthesis
    |   consts                 # Constant
    |   POP ID                 # ListPopId
    |   POP list               # ListPopList
    |   expr PUSH ID           # ListPushId
    |   expr PUSH list         # ListPushList
    ;

exprList : expr (expr)* ;   // arg list

list : LBRA (list_elements)? RBRA ;

list_elements : list_element (SEQ list_element)* ;

list_element : consts ;

consts: INT
    | bool
    | UNIT
    ;

bool: TRUE
    | FALSE
    ;

MINUS  : '-' ;
PLUS   : '+' ;
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
SEQ    : ';' ;
COLEQ  : ':=' ;
IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
COMMA  : ',' ;
POP    : 'pop' ;
PUSH   : '::' ;

ID     :   LETTER (LETTER | [0-9])* ;

fragment
LETTER : [a-zA-Z] ;

INT    :   [0-9]+ ;

SL_COMMENT :   '//' .*? '\n' -> skip ; // single line comment

// sets the channel number so that it’s ignored but preserved for the parser
WS     : [ \n\t\r]+ -> channel(HIDDEN) ;