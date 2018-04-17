lexer grammar GLSLLexerRules;

/////
//preprocessor------------------------------------------------------------------
/////
PD_ERROR : '#error';
PD_PRAGMA : '#pragma';
PDA_PRAGMA_DEBUG : 'debug';
PDA_PRAGMA_OPTIMIZE : 'optimize';
PDA_PRAGMA_STDGL : 'STDGL';
PDA_PRAGMA_TOGGLE : 'on' | 'off';
PD_VERSION : '#version' ;
PDA_VERSION_PROFILE : 'core' | 'compatibility' | 'es';
PD_LINE : '#line' ;
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

QPV_LAYOUT : QPV_FLOAT_IMAGE_FORMAT | QPV_INT_IMAGE_FORMAT | 
             QPV_UINT_IMAGE_FORMAT_QUALIFIER;
fragment
QPV_FLOAT_IMAGE_FORMAT : 'rgba32f' | 'rgba16f' | 'rg32f' | 'rg16f' | 
                       'r11f_g11f_b10f' |  'r32f' | 'r16f' | 'rgba16' | 
                       'rgb10_a2' | 'rgba8' | 'rg16' |  'rg8' | 'r16' | 'r8' | 
                       ('rgba16' | 'rgba8' | 'rg16' | 'rg8' | 'r16' | 'r8')
                       '_snorm';
fragment
QPV_INT_IMAGE_FORMAT : 'r' ('g' 'ba'?)? ('8i' | '16i' | '32i');
fragment
QPV_UINT_IMAGE_FORMAT_QUALIFIER : ('r' ('g' 'ba'?)? ('8ui' | '16ui' | '32ui')) |
                                'rgb10_a2ui';

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
BI_VARIABLE : BI_LANGUAGE_DEPENDENT_VARIABLE | BI_CUBE_MAP_VARIABLE | 
              BI_COMPATIBILITY_VARIABLE | BI_CONSTANT | BI_COMPATIBILITY_CONSTANT |
              BI_UNIFORM_STATE_VARIABLE | BI_COMPATIBILITY_STATE_VARIABLE;
fragment
BI_LANGUAGE_DEPENDENT_VARIABLE : 'gl_NumWorkGroups' | 'gl_WorkGroupSize' | 
                                 'gl_workGroupID' | 'gl_LocalInvocationID' | 
                                 'gl_GlobalInvocationID' | 'gl_LocalInvocationIndex' | 
                                 'gl_VertexID' | 'gl_InstanceID' | 'gl_DrawID' | 
                                 'gl_BaseVertex' | 'gl_BaseInstance' | 'gl_Position' |
                                 'gl_PointSize' | 'gl_ClipDistance' | 
                                 'gl_CullDistance' | 'gl_in' | 'gl_PrimitiveIDIn' | 
                                 'gl_InvocationID' | 'gl_PrimitiveID' | 'gl_Layer' | 
                                 'gl_ViewportIndex' | 'gl_PatchVerticesIn' | 
                                 'gl_TessLevelOuter' | 'gl_TessLevelInner' |
                                 'gl_TessCord' | 'gl_FragCord' | 'gl_FrontFacing' |
                                 'gl_PointCoord' | 'gl_SampleID' | 'gl_SamplePosition' |
                                 'gl_SampleMaskIn' | 'gl_HelperInvocation' | 
                                 'gl_FragDepth' | 'gl_SampleMask';
fragment
BI_CUBE_MAP_VARIABLE : 'TEXTURE_CUBE_MAP' ('_POSITIVE_' | '_NEGATIVE_') [XYZ];
fragment
BI_COMPATIBILITY_VARIABLE : 'gl_ClipVertex' | 'gl_FrontColor' | 'gl_BackColor' |
                            'gl_FrontSecondaryColor' | 'gl_BackSecondaryColor' |
                            'gl_TexCoord' | 'gl_FogFragCoord' | 'gl_Color' |
                            'gl_FragColor' | 'gl_FragData' | 'gl_Normal' | 
                            'gl_Vertex' | 'gl_MultiTexCoord' [0-7] | 'gl_FogColor';
fragment
BI_CONSTANT :'gl_MaxCompute' ('WorkGroupCount' | 'WorkGroupSize' | 'UniformComponents' |
                              'TextureImageUnits' | 'ImageUniforms' | 'AtomicCounters' |
                              'AtomicCounterBuffers') |
             'gl_MaxVertex' ('Attribs' | 'UniformComponents' | 'OutputComponents' |
                             'TextureImageUnits' | 'ImageUniforms' | 'UniformVectors' |
                             'AtomicCounters' | 'AtomicCounterBuffers') |
             'gl_MaxGeometry' ('InputComponents' | 'OutputComponents' | 
                               'ImageUniforms' | 'TextureImageUnits' |
                               'OutputVertices' | 'TotalOutputComponents' |
                               'UniformComponents' | 'VaryingComponents' | 
                               'AtomicCounters' | 'AtomicCounterBuffers') |
             'gl_MaxFragment' ('InputComponents' | 'ImageUniforms' | 'UniformComponents' |
                               'UniformVectors' | 'AtomicCounters' | 
                               'AtomicCounterBuffers' | 'ImageUniforms') |
             'gl_MaxCombined' ('TextureImageUnits' | 'ImageUnitsAndFragmentOutputs' |
                               'ShaderOutputResources' | 'ImageUniforms' | 
                               'AtomicCounters' | 'AtomicCounterBuffers' |
                               'ClipAndCullDistances') |
             'gl_MaxTessControl' ('ImageUniforms' | 'InputComponents' | 
                                  'OutputComponents' | 'TextureImageUnits' | 
                                  'UniformComponents' | 'TotalOutputComponents' |
                                  'AtomicCounters' | 'AtomicCounterBuffers') |
             'gl_MaxTessEvaluation' ('ImageUniforms' | 'InputComponents' | 
                                     'OutputComponents' | 'TextureImageUnits' | 
                                     'UniformComponents' | 'AtomicCounters' |
                                     'AtomicCounterBuffers') |
             'gl_MaxVaryingComponents' | 'gl_MaxTextureImageUnits' | 'gl_MaxImageUnits' |
             'gl_MaxImageSamples' | 'gl_MaxDrawBuffers' | 'gl_MaxClipDistances' |
             'gl_MaxTessPatchComponents' | 'gl_MaxPatchVertices' | 'gl_MaxTessGenLevel' |
             'gl_MaxViewports' | 'gl_MaxVaryingVectors' | 'gl_MaxAtomicCounterBindings' |
             'gl_MaxAtomicCounterBufferSize' | 'gl_MinProgramTexelOffset' | 
             'gl_MaxProgramTexelOffset' | 'gl_MaxTransformFeedbackBuffers' |
             'gl_MaxTransformFeedbackInterleavedComponents' | 'gl_MaxCullDistances' |
             'gl_MaxSamples';
fragment
BI_COMPATIBILITY_CONSTANT: 'gl_MaxTextureUnits' | 'gl_MaxTextureCoords' | 
                           'gl_MaxClipPlanes' | 'gl_MaxVaryingFloats';
fragment
BI_UNIFORM_STATE_VARIABLE: 'gl_DepthRange' | 'gl_NumSamples';
fragment
BI_COMPATIBILITY_STATE_VARIABLE : ('gl_ModelViewMatrix' | 'gl_ProjectionMatrix' |
                                  'gl_ModelViewPorjectionMatrix' | 'gl_TextureMatrix')
                                  ('Inverse' | 'Transpose' | 'InverseTranspose')? |
                                  'gl_NormalMatrix' | 'gl_NormalScale' | 'gl_ClipPlane' |
                                  'gl_Point' | 'gl_FrontMaterial' | 'gl_BackMaterial' |
                                  'gl_LightSource' | 'gl_LightModel' | 
                                  'gl_FrontLightModelProduct' | 'gl_BackLightModelProduct' |
                                  'gl_FrontLightProduct' | 'gl_BackLightProduct' | 
                                  'gl_TextureEnvColor' | 'gl_ExePlane' [STRQ] |
                                  'gl_ObjectPlane' [STRQ] | 'gl_Fog';

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
//comments----------------------------------------------------------------------
/////
//multi line nem lehet parser szabály, mert bármely két token közé be szabad rakni
//COMMENT : MULTI_LINE_COMMENT | ONE_LINE_MULTI_LINE_COMMENT | SINGLE_LINE_COMMENT;
MULTI_LINE_COMMENT : '/*' .*? NEW_LINE .*? '*/'  -> channel(HIDDEN);
ONE_LINE_MULTI_LINE_COMMENT : '/*' .*? '*/'  -> channel(HIDDEN);
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


//mode MACRO;

//MLC : '/*' .*? NL .*? '*/' -> popMode;
//OLMLC : '/*' .*? '*/';
//SLC : '//' .*? (NL | EOF) -> popMode;
//NL : [\r\n]+ -> popMode;
//S : ' ' -> channel(HIDDEN);
//T : '\t' -> channel(HIDDEN);