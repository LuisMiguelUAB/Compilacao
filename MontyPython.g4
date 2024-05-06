grammar MontyPython;

program: progline* EOF;
    
progline:
    stat
    | def;
    
stat: declaration
    | assignment
    | whilecycle
    | ifthenelse
    | forin
    | funcheader
    | funcreturn
    | printstat
    | fladd
    | flremove;
  
assignment:
    (ID|IDellista) '=' (expr|tlistint|tlistfloat|inputline);
    
declaration: 'int' ((ID)|(ID '=' (expr|inputline))) ((',' ID)|(',' ID '=' expr))* 
    | 'float' ((ID)|(ID '=' expr)) ((',' ID)|(',' ID '=' expr))* 
    | ((ID)|(ID '=' expr)) ((',' ID)|(',' ID '=' expr))*
    | 'int''['']'(ID|(ID '=' tlistint)) 
    | 'float''['']'(ID|(ID '=' tlistfloat)) 
    ;

deftipo: ('int'|'float')('['']')?;

funcheader:
    'def' deftipo? ID '(' (deftipo? ID (',' deftipo? ID)*)? ')' ':';
    
funcreturn:
    'return' expr;

def : ID '(' ID (',' ID)* ')' '{' stat* '}' ; 

whilecycle: 'while' exprlogic ':'  stat* 
    | 'while' exprlogic ':'  stat*  'else' ':'  stat* ;

ifthenelse: 'if' exprlogic ':'  stat* 
    | 'if' exprlogic ':'  stat*  ('elif' exprlogic ':'  stat* )*
    | 'if' exprlogic ':'  stat*  ('elif' exprlogic ':'  stat* )* 'else' ':'  stat* ;
    

forin: 'for' ID 'in' tlistint ':'  stat* 
    | 'for' ID 'in' trange ':'  stat* 
    ;

tlistint: ID
    | '['']'
    | '[' INT (',' INT)* ']' ;
    
tlistfloat: ID
    | '['']'
    | '[' (INT|FLOAT) (',' (INT|FLOAT))* ']' ;   
    
IDellista: ID '[' (ID|INT) ']';

flsize:
    'size' '(' (ID|tlistint|tlistfloat) ')';
    
fladd:
    'add' '(' ID ',' expr ',' expr ')'; 
    
flremove:
    'remove' '(' ID ',' expr ')'; 
    
inputline: 
    'input' '(' STRING? ')';
    
printstat:
    'print' '(' (expr|STRING) (',' (expr|STRING))* ')';

trange: 'range' '(' (ID|INT) ')'
    |  'range' '(' (ID|INT) ',' (ID|INT) ')'
    |  'range' '(' (ID|INT) ',' (ID|INT) ',' (ID|INT) ')'
    ;
                                                                                                                                                                                                                                          
expr: ID
    | IDellista
    | INT
    | FLOAT
    | flsize
    | func
    | '(' expr ')'
    | expr'**'expr 
    | expr'*'expr 
    | expr'/'expr 
    | expr'//'expr
    | expr'%'expr 
    | expr'+'expr 
    | expr'-'expr 
    | ID|INT|FLOAT|func| '(' expr ')'
    ;

exprlogic: ID
    | INT
    | FLOAT
    | func
    | 'not'exprlogic
    | '('expr')'
    | exprlogic'and'exprlogic
    | exprlogic'or'exprlogic
    | expr'<'expr
    | expr'<='expr
    | expr'>'expr
    | expr'>='expr
    | expr'=='expr
    | expr'!='expr
    ;
    
func : ID '(' expr (',' expr)* ')' ;

AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;
EQ : '=' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ; 
LSQUARE : '[';
RSQUARE : ']';
TWOPOINTS : ':';
EXP : '**';
MULT : '*';
DIV : '/';
IDIV : '//';
MOD : '%';
SUM : '+';
SUBT : '-';
LESS : '<';
LESSEQ : '<=';
BIGG : '>';
BIGGEQ : '>=';
EQUAL : '==';
DIFF : '!=';
DINT : 'int';
DFLOAT : 'float';
INPUT:'input';
PRINT:'print';
WHILE : 'while';
IF: 'if';
ELIF : 'elif';
ELSE : 'else';
FOR : 'for';
IN : 'in';
RANGE : 'range';
DEF : 'def';
RETURN : 'return';
LSIZE: 'size';
LADD: 'add';
LREMOVE : 'remove';
INT : [0-9]+;
FLOAT : [0-9]+([.]?[0-9]+)?([eE][+-]?[0-9]+)?;
MMENOS: [+-];
STRING : '"' .*? '"';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
COMMENT : '#' .*? '\r'? '\n' -> skip;
WS: [ \t\n\r\f]+ -> skip ;
   



