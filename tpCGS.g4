grammar tpCGS;
//PARSER


main: conc ':' list  stu ':' json res ':' json ;

json: '[' json ']'
    |  quotedWord ':' json
    |  '{' pairKeyValue (',' pairKeyValue )*'}'
    |
    ;

list : '[' quotedWord (',' quotedWord)* ']';

pairKeyValue : quotedWord ':' jsonValue ;

jsonValue: num
        | quotedWord
        | json
        | list
        ;

quotedWord: QWORD;
num : NUM;
conc : CONCEPTS;
stu : STUDENTS;
res : RESOURCES;
//LEXER
CONCEPTS : [Cc][oO][nN][cC][eE][pP][tT][sS];
STUDENTS : [Ss][Tt][uU][dD][eE][nN][tT][sS];
RESOURCES : [rR][eE][sS][oO][uU][rR][cC][eE][sS];
NUM: [0-9]+;
QWORD : ["][A-Za-z][A-Za-z0-9_\-]*([ ]*[A-Za-z][A-Za-z0-9_\-]*)*["];
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;