lexer grammar AngularLexer;

COMPONENT: 'Component';
CLASS: 'class';
CONSTRUCTOR: 'constructor';
SEMICOLON: ';';
COLON: ':';
BACKTICK: '`';
FUNCTION: 'function';
ASSIGN: '=';
NOT: '!';
EQUAL: '==';
NOT_EQUAL: '!=';
EQUALS_OR_LESS_THAN: '<=';
EQAULS_OR_GREATER_THAN: '>=';
STRICT_EQUALITY: '===';
STRICT_INEQUALITY: '!==';
HASHTAG: '#';
SQUARE_OPEN_BRACKET: '[';
SQUARE_CLOSE_BRACKET: ']';
NUMBER_VALUE: [0-9][0-9]*;
BOOLEAN_VALUE: 'false' | 'true';
STRING_VALUE : '"' ( ~["\\]    | '\\' . )* '"' | '\'' ( ~['\\]   | '\\' . )* '\'';
COMMA: ',';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
LESS_THAN: '<';
GREATER_THAN: '>';
DOT: '.';
DOLLAR: '$';
AT: '@';
REST_OPERATOR: '...';
INCREASE: '++';
DECREASE: '--';
NULL: 'null';
ARRAY: 'Array';
LOG: 'log';
STRING: 'string';
BOOLEAN: 'boolean';
NUMBER: 'number';
VOID: 'void';
ANY: 'any';
PLUS: '+';
MINUS: '-';
PIPE_OPERATOR: '|';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
DIVIDE: '/';
MODULUS: '%';
MULTIPLY: '*';
POWER: '**';
MULTIPLICATION_ASSIGNMENT: '*=';
DIVISION_ASSIGNMENT: '/=';
ADDITION_ASSIGNMENT: '+=';
SUBTRACTION_ASSIGNMENT: '-=';
QUESTION_MARK: '?';
NULLISH_COALESCING: '??';
IMPORT: 'import';
LET: 'let';
EXPORT: 'export';
FROM: 'from';
FOR: 'for';
WHILE: 'while';
DO: 'do';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';
CASE: 'case';
CONSOLE: 'console';
CONST: 'const';
IMPLEMENTS: 'implements';
EXTENDS: 'extends';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
READ_ONLY: 'readonly';
ARROW: '=>';
VAR: 'var';
AS: 'as';
THIS: 'this';
IMPORTS: 'imports';
STYLES: 'styles';
OF: 'of';
TRACK: 'track';
DEFAULT: 'default';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
IDENTIFIER : [a-zA-Z_#] [a-zA-Z0-9_#\-?]* ;

HTML_COMMENT
    : '<!--' ~[\r\n]* '-->'
    -> skip
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;
BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

SPACE: [ \t\r\n]->skip;
