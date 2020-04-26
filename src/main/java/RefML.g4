grammar RefML;

program: (declarations)+ ;

declarations: variableDecl
    | functionDecl
    ;

variableDecl:    LET ID EQUAL REF? expr     #varDecl
    | LET ID EQUAL REF? expr IN statement   #varDeclIn
    ;

functionDecl: LET REC? ID formalParameters? EQUAL statement         #funDecl
    | LET REC? ID formalParameters? EQUAL statement IN statement    #funDeclIn
    ;

formalParameters: formalParameter (formalParameter)* ;

formalParameter: ID ;

statement : statement SEQ statement                   # SeqStat
    | expr                                      # ExprSta
    | declarations                                   # VarStat
    | IF expr THEN statement (ELSE statement)?  # IfStat
    ;

argList : expr (expr)*;   // arg list

expr: BANG expr              # Bang
    |   expr TIMES expr        # Mult
    |   expr PLUS expr         # Add
    |   expr MINUS expr        # Sub
    |   MINUS expr             # Negate
    |   expr EQUAL expr        # Equal
    |   expr COLEQ expr        # Association
    |   expr LEQ expr          # LessEqual
    |   ID                     # Var
    |   LPAR expr RPAR         # Parenthesis
    |   consts                 # Constant
    |   POP BANG? ID           # ListPopId
    |   POP list               # ListPopList
    |   PEEK BANG? ID          # ListPeekId
    |   PEEK list              # ListPeekList
    |   expr PUSH BANG? ID     # ListPushId
    |   expr PUSH list         # ListPushList
    |   ID argList             # Call
    ;



list : LBRA (list_elements)? RBRA ;

list_elements : list_element (SEQ list_element)* ;

list_element : consts ;

consts: INT
    | bool
    | LPAR RPAR // unit
    | list
    ;

bool: TRUE
    | FALSE
    ;

MINUS  : '-' ;
PLUS   : '+' ;
TRUE   : 'true' ;
FALSE  : 'false';
LPAR   : '(' ;
RPAR   : ')' ;
LBRA   : '[' ;
RBRA   : ']' ;
LCUR   : '{' ;
RCUR   : '}' ;
REF    : 'ref' ;
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
PEEK   : 'peek' ;
PUSH   : '::' ;

ID     :   LETTER (LETTER | [0-9])* ;

fragment
LETTER : [a-zA-Z_] ;
INT    :   [0-9]+ ;

SL_COMMENT :   '(*' .*? '*)' -> channel(HIDDEN) ; // single line comment

// sets the channel number so that it’s ignored but preserved for the parser
WS     : [ \n\t\r]+ -> channel(HIDDEN) ;