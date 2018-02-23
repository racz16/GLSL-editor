grammar GLSL;

start : (macro | struct | function_prototype | function_definition |
         MULTI_LINE_COMMENT | SINGLE_LINE_COMMENT )+ ;
                                                          //több is lehet
struct : STRUCT IDENTIFIER LCB declaration_statement+ RCB IDENTIFIER? SEMICOLON;

/////
//macros------------------------------------------------------------------------
////

//sorvége jellel kell valamit kezdeni
//de mit? itt tokenként kéne kezelni, mindenhol máshol meg nem kéne vele foglalkozni
macro : (m_version | m_line | m_pragma | m_extension | m_error) (('\r' | '\n')+ );
m_version : PD_VERSION INT_LITERAL PDA_VERSION_PROFILE?;
m_line : PD_LINE INT_LITERAL INT_LITERAL?;
m_pragma : PD_PRAGMA (((PDA_PRAGMA_DEBUG | PDA_PRAGMA_OPTIMIZE) LRB PDA_PRAGMA_TOGGLE RRB)
                      | PDA_PRAGMA_STDGL);
m_extension : PD_EXTENSION (IDENTIFIER COLON PDA_EXTENSION_BEHAVIOUR |
                            PDA_EXTENSION_ALL COLON PDA_EXTENSION_ALL_BEHAVIOUR);
m_error : PD_ERROR;

/////
//functions---------------------------------------------------------------------
/////
function_signature : return_type IDENTIFIER LRB function_argument_list RRB;
function_argument_list : (function_argument (COMMA function_argument)*)? ;
function_argument : argument_type IDENTIFIER;

function_prototype : function_signature SEMICOLON;
function_definition : function_signature compound_statement;

function_call : IDENTIFIER LRB function_call_argument_list RRB;
function_call_argument_list: (expression (COMMA expression)*)? | VOID ;

/////
//statements--------------------------------------------------------------------
/////
statement_list : statement+;

statement : compound_statement | simple_statement;

compound_statement : LCB statement_list? RCB;

simple_statement : declaration_statement | expression_statement | 
                    selection_statement | iteration_statement | jump_statement;

selection_statement : IF LRB expression RRB statement (ELSE statement)?; //switch

iteration_statement : WHILE LRB expression RRB statement; //do-while, for

jump_statement : (CONTINUE | BREAK | DISCARD | RETURN expression?) SEMICOLON;



//ez még nem okés
declaration_statement : type IDENTIFIER (LSB (INT_LITERAL | IDENTIFIER)? RSB)* (EQUAL expression)? SEMICOLON;
expression_statement : expression? SEMICOLON;

/////
//expressions-------------------------------------------------------------------
/////
expression : IDENTIFIER | function_call |  literal |
                        LRB expression RRB |
                        (logical_not | add | subtract | bit_not | increment | decrement)  expression (increment | decrement) |
                        
                        expression (multiply | divide | mod) expression | 
                        expression (add | subtract) expression |
                        expression (left_shift | right_shift) expression |
                        expression (bit_and | bit_or | bit_xor) expression |
                        
                        expression (less | greater | less_equals | greater_equals) expression |
                        expression (equals | not_equals) expression |
                        expression (logical_and | logical_or | logical_xor) expression |
                        
                        expression QUESTION expression COLON expression |
                        expression assignment expression |
                        
                        expression DOT (IDENTIFIER | VECTOR_FIELD+) |
                        expression (LSB INT_LITERAL RSB)+;

//külön szabályként nem mûködnek, mert mutual left recursion
//parenthetical_expression : LRB expression RRB;
//unary_expression : (logical_not | add | subtract | bit_not | increment | decrement) 
//                          expression (increment | decrement);

//number expressions
//multiplicative_expression : expression (multiply | divide | mod) expression;
//additive_expression : expression (add | subtract) expression;
//shift_expression : expression (left_shift | right_shift) expression;
//bit_expression : expression (bit_and | bit_or | bit_xor) expression;

//logical expressions
//relational_expression : expression (less | greater | less_equals | greater_equals) expression;
//equality_expression :  expression (equals | not_equals) expression;
//logical_expression : expression (logical_and | logical_or | logical_xor) expression;

//assignment expressions
//conditional_expression : expression QUESTION expression COLON expression;
//assignment_expression : expression assignment expression;

//field_selection : expression DOT (IDENTIFIER | VECTOR_FIELD+);

/////
//operators---------------------------------------------------------------------
/////
multiply : STAR;
add : PLUS;
subtract : DASH;
divide : SLASH;
mod : PERCENT;
increment : PLUS PLUS;
decrement : DASH DASH;
left_shift : RIGHT_ANGLE RIGHT_ANGLE;
right_shift : LEFT_ANGLE LEFT_ANGLE;
less_equals : RIGHT_ANGLE EQUAL;
less : RIGHT_ANGLE;
greater : LEFT_ANGLE;
greater_equals : LEFT_ANGLE EQUAL;
equals : EQUAL EQUAL;
not_equals : BANG EQUAL;
bit_and : AMPERSAND;
bit_or : VERTICAL_BAR;
bit_xor : CARET;
bit_not : TILDE;
logical_and : AMPERSAND AMPERSAND;
logical_or : VERTICAL_BAR VERTICAL_BAR;
logical_xor : CARET CARET;
logical_not : BANG;
assignment : (add | subtract | mod | multiply | divide | left_shift | right_shift | 
              bit_and | bit_or | bit_xor)? EQUAL;

/////
//types and literals------------------------------------------------------------
/////
return_type : type (LSB RSB)* | VOID;
argument_type : type (LSB RSB)*;
type : IDENTIFIER | TRANSPARENT_TYPE | FLOAT_OPAQUE_TYPE |SIGNED_INT_OPAQUE_TYPE | 
       UNSIGNED_INT_OPAQUE_TYPE;

literal : BOOL_LITERAL | number_literal;
number_literal : INT_LITERAL | FLOAT_LITERAL;

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
//LEXER RULES
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

/////
//preprocessor------------------------------------------------------------------
/////
PD_ERROR : '#error';
PD_PRAGMA : '#pragma';
PDA_PRAGMA_DEBUG : 'debug';
PDA_PRAGMA_OPTIMIZE : 'optimize';
PDA_PRAGMA_STDGL : 'STDGL';
PDA_PRAGMA_TOGGLE : 'on' | 'off';
PD_VERSION : '#version';
PDA_VERSION_PROFILE : 'core' | 'compatibility' | 'es';
PD_LINE : '#line';
PD_EXTENSION : '#extension';
PDA_EXTENSION_ALL_BEHAVIOUR : PDA_EXTENSION_WARN | PDA_EXTENSION_DISABLE;
PDA_EXTENSION_BEHAVIOUR : PDA_EXTENSION_REQUIRE | PDA_EXTENSION_ENABLE |
                        PDA_EXTENSION_WARN | PDA_EXTENSION_DISABLE;
PDA_EXTENSION_ALL : 'all';
fragment
PDA_EXTENSION_REQUIRE :'require';
fragment
PDA_EXTENSION_ENABLE : 'enable';
fragment
PDA_EXTENSION_WARN : 'warn';
fragment
PDA_EXTENSION_DISABLE : 'disable';

//ezek még nem mûködnek:
fragment
PD_HASHMARK : '#';
fragment
PD_DOUBLE_HASHMARK : '##';
fragment
PD_DEFINE : '#define';
fragment
PD_UNDEF : '#undef';
fragment
PD_IF : '#if';
fragment
PD_IFDEF : '#ifdef';
fragment
PD_IFNDEF : '#ifndef';
fragment
PD_ELSE : '#else';
fragment
PD_ELIF : '#elif';
fragment
PD_ENDIF : '#endif';
fragment
PD_DEFINED: 'defined';

/////
//keywords----------------------------------------------------------------------
/////
LAYOUT : 'layout';
BREAK : 'break';
CONTINUE: 'continue';
DO : 'do';
FOR : 'for';
WHILE : 'while';
SWITCH : 'switch';
CASE : 'case';
DEFAULT: 'default';
IF : 'if';
ELSE : 'else';
SUBROUTINE : 'subroutine';
INOUT : 'inout';
INVARIANT : 'invariant';
DISCARD : 'discard';
RETURN : 'return';
STRUCT : 'struct';
VOID : 'void';
PRECISION : 'precision';

//qualifiers
Q_PRECISE : 'precise';
Q_INTERPOLATION : 'smooth' | 'flat' | 'noperspective';
Q_STORAGE : 'const' | 'in' | 'out' | 'attribute' | 'uniform' | 'varying' |
                    'buffer' | 'shared';
Q_AUXILIARY_STORAGE : 'centroid' | 'sample' | 'patch';
Q_PRECISION : 'highp' | 'mediump' | 'lowp';
Q_MEMORY : 'coherent' | 'volatile' | 'restrict' | 'readonly' | 'writeonly';

//Q_PARAMETER : '' | 'const' | 'in' | 'out' | 'inout';

//reserved
RESERVED_KEYWORD : 'common' | 'partition' | 'active' | 'asm' | 'class' | 'union' |
                    'enum' | 'typedef' | 'template' | 'this' | 'resource' | 'goto' |
                    'inline' | 'noinline' | 'public' | 'static' | 'extern' | 'external' |
                    'interface' | 'long' | 'short' | 'half' | 'fixed' | 'unsigned' |
                    'superp' | 'input' | 'output' | 'hvec2' | 'hvec3' | 'hvec4' | 'fvec2' |
                    'fvec3' | 'fvec4' | 'sampler3DRect' | 'filter' | 'sizeof' | 'cast' |
                    'namespace' | 'using';

/////
//types-------------------------------------------------------------------------
/////
TRANSPARENT_TYPE : 'int' | 'uint' | 'float' | 'double' | 'vec2' | 'vec3' | 'vec4' |
            'dvec2' | 'dvec3' | 'dvec4' | 'bvec2' | 'bvec3' | 'bvec4' | 'ivec2' |
            'ivec3' | 'ivec4' | 'uvec2' | 'uvec3' | 'uvec4' | 'mat2' | 'mat3' |
            'mat4' | 'mat2x2' | 'mat2x3' | 'mat2x4' | 'mat3x2' | 'mat3x3' | 'mat3x4' |
            'mat4x2' | 'mat4x3' | 'mat4x4' | 'dmat2' | 'dmat3' | 'dmat4' | 'dmat2x2' |
            'dmat2x3' | 'dmat2x4' | 'dmat3x2' | 'dmat3x3' | 'dmat3x4' | 'dmat4x2' |
            'dmat4x3' | 'dmat4x4' | 'bool';
FLOAT_OPAQUE_TYPE: 'sampler1D' | 'image1D' | 'sampler2D' | 'image2D' | 'sampler3D' |
            'image3D' | 'samplerCube' | 'imageCube' | 'sampler2DRect' | 'image2DRect' |
            'sampler1DArray' | 'image1DArray' | 'sampler2DArray' | 'image2DArray' |
            'samplerBuffer' | 'imageBuffer' | 'sampler2DMS' | 'image2DMS' |
            'sampler2DMSArray' | 'image2DMSArray' | 'samplerCubeArray' |
            'imageCubeArray' | 'sampler1DShadow' | 'sampler2DShadow ' |
            'sampler2DRectShadow' | 'sampler1DArrayShadow' | 'sampler2DArrayShadow' |
            'samplerCubeShadow' | 'samplerCubeArrayShadow';
SIGNED_INT_OPAQUE_TYPE : 'isampler1D' | 'iimage1D' | 'isampler2D' | 'iimage2D' |
            'isampler3D' | 'iimage3D' | 'isamplerCube' | 'iimageCube' | 
            'isampler2DRect' | 'iimage2DRect' | 'isampler1DArray' | 'iimage1DArray' |
            'isampler2DArray' | 'iimage2DArray' | 'isamplerBuffer' | 'iimageBuffer' |
            'isampler2DMS' | 'iimage2DMS' | 'isampler2DMSArray' | 'iimage2DMSArray' |
            'isamplerCubeArray' | 'iimageCubeArray';
UNSIGNED_INT_OPAQUE_TYPE : 'usampler1D' | 'uimage1D' | 'usampler2D' | 'uimage2D' |
            'usampler3D' | 'uimage3D' | 'usamplerCube' | 'uimageCube' | 
            'usampler2DRect' | 'uimage2DRect' | 'usampler1DArray' | 'uimage1DArray' |
            'usampler2DArray' | 'uimage2DArray' | 'usamplerBuffer' | 'uimageBuffer' |
            'usampler2DMS' | 'uimage2DMS' | 'usampler2DMSArray' | 'uimage2DMSArray' |
            'usamplerCubeArray' | 'uimageCubeArray' | 'atomic_uint';

/////
//built-in things---------------------------------------------------------------
/////
//functions
BI_FUNCTION : ANGLE_TRIGONOMETRIC_FUNCTION | EXPONENTIAL_FUNCTION | 
                    COMMON_FUNCTION | GEOMETRIC_FUNCTION;

fragment
ANGLE_TRIGONOMETRIC_FUNCTION : 'radians' | 'degrees' | 'sin' | 'cos' | 'asin' | 'acos';
fragment
EXPONENTIAL_FUNCTION : 'pow' | 'exp' | 'log' | 'exp2' | 'log2' | 'sqrt' | 'inversesqrt';
fragment
COMMON_FUNCTION : 'abs' | 'sign' | 'floor' | 'trunc' | 'round' | 'ceil' | 'mod' | 
                  'min' | 'max' | 'clamp';
fragment
GEOMETRIC_FUNCTION : 'length' | 'dot' | 'normalize';

//macros
BI_MACRO : '__LINE__' | '__FILE__' | '__VERSION__';

//variables
BI_INTERPOLATION_VARIABLE : 'gl_FrontColor' | 'gl_BackColor' | 'gl_FrontSecondaryColor' |
                            'gl_BackSecondaryColor' | 'gl_Color' | 'gl_SecondaryColor';

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
//characters--------------------------------------------------------------------
/////
DOT : '.';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
PLUS : '+';
DASH : '-';
BANG : '!';
TILDE : '~';
STAR : '*';
SLASH : '/';
PERCENT : '%';
LEFT_ANGLE : '>';
RIGHT_ANGLE : '<';
EQUAL : '=';
CARET : '^';
VERTICAL_BAR : '|';
AMPERSAND : '&';
QUESTION : '?';
VECTOR_FIELD : 'x' | 'y' | 'z' | 'w' | 'r' | 'g' | 'b' | 'a';

//round brackets
LRB : '(';
RRB : ')';

//curly brackets
LCB : '{';
RCB : '}';

//square brackets
LSB : '[';
RSB : ']';

/////
//comments----------------------------------------------------------------------
/////
MULTI_LINE_COMMENT : '/*' .*? '*/';
SINGLE_LINE_COMMENT : '//' .*? (NEW_LINE | EOF);

/////
//hidden------------------------------------------------------------------------
/////
NEW_LINE : [\r\n]+ -> channel(HIDDEN);
SPACE : ' ' -> channel(HIDDEN);
TAB : '\t' -> channel(HIDDEN);

// '\'  line-continuation character
//de hogyan?

/////
//others------------------------------------------------------------------------
/////
IDENTIFIER : ('_' | LETTER) ('_' | LETTER | DIGIT)*;
fragment    //egyenlõre nem használom
CHARACTER : [_%<>(){}^&~=!;,?] | LETTER | DIGIT | '.' | '+' | '-' | '*' | 
            '|' | ':' | '[' | ']' | '/';
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