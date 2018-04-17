grammar GLSL;

start : (macro | function_prototype | function_definition | declaration_statement|
         SEMICOLON)* ;

/////
//macros------------------------------------------------------------------------
////
//TODO: lexer mode
macro : (m_version | m_line | m_pragma | m_extension | m_error) (NEW_LINE | EOF);
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
function_signature : return_type IDENTIFIER LRB function_parameter_list? RRB;
return_type : precision_qualifier? type array_declaration? | KW_VOID;
function_parameter_list : function_parameter (COMMA function_parameter)* | KW_VOID;
function_parameter : parameter_qualifier* type (IDENTIFIER array_declaration?)?;
parameter_qualifier : (Q_CONST | Q_IN | Q_OUT | Q_INOUT | Q_PRECISE) | 
                      memory_qualifier | precision_qualifier;

function_prototype : function_signature SEMICOLON;
function_definition : function_signature compound_statement;

function_call : (BI_FUNCTION | TYPE | IDENTIFIER) LRB function_call_parameter_list? RRB;
function_call_parameter_list: expression | KW_VOID ;

/////
//statements--------------------------------------------------------------------
/////
statement_list : statement+;
statement : compound_statement | simple_statement;

compound_statement : LCB statement_list? RCB;
simple_statement : declaration_statement | expression_statement | 
                   selection_statement | iteration_statement | jump_statement |
                   switch_statement;

selection_statement : KW_IF LRB expression RRB statement (KW_ELSE statement)?;

switch_statement : KW_SWITCH LRB expression RRB LCB case_group* RCB;
case_group : case_label case_statement_list?;
case_label : (KW_DEFAULT | KW_CASE constant_expression) COLON;
case_statement_list : (declaration_statement | expression_statement)+;

iteration_statement : for_iteration | while_iteration | do_while_iteration;
for_iteration : KW_FOR LRB init_declaration_list SEMICOLON expression SEMICOLON expression RRB statement;
while_iteration : KW_WHILE LRB expression RRB statement;
do_while_iteration : KW_DO statement KW_WHILE LRB expression RRB SEMICOLON;

jump_statement : (KW_CONTINUE | KW_BREAK | KW_DISCARD | KW_RETURN expression?) SEMICOLON;

expression_statement : expression? SEMICOLON;

/////
//declarations------------------------------------------------------------------
/////
declaration_statement : KW_PRECISION precision_qualifier type SEMICOLON | 
                        init_declaration_list SEMICOLON |
                      type_qualifier* IDENTIFIER LCB struct_declaration_list RCB 
                      (IDENTIFIER array_declaration?)? SEMICOLON |
                      type_qualifier* (IDENTIFIER (COMMA IDENTIFIER)*)? SEMICOLON;

init_declaration_list : single_declaration (COMMA IDENTIFIER array_declaration? (OP_ASSIGN expression))*;
single_declaration : (fully_specified_type | fully_specified_struct) IDENTIFIER? array_declaration? (OP_ASSIGN expression)?;

struct_declaration_list : struct_declaration+;
struct_declaration : type_qualifier* type struct_declarator_list? SEMICOLON;
struct_declarator_list : struct_declarator (COMMA struct_declarator)*;
struct_declarator : IDENTIFIER array_declaration?;
struct_specifier : KW_STRUCT IDENTIFIER? LCB struct_declaration_list RCB;

/////
//expressions-------------------------------------------------------------------
/////
expression : IDENTIFIER | function_call |  literal | LRB expression RRB |                       //id, function, literal, ()
                        (OP_LOGICAL_UNARY | OP_ADD | OP_SUB | OP_BIT_UNARY |
                         OP_INC | OP_DEC) expression |                                          //unary
                                expression (OP_INC | OP_DEC) |
                        expression (OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB |                //binary
                                OP_SHIFT | OP_BIT | OP_RELATIONAL | OP_LOGICAL |
                                OP_MODIFY | OP_ASSIGN) expression |
                        expression QUESTION expression COLON expression |                       //if
                        expression DOT (IDENTIFIER | VECTOR_FIELD+) |                           //.field
                        expression array_usage |                                                //array
                        expression COMMA expression;                                            //list
constant_expression : IDENTIFIER | literal;

/////
//types and literals------------------------------------------------------------
/////

fully_specified_type : type_qualifier* type;
fully_specified_struct : type_qualifier* struct_specifier;
type : IDENTIFIER | TYPE;
//qualifiers
type_qualifier : storage_qualifier | layout_qualifier | precision_qualifier | 
               interpolation_qualifier | Q_INVARIANT | Q_PRECISE;
interpolation_qualifier : Q_SMOOTH | Q_FLAT | Q_NONPERSPECTIVE;
storage_qualifier : Q_CONST | Q_IN | Q_OUT | Q_ATTRIBUTE | Q_UNIFORM | 
                    Q_VARYING | Q_BUFFER | Q_SHARED | auxiliary_storage_qualifier |

Q_SUBROUTINE (LRB type_name_list RRB)?;

auxiliary_storage_qualifier : Q_CENTROID | Q_SAMPLE | Q_PATCH;
precision_qualifier : Q_LOWP | Q_MEDIUMP | Q_HIGHP;
memory_qualifier : Q_COHERENT | Q_VOLATILE | Q_RESTRICT | Q_READONLY | Q_WRIREONLY;


type_name_list : IDENTIFIER (COMMA IDENTIFIER)*;

layout_qualifier : KW_LAYOUT LRB layout_qualifier_id_list RRB;
layout_qualifier_id_list : layout_qualifier_id (COMMA layout_qualifier_id)*;
layout_qualifier_id : QP_LAYOUT (OP_ASSIGN literal)? | Q_SHARED;
//literals
literal : BOOL_LITERAL | INT_LITERAL | FLOAT_LITERAL;
bool_literal : BOOL_LITERAL;
number_literal : INT_LITERAL | FLOAT_LITERAL;
//arrays
array_usage : (LSB constant_expression RSB)+;
array_declaration : (LSB constant_expression? RSB)+;

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
PD_DEFINED: 'defined'; //nem kéne elé # ?

/////
//keywords----------------------------------------------------------------------
/////
KW_LAYOUT : 'layout';
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
KW_PRECISION : 'precision';

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

QP_LAYOUT : 'packed' | 'std140' | 'std430' | 'row_major' | 'column_major' | 
            'binding' | 'offset' | 'align' | 'location' | 'component' | 'index' |
            'triangles' | 'quads' | 'isolines' | 'equal_spacing' | 
            'fractional_even_spacing' | 'fractional_odd_spacing' | 'cw' | 'ccw' |
            'point_mode' | 'points' | 'lines' | 'lines_adjacency' | 
            'triangles_adjacency' | 'invocations' | 'origin_upper_left' | 
            'pixel_center_integer' | 'early_fragment_tests' | 
            'local_size_' [xyz] '_id'? | 'xfb_' ('buffer' | 'stride' | 'offset') |
            'vertices' | 'line_strip' | 'triangle_strip' | 'max_vertices' | 
            'stream' | 'depth_' ('any' | 'greater' | 'less' | 'unchanged') | 
            'constant_id';

Q_FLOAT_IMAGE_FORMAT : 'rgba32f' | 'rgba16f' | 'rg32f' | 'rg16f' | 
                       'r11f_g11f_b10f' |  'r32f' | 'r16f' | 'rgba16' | 
                       'rgb10_a2' | 'rgba8' | 'rg16' |  'rg8' | 'r16' | 'r8' | 
                       ('rgba16' | 'rgba8' | 'rg16' | 'rg8' | 'r16' | 'r8')
                       '_snorm';
Q_INT_IMAGE_FORMAT : 'r' ('g' 'ba'?)? ('8i' | '16i' | '32i');
Q_UINT_IMAGE_FORMAT_QUALIFIER : ('r' ('g' 'ba'?)? ('8ui' | '16ui' | '32ui')) |
                                'rgb10_a2ui';

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
//built-in things---------------------------------------------------------------
/////
//functions
BI_FUNCTION : ANGLE_TRIGONOMETRIC_FUNCTION | EXPONENTIAL_FUNCTION | COMMON_FUNCTION | 
              FLOATING_POINT_PACK_UNPACK_FUNCTION |GEOMETRIC_FUNCTION | MATRIX_FUNCTION |
              VECTOR_RELATIONAL_FUNCTION | INTEGER_FUNCTION | TEXTURE_QUERY_FUNCTION |
              TEXTURE_GATHER_FUNCTION | COMPATIBILITY_PROFILE_TEXTURE_FUNCTION |
              ATOMIC_COUNTER_FUNCTION | ATOMIC_MEMORY_FUNCTION | IMAGE_FUNCTION |
              FRAGMENT_PROCESSING_FUNCTION | INTERPOLATION_FUNCTION | NOISE_FUNCTION |
              GEOMETRY_SHADER_FUNCTION | SHADER_INVOCATION_CONTROL_FUNCTION |
              SHADER_MEMORY_CONTROL_FUNCTION | SHADER_INVOCATION_GROUP_FUNCTION;

fragment
ANGLE_TRIGONOMETRIC_FUNCTION : 'radians' | 'degrees' | 'sin' | 'cos' | 'tan' | 
                               'asin' | 'acos' | 'atan' | 'sinh' | 'cosh' | 'tanh' |
                               'asinh' | 'acosh' | 'atanh';
fragment
EXPONENTIAL_FUNCTION : 'pow' | 'exp' | 'log' | 'exp2' | 'log2' | 'sqrt' | 'inversesqrt';
fragment
COMMON_FUNCTION : 'abs' | 'sign' | 'floor' | 'trunc' | 'round' | 'roundEven' | 'ceil' | 
                  'fract' | 'mod' | 'modf' | 'min' | 'max' | 'clamp' | 'mix' | 'step' |
                  'smoothstep' | 'isnan' | 'isinf' | 'floatBitsToInt' | 'floatBitsToUint' |
                  'intBitsToFloat' | 'uintBitsToFloat' | 'fma' | 'frexp' | 'ldexp';
fragment
FLOATING_POINT_PACK_UNPACK_FUNCTION : 'packUnorm2x16' | 'packSnorm2x16' | 'packUnorm4x8' |
                                      'packSnorm4x8' | 'unpackUnorm2x16' | 'unpackSnorm2x16' |
                                      'unpackUnorm4x8' | 'unpackSnorm4x8' | 'packDouble2x32' |
                                      'unpackDouble2x32' | 'packHalf2x16' | 'unpackHalf2x16';
fragment
GEOMETRIC_FUNCTION : 'length' | 'distance' | 'dot' | 'cross' | 'normalize' | 'transform' |
                     'faceforward' | 'reflect' | 'refract';
fragment
MATRIX_FUNCTION : 'matrixCompMult' | 'outerProduct' | 'transpose' | 'determinant' |
                  'inverse';
fragment
VECTOR_RELATIONAL_FUNCTION : 'lessThan' | 'lessThanEqual' | 'greaterThan' | 'greaterThanEqual' |
                             'equal' | 'notEqual' | 'any' | 'all' | 'not';
fragment
INTEGER_FUNCTION : 'uaddCarry' | 'usubBorrow' | 'umulExtended' | 'imulExtended' |
                   'bitfieldExtract' | 'bitfieldInsert' | 'bitfieldReverse' | 
                   'bitCount' | 'findLSB' | 'findMSB';
fragment
TEXTURE_QUERY_FUNCTION : 'textureSize' | 'textureQueryLod' | 'textureQueryLevels' | 
                         'textureSamples' | 'texture' | 'textureProj' | 'textureLod' |
                         'textureOffset' | 'texelFetch' | 'texelFetchOffset' |
                         'textureProjOffset' | 'textureLodOffset' | 'textureProjLod' |
                         'textureProjLodOffset' | 'textureGrad' | 'textureGradOffset' |
                         'textureProjGrad' | 'textureProjGradOffset';
fragment
TEXTURE_GATHER_FUNCTION : 'textureGather' | 'textureGatherOffset' | 'textureGatherOffsets';
fragment
COMPATIBILITY_PROFILE_TEXTURE_FUNCTION : 'texture'
                                         ('1D' | '2D' | '3D') 'Proj'? 'Lod'? |
                                         'textureCube' 'Lod'? | 
                                         'shadow' ('1D' | '2D') 'Proj'? 'Lod'?;
fragment
ATOMIC_COUNTER_FUNCTION : 'atomicCounter' ('Increment' | 'Decrement' | 'Add' | 
                                           'Subtract' | 'Min' | 'Max' | 'And' |
                                           'Or' | 'Xor' | 'Exchange' | 'CompSwap')?;
fragment
ATOMIC_MEMORY_FUNCTION : 'atomic' ('Add' | 'Min' | 'Max' | 'And' | 'Or' | 'Xor' |
                                   'Exchange' | 'CompSwap');
fragment
IMAGE_FUNCTION : 'image' ('Size' | 'Samples' | 'Load' | 'Store' | 'AtomicAdd' |
                          'AtomicMin' | 'AtomicMax' | 'AtomicAnd' | 'AtomicOr' |
                          'AtomicXor' | 'AtomicExchange' | 'AtomicCompSwap');
fragment
FRAGMENT_PROCESSING_FUNCTION : 'dFdx' | 'dFdy' | 'dFdxFine' | 'dFdyFine' | 'dFdxCoarse' |
                               'dFdyCoarse' | 'fwidth' | 'fwidthFine' | 'fwidthCoarse';
fragment
INTERPOLATION_FUNCTION : 'interpolateAt' ('Centroid' | 'Sample' | 'Offset');
fragment
NOISE_FUNCTION : 'noise' [1-4];
fragment
GEOMETRY_SHADER_FUNCTION : 'Emit' ('StreamVertex' | 'StreamPrimitive' | 'Vertex') |
                            'EndPrimitive';
fragment
SHADER_INVOCATION_CONTROL_FUNCTION : 'barrier';
fragment
SHADER_MEMORY_CONTROL_FUNCTION : 'memoryBarrier' ('AtomicCounter' | 'Buffer' | 
                                                  'Shared' | 'Image')? | 'groupMemoryBarrier';
fragment
SHADER_INVOCATION_GROUP_FUNCTION : 'anyInvocation' | 'allInvocations' | 'anyInvocationsEqual';


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
//characters--------------------------------------------------------------------
/////
DOT : '.';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
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
//multi line nem lehet parser szabály, mert bármely két token közé be szabad rakni
MULTI_LINE_COMMENT : '/*' .*? '*/'  -> channel(HIDDEN);
SINGLE_LINE_COMMENT : '//' .*? (NEW_LINE | EOF) -> channel(HIDDEN);

/////
//hidden------------------------------------------------------------------------
/////
NEW_LINE : [\r\n]+ -> channel(HIDDEN);
SPACE : ' ' -> channel(HIDDEN);
TAB : '\t' -> channel(HIDDEN);

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