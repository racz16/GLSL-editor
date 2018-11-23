parser grammar AntlrGlslParser;

options{
    tokenVocab = AntlrGlslLexer;
}

start : (function_prototype | function_definition | declaration_statement |SEMICOLON)*;

/////
//functions---------------------------------------------------------------------
/////
function_header : return_type IDENTIFIER LRB function_parameter_list? RRB;

return_type : precision_qualifier? function_subroutine_qualifier? (type array_subscript? | KW_VOID);

function_subroutine_qualifier : Q_SUBROUTINE (LRB type_name_list RRB)?;

type_name_list : IDENTIFIER (COMMA IDENTIFIER)*;

function_parameter_list 
    : function_parameter (COMMA function_parameter)* 
    | KW_VOID
    ;

function_parameter : parameter_qualifiers type array_subscript? identifier_optarray?;

parameter_qualifiers : precision_qualifier? parameter_qualifier*;

parameter_qualifier 
    : Q_CONST 
    | Q_IN 
    | Q_OUT 
    | Q_INOUT 
    | Q_PRECISE 
    | memory_qualifier
    ;

function_prototype : function_header SEMICOLON;

function_definition : function_header compound_statement;

function_call : (TYPE | IDENTIFIER) LRB function_call_parameter_list? RRB;

function_call_parameter_list
    : expression_list 
    | KW_VOID
    ;

/////
//statements--------------------------------------------------------------------
/////
statement 
    : compound_statement
    | simple_statement
    ;

compound_statement : LCB (statement+)? RCB;

simple_statement 
    : declaration_statement 
    | expression_statement 
    | selection_statement 
    | iteration_statement 
    | jump_statement 
    | switch_statement
    ;

selection_statement : KW_IF LRB expression RRB statement (KW_ELSE statement)?;

//switch-case
switch_statement : KW_SWITCH LRB expression RRB LCB case_group* RCB;

case_group : case_label case_statement_list?;

case_label : (KW_DEFAULT | KW_CASE expression) COLON;

case_statement_list : statement+;

//iteration
iteration_statement 
    : for_iteration 
    | while_iteration 
    | do_while_iteration
    ;

for_iteration : KW_FOR LRB (variable_declaration | expression_list)? SEMICOLON expression? SEMICOLON expression_list? RRB statement;

while_iteration : KW_WHILE LRB expression RRB statement;

do_while_iteration : KW_DO statement KW_WHILE LRB expression RRB SEMICOLON;

jump_statement : (KW_CONTINUE | KW_BREAK | KW_DISCARD | KW_RETURN expression?) SEMICOLON;

expression_statement : expression_list? SEMICOLON;

/////
//declarations------------------------------------------------------------------
/////
declaration_statement 
    : Q_PRECISION precision_qualifier type SEMICOLON                                                    //precision qualifier
    | variable_declaration SEMICOLON                                                                    //variable, struct declaration
    | type_qualifier* IDENTIFIER LCB member_declaration+ RCB (identifier_optarray)? SEMICOLON           //interface block
    | type_qualifier* (IDENTIFIER (COMMA IDENTIFIER)*)? SEMICOLON
    ;

variable_declaration : single_declaration (COMMA identifier_optarray (OP_ASSIGN expression)?)*;

single_declaration : type_qualifier* (type | struct_declaration) array_subscript? (identifier_optarray (OP_ASSIGN expression)?)?;

member_declaration : type_qualifier* type array_subscript? member_declarator SEMICOLON;

member_declarator : identifier_optarray (COMMA identifier_optarray)*;

struct_declaration : KW_STRUCT IDENTIFIER? LCB member_declaration+ RCB;

identifier_optarray :IDENTIFIER array_subscript?;

/////
//expressions-------------------------------------------------------------------
/////
expression 
    : literal 
    | IDENTIFIER 
    | function_call 
    | LRB expression RRB 
    | expression (array_subscript | DOT IDENTIFIER | DOT function_call | OP_INC | OP_DEC ) 
    | (OP_ADD | OP_SUB | OP_LOGICAL_UNARY | OP_BIT_UNARY | OP_INC | OP_DEC) expression 
    | expression (OP_MUL | OP_DIV | OP_MOD) expression 
    | expression (OP_ADD | OP_SUB) expression 
    | expression OP_SHIFT expression 
    | expression OP_RELATIONAL expression 
    | expression OP_EQUALITY expression 
    | expression OP_BIT_AND expression 
    | expression OP_BIT_XOR expression 
    | expression OP_BIT_OR expression 
    | expression OP_LOGICAL_AND expression 
    | expression OP_LOGICAL_XOR expression 
    | expression OP_LOGICAL_OR expression 
    | expression QUESTION expression_list COLON expression_list
    | expression (OP_ASSIGN | OP_MODIFY) expression
    ;

expression_list: expression (COMMA expression)*;

/////
//types-------------------------------------------------------------------------
/////
type 
    : IDENTIFIER 
    | TYPE
    ;

array_subscript : (LSB expression? RSB)+;

//
//qualifiers
//
type_qualifier 
    : storage_qualifier 
    | layout_qualifier 
    | precision_qualifier 
    | interpolation_qualifier 
    | Q_INVARIANT 
    | Q_PRECISE 
    | Q_SUBROUTINE
    ;

storage_qualifier 
    : auxiliary_storage_qualifier 
    | Q_CONST 
    | Q_IN 
    | Q_OUT 
    | Q_ATTRIBUTE 
    | Q_UNIFORM 
    | Q_VARYING 
    | Q_BUFFER 
    | Q_SHARED
    ;

auxiliary_storage_qualifier 
    : Q_CENTROID 
    | Q_SAMPLE 
    | Q_PATCH
    ;

memory_qualifier 
    : Q_COHERENT 
    | Q_VOLATILE 
    | Q_RESTRICT 
    | Q_READONLY 
    | Q_WRIREONLY
    ;

layout_qualifier : Q_LAYOUT LRB layout_qualifier_id_list RRB;

layout_qualifier_id_list : layout_qualifier_id (COMMA layout_qualifier_id)*;

layout_qualifier_id 
    : IDENTIFIER (OP_ASSIGN (IDENTIFIER | literal))? 
    | Q_SHARED
    ;

precision_qualifier 
    : Q_LOWP 
    | Q_MEDIUMP 
    | Q_HIGHP
    ;

interpolation_qualifier 
    : Q_SMOOTH 
    | Q_FLAT 
    | Q_NONPERSPECTIVE
    ;

//
//literals
//
literal 
    : BOOL_LITERAL 
    | number_literal
    ;

number_literal 
    : INT_LITERAL 
    | FLOAT_LITERAL
    ;
