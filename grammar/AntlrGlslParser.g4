parser grammar AntlrGlslParser;

options{
    tokenVocab = AntlrGlslLexer;
}

start : (function_prototype | function_definition | declaration_statement |
         SEMICOLON)* ;

/////
//functions---------------------------------------------------------------------
/////
function_signature : return_type IDENTIFIER LRB function_parameter_list? RRB;
return_type : precision_qualifier? function_subroutine_qualifier? (type array_declaration? | KW_VOID);
function_subroutine_qualifier : Q_SUBROUTINE (LRB type_name_list RRB)?;
function_parameter_list : function_parameter (COMMA function_parameter)* | KW_VOID;
function_parameter : parameter_qualifier* type (IDENTIFIER array_declaration?)?;
parameter_qualifier : (Q_CONST | Q_IN | Q_OUT | Q_INOUT | Q_PRECISE) | 
                      memory_storage_qualifier | precision_qualifier;

function_prototype : function_signature SEMICOLON;
function_definition : function_signature compound_statement;

function_call : type LRB function_call_parameter_list? RRB;
function_call_parameter_list: expression_list | KW_VOID ;

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
for_iteration : KW_FOR LRB init_declaration_list? SEMICOLON expression? SEMICOLON expression_list? RRB statement;
while_iteration : KW_WHILE LRB expression RRB statement;
do_while_iteration : KW_DO statement KW_WHILE LRB expression RRB SEMICOLON;

jump_statement : (KW_CONTINUE | KW_BREAK | KW_DISCARD | KW_RETURN expression?) SEMICOLON;

expression_statement : expression_list? SEMICOLON;

/////
//declarations------------------------------------------------------------------
/////
declaration_statement : Q_PRECISION precision_qualifier type SEMICOLON |                        //precision
                        init_declaration_list SEMICOLON |                                       //variable, struct declaration
                        type_qualifier* IDENTIFIER LCB struct_declaration_list RCB              //interface block
                        (IDENTIFIER array_declaration?)? SEMICOLON |
                        type_qualifier* (IDENTIFIER (COMMA IDENTIFIER)*)? SEMICOLON;

init_declaration_list : single_declaration (COMMA IDENTIFIER array_declaration? (OP_ASSIGN expression)?)*;
single_declaration : (type_qualifier* (type | struct_specifier)) 
                     (IDENTIFIER array_declaration? (OP_ASSIGN expression)?)?;

struct_declaration_list : struct_declaration+;
struct_declaration : type_qualifier* type struct_declarator_list? SEMICOLON;
struct_declarator_list : struct_declarator (COMMA struct_declarator)*;
struct_declarator : IDENTIFIER array_declaration?;
struct_specifier : KW_STRUCT IDENTIFIER? LCB struct_declaration_list RCB;

/////
//expressions-------------------------------------------------------------------
/////
expression : variable_usage_identifier | function_call |  literal | LRB expression RRB |       //id, function, literal, ()
             (OP_LOGICAL_UNARY | OP_ADD | OP_SUB | OP_BIT_UNARY | OP_INC |      //prefix unary
                         OP_DEC) expression |                                   
             expression (OP_INC | OP_DEC) |                                     //postfix unary
             expression (OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB | OP_SHIFT |//binary operator
                         OP_BIT | OP_RELATIONAL | OP_LOGICAL | OP_MODIFY | 
                         OP_ASSIGN) expression |
             expression QUESTION expression_list COLON expression_list |        //if
             expression DOT IDENTIFIER |                                        //.field
             expression array_usage;                                            //array
expression_list: expression (COMMA expression)*;
constant_expression : literal | IDENTIFIER ;

variable_usage_identifier : IDENTIFIER;

/////
//types and literals------------------------------------------------------------
/////
fully_specified_type : type_qualifier* type;
fully_specified_struct : type_qualifier* struct_specifier;
type : IDENTIFIER | TYPE;
//qualifiers
type_qualifier : storage_qualifier | layout_qualifier | precision_qualifier | 
               interpolation_qualifier | Q_INVARIANT | Q_PRECISE |  Q_SUBROUTINE;
type_name_list : IDENTIFIER (COMMA IDENTIFIER)*;

storage_qualifier : memory_storage_qualifier | auxiliary_storage_qualifier | 
                    Q_CONST | Q_IN | Q_OUT | Q_ATTRIBUTE | Q_UNIFORM | 
                    Q_VARYING | Q_BUFFER | Q_SHARED;
auxiliary_storage_qualifier : Q_CENTROID | Q_SAMPLE | Q_PATCH;
memory_storage_qualifier : Q_COHERENT | Q_VOLATILE | Q_RESTRICT | Q_READONLY | Q_WRIREONLY;

layout_qualifier : Q_LAYOUT LRB layout_qualifier_id_list RRB;
layout_qualifier_id_list : layout_qualifier_id (COMMA layout_qualifier_id)*;
layout_qualifier_id : IDENTIFIER (OP_ASSIGN (IDENTIFIER | literal))? | Q_SHARED;

precision_qualifier : Q_LOWP | Q_MEDIUMP | Q_HIGHP;
interpolation_qualifier : Q_SMOOTH | Q_FLAT | Q_NONPERSPECTIVE;
//literals
literal : BOOL_LITERAL | INT_LITERAL | FLOAT_LITERAL;
bool_literal : BOOL_LITERAL;
number_literal : INT_LITERAL | FLOAT_LITERAL;
//arrays
array_usage : (LSB constant_expression RSB)+;
array_declaration : (LSB constant_expression? RSB)+;