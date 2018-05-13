lexer grammar AntlrGlslLexer;

/////
//keywords----------------------------------------------------------------------
/////
KW_BREAK : 'break';
KW_CONTINUE: 'continue';
KW_DO : 'do';
KW_FOR : 'for';
KW_WHILE : 'while';
KW_SWITCH : 'switch';
KW_CASE : 'case';
KW_DEFAULT: 'default';
KW_IF : 'if';
KW_ELSE : 'else';
KW_DISCARD : 'discard';
KW_RETURN : 'return';
KW_STRUCT : 'struct';
KW_VOID : 'void';

//reserved
RESERVED_KEYWORD : 'common' | 'partition' | 'active' | 'asm' | 'class' | 'union' |
                    'enum' | 'typedef' | 'template' | 'this' | 'resource' | 'goto' |
                    'inline' | 'noinline' | 'public' | 'static' | 'extern' | 'external' |
                    'interface' | 'long' | 'short' | 'half' | 'fixed' | 'unsigned' |
                    'superp' | 'input' | 'output' | 'hvec2' | 'hvec3' | 'hvec4' | 'fvec2' |
                    'fvec3' | 'fvec4' | 'sampler3DRect' | 'filter' | 'sizeof' | 'cast' |
                    'namespace' | 'using';

/////
//qualifiers--------------------------------------------------------------------
/////
Q_PRECISION : 'precision';
Q_LAYOUT : 'layout';
Q_PRECISE : 'precise';
Q_INVARIANT : 'invariant';
Q_SUBROUTINE : 'subroutine';
Q_SMOOTH : 'smooth';
Q_FLAT : 'flat';
Q_NONPERSPECTIVE :'noperspective';
Q_CONST : 'const';
Q_INOUT : 'inout';
Q_IN : 'in';
Q_OUT : 'out';
Q_CENTROID : 'centroid';
Q_PATCH : 'patch';
Q_SAMPLE : 'sample';
Q_UNIFORM : 'uniform';
Q_BUFFER : 'buffer';
Q_VARYING : 'varying';
Q_ATTRIBUTE : 'attribute';
Q_COHERENT : 'coherent';
Q_VOLATILE : 'volatile';
Q_RESTRICT : 'restrict';
Q_READONLY : 'readonly';
Q_WRIREONLY : 'writeonly';
Q_SHARED : 'shared';
Q_HIGHP : 'highp';
Q_MEDIUMP : 'mediump';
Q_LOWP : 'lowp';

/////
//types-------------------------------------------------------------------------
/////
TYPE : TRANSPARENT_TYPE | FLOAT_OPAQUE_TYPE |SIGNED_INT_OPAQUE_TYPE | 
       UNSIGNED_INT_OPAQUE_TYPE;
//transparent type
fragment
TRANSPARENT_TYPE : 'int' | 'uint' | 'float' | 'double' | 'bool' | 
                   VECTOR_TYPE | MATRIX_TYPE;
fragment
VECTOR_TYPE : ('d' | 'b' | 'i' | 'u')? 'vec' ('2' | '3' | '4');
fragment
MATRIX_TYPE : 'd'? 'mat' ('2' | '3' | '4') ('x' ('2' | '3' | '4'))?;
//float opaque type
fragment
FLOAT_OPAQUE_TYPE: IMAGE_TYPE OPAQUE_TYPE_ENDING |
                   SAMPLER_TYPE (OPAQUE_TYPE_ENDING | FLOAT_OPAQUE_TYPE_SAMPLER_ONLY_ENDING);
fragment
FLOAT_OPAQUE_TYPE_SAMPLER_ONLY_ENDING : '1DShadow' | '2DShadow' | '2DRectShadow' |
                                      '1DArrayShadow' | '2DArrayShadow' | 'CubeShadow' |
                                      'CubeArrayShadow';
//signed int opaque type
fragment
SIGNED_INT_OPAQUE_TYPE : 'i' (SAMPLER_TYPE | IMAGE_TYPE) OPAQUE_TYPE_ENDING;
//unsigned int opaque type
fragment
UNSIGNED_INT_OPAQUE_TYPE : 'u' (SAMPLER_TYPE | IMAGE_TYPE) OPAQUE_TYPE_ENDING | 'atomic_uint';
//type fragments
fragment
OPAQUE_TYPE_ENDING : '1D' | '2D' | '3D' | 'Cube' | '2DRect' | '1DArray' |
                         '2DArray' | 'Buffer' | '2DMS' | '2DMSArray' | 'CubeArray';
fragment
SAMPLER_TYPE : 'sampler';
fragment
IMAGE_TYPE : 'image';

/////
//literals----------------------------------------------------------------------
/////
//bool literals
BOOL_LITERAL : 'true' | 'false';

//int literals
INT_LITERAL : (DECIMAL_INT_LITERAL | OCTAL_INT_LITERAL | HEXADECIMAL_INT_LITERAL) [Uu]?;
fragment
DECIMAL_INT_LITERAL : NONZERO_DIGIT DIGIT*;
fragment
OCTAL_INT_LITERAL : '0' OCTAL_DIGIT*;
fragment
HEXADECIMAL_INT_LITERAL : '0' [Xx] HEXADECIMAL_DIGIT*;

//float literals
FLOAT_LITERAL : FRACTIONAL_PART EXPONENT_PART? FLOATING_SUFFIX? |
              DIGIT+ EXPONENT_PART FLOATING_SUFFIX?;
fragment
FRACTIONAL_PART : DIGIT+ '.' DIGIT+ | '.' DIGIT+ | DIGIT+ '.';
fragment
EXPONENT_PART : [eE] [+-]? DIGIT+;
fragment
FLOATING_SUFFIX : 'f' | 'F' | 'lf' | 'LF';

/////
//operators---------------------------------------------------------------------
/////
OP_MUL : '*';
OP_ADD : '+';
OP_SUB : '-';
OP_DIV : '/';
OP_MOD : '%';
OP_INC : '++';
OP_DEC : '--';
OP_SHIFT : '<<' | '>>';
OP_RELATIONAL : '<=' | '<' | '>' | '>=' | '==' | '!=';
OP_BIT : '&' | '|' | '^';
OP_BIT_UNARY : '~';
OP_LOGICAL : '&&' | '||' | '^^';
OP_LOGICAL_UNARY : '!';
OP_MODIFY : ('+' | '-' | '%' | '*' | '/' | '<<' | '>>' | '&' | '|' | '^') '=';
OP_ASSIGN : '=';

/////
//hidden------------------------------------------------------------------------
/////
MACRO : '#' (~[\r\n\\] | '\\' ~[\r\n\\])* -> channel(HIDDEN);
NEW_LINE : [\r\n]+ -> channel(HIDDEN);
SPACE : ' ' -> channel(HIDDEN);
TAB : '\t' -> channel(HIDDEN);
//comments
MULTI_LINE_COMMENT : '/*' (~'*' | '*' ~'/')* '*'? '*/'  -> channel(HIDDEN);
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> channel(HIDDEN);

/////
//others------------------------------------------------------------------------
/////
IDENTIFIER : ('_' | LETTER) ('_' | LETTER | DIGIT)*;
fragment
LETTER : [a-zA-Z];
//numbers
fragment
DIGIT : '0' | NONZERO_DIGIT;
fragment
NONZERO_DIGIT : [1-9];
fragment
OCTAL_DIGIT : [0-7];
fragment
HEXADECIMAL_DIGIT : DIGIT | [A-Fa-f];

/////
//characters--------------------------------------------------------------------
/////
DOT : '.';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
QUESTION : '?';
//round brackets
LRB : '(';
RRB : ')';
//curly brackets
LCB : '{';
RCB : '}';
//square brackets
LSB : '[';
RSB : ']';