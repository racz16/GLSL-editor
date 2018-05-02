package hu.racz.zalan.editor.syntaxhighlighting;

import hu.racz.zalan.editor.antlr.generated.*;

public enum GlslTokenType {
    //preprocessor directives
    PD_ERROR(GLSLLexer.PD_ERROR, "macro"),
    PD_PRAGMA(GLSLLexer.PD_PRAGMA, "macro"),
    PD_VERSION(GLSLLexer.PD_VERSION, "macro"),
    PD_LINE(GLSLLexer.PD_LINE, "macro"),
    PD_EXTENSION(GLSLLexer.PD_EXTENSION, "macro"),
    PD_ELSE(GLSLLexer.PD_ELSE, "macro"),
    PD_ENDIF(GLSLLexer.PD_ENDIF, "macro"),
    PD_UNDEF(GLSLLexer.PD_UNDEF, "macro"),
    PD_IFDEF(GLSLLexer.PD_IFDEF, "macro"),
    PD_IFNDEF(GLSLLexer.PD_IFNDEF, "macro"),
    PD_IF(GLSLLexer.PD_IF, "macro"),
    PD_ELIF(GLSLLexer.PD_ELIF, "macro"),
    PD_DEFINE(GLSLLexer.PD_DEFINE, "macro"),
    //keywords
    KW_BREAK(GLSLLexer.KW_BREAK, "keyword"),
    KW_CONTINUE(GLSLLexer.KW_CONTINUE, "keyword"),
    KW_DO(GLSLLexer.KW_DO, "keyword"),
    KW_FOR(GLSLLexer.KW_FOR, "keyword"),
    KW_WHILE(GLSLLexer.KW_WHILE, "keyword"),
    KW_SWITCH(GLSLLexer.KW_SWITCH, "keyword"),
    KW_CASE(GLSLLexer.KW_CASE, "keyword"),
    KW_DEFAULT(GLSLLexer.KW_DEFAULT, "keyword"),
    KW_IF(GLSLLexer.KW_IF, "keyword"),
    KW_ELSE(GLSLLexer.KW_ELSE, "keyword"),
    KW_DISCARD(GLSLLexer.KW_DISCARD, "keyword"),
    KW_RETURN(GLSLLexer.KW_RETURN, "keyword"),
    KW_STRUCT(GLSLLexer.KW_STRUCT, "keyword"),
    KW_VOID(GLSLLexer.KW_VOID, "keyword"),
    //reserved keywords
    RESERVED_KEYWORD(GLSLLexer.RESERVED_KEYWORD, "error"),
    //qualifiers
    Q_PRECISION(GLSLLexer.Q_PRECISION, "qualifier"),
    Q_LAYOUT(GLSLLexer.Q_LAYOUT, "qualifier"),
    Q_PRECISE(GLSLLexer.Q_PRECISE, "qualifier"),
    Q_INVARIANT(GLSLLexer.Q_INVARIANT, "qualifier"),
    Q_SUBROUTINE(GLSLLexer.Q_SUBROUTINE, "qualifier"),
    Q_SMOOTH(GLSLLexer.Q_SMOOTH, "qualifier"),
    Q_FLAT(GLSLLexer.Q_FLAT, "qualifier"),
    Q_NONPERSPECTIVE(GLSLLexer.Q_NONPERSPECTIVE, "qualifier"),
    Q_CONST(GLSLLexer.Q_CONST, "qualifier"),
    Q_INOUT(GLSLLexer.Q_INOUT, "qualifier"),
    Q_IN(GLSLLexer.Q_IN, "qualifier"),
    Q_OUT(GLSLLexer.Q_OUT, "qualifier"),
    Q_CENTROID(GLSLLexer.Q_CENTROID, "qualifier"),
    Q_PATCH(GLSLLexer.Q_PATCH, "qualifier"),
    Q_SAMPLE(GLSLLexer.Q_SAMPLE, "qualifier"),
    Q_UNIFORM(GLSLLexer.Q_UNIFORM, "qualifier"),
    Q_BUFFER(GLSLLexer.Q_BUFFER, "qualifier"),
    Q_VARYING(GLSLLexer.Q_VARYING, "qualifier"),
    Q_ATTRIBUTE(GLSLLexer.Q_ATTRIBUTE, "qualifier"),
    Q_COHERENT(GLSLLexer.Q_COHERENT, "qualifier"),
    Q_VOLATILE(GLSLLexer.Q_VOLATILE, "qualifier"),
    Q_RESTRICT(GLSLLexer.Q_RESTRICT, "qualifier"),
    Q_READONLY(GLSLLexer.Q_READONLY, "qualifier"),
    Q_WRIREONLY(GLSLLexer.Q_WRIREONLY, "qualifier"),
    Q_SHARED(GLSLLexer.Q_SHARED, "qualifier"),
    Q_HIGHP(GLSLLexer.Q_HIGHP, "qualifier"),
    Q_MEDIUMP(GLSLLexer.Q_MEDIUMP, "qualifier"),
    Q_LOWP(GLSLLexer.Q_LOWP, "qualifier"),
    //types
    TYPE(GLSLLexer.TYPE, "type"),
    //built-in features
    BI_FUNCTION(GLSLLexer.BI_FUNCTION, "builtin_function"),
    BI_MACRO(GLSLLexer.BI_MACRO, "builtin_macro"),
    BI_VARIABLE(GLSLLexer.BI_VARIABLE, "builtin_variable"),
    //literals
    BOOL_LITERAL(GLSLLexer.BOOL_LITERAL, "default"),
    INT_LITERAL(GLSLLexer.INT_LITERAL, "number"),
    FLOAT_LITERAL(GLSLLexer.FLOAT_LITERAL, "number"),
    //operators
    OP_MUL(GLSLLexer.OP_MUL, "operator"),
    OP_ADD(GLSLLexer.OP_ADD, "operator"),
    OP_SUB(GLSLLexer.OP_SUB, "operator"),
    OP_DIV(GLSLLexer.OP_DIV, "operator"),
    OP_MOD(GLSLLexer.OP_MOD, "operator"),
    OP_INC(GLSLLexer.OP_INC, "operator"),
    OP_DEC(GLSLLexer.OP_DEC, "operator"),
    OP_SHIFT(GLSLLexer.OP_SHIFT, "operator"),
    OP_RELATIONAL(GLSLLexer.OP_RELATIONAL, "operator"),
    OP_BIT(GLSLLexer.OP_BIT, "operator"),
    OP_BIT_UNARY(GLSLLexer.OP_BIT_UNARY, "operator"),
    OP_LOGICAL(GLSLLexer.OP_LOGICAL, "operator"),
    OP_LOGICAL_UNARY(GLSLLexer.OP_LOGICAL_UNARY, "operator"),
    OP_MODIFY(GLSLLexer.OP_MODIFY, "operator"),
    OP_ASSIGN(GLSLLexer.OP_ASSIGN, "operator"),
    //comments
    MULTI_LINE_COMMENT(GLSLLexer.MULTI_LINE_COMMENT, "comment"),
    ONE_LINE_MULTI_LINE_COMMENT(GLSLLexer.ONE_LINE_MULTI_LINE_COMMENT, "comment"),
    SINGLE_LINE_COMMENT(GLSLLexer.SINGLE_LINE_COMMENT, "comment"),
    //characters
    NEW_LINE(GLSLLexer.NEW_LINE, "character"),
    SPACE(GLSLLexer.SPACE, "character"),
    TAB(GLSLLexer.TAB, "character"),
    IDENTIFIER(GLSLLexer.IDENTIFIER, "identifier"),
    DOT(GLSLLexer.DOT, "character"),
    COMMA(GLSLLexer.COMMA, "character"),
    COLON(GLSLLexer.COLON, "character"),
    SEMICOLON(GLSLLexer.SEMICOLON, "character"),
    QUESTION(GLSLLexer.QUESTION, "character"),
    LRB(GLSLLexer.LRB, "character"),
    RRB(GLSLLexer.RRB, "character"),
    LCB(GLSLLexer.LCB, "character"),
    RCB(GLSLLexer.RCB, "character"),
    LSB(GLSLLexer.LSB, "character"),
    RSB(GLSLLexer.RSB, "character"),
    //preprocessor directive arguments
    PDA_PRAGMA_DEBUG(GLSLLexer.PDA_PRAGMA_DEBUG, "macro"),
    PDA_PRAGMA_OPTIMIZE(GLSLLexer.PDA_PRAGMA_OPTIMIZE, "macro"),
    PDA_PRAGMA_STDGL(GLSLLexer.PDA_PRAGMA_STDGL, "macro"),
    PDA_PRAGMA_TOGGLE(GLSLLexer.PDA_PRAGMA_TOGGLE, "macro"),
    PDA_VERSION_PROFILE(GLSLLexer.PDA_VERSION_PROFILE, "macro"),
    PDA_EXTENSION_ALL_BEHAVIOUR(GLSLLexer.PDA_EXTENSION_ALL_BEHAVIOUR, "macro"),
    PDA_EXTENSION_BEHAVIOUR(GLSLLexer.PDA_EXTENSION_BEHAVIOUR, "macro"),
    PDA_EXTENSION_ALL(GLSLLexer.PDA_EXTENSION_ALL, "macro"),
    //macro mode
    M_SINGLE_LINE_COMMENT(GLSLLexer.M_SINGLE_LINE_COMMENT, "comment"),
    M_MULTI_LINE_COMMENT(GLSLLexer.M_MULTI_LINE_COMMENT, "comment"),
    M_ONE_LINE_MULTI_LINE_COMMENT(GLSLLexer.M_ONE_LINE_MULTI_LINE_COMMENT, "comment"),
    M_OPERATOR(GLSLLexer.M_OPERATOR, "macro"),
    M_NEW_LINE(GLSLLexer.M_NEW_LINE, "macro"),
    M_INT_LITERAL(GLSLLexer.M_INT_LITERAL, "macro"),
    M_FLOAT_LITERAL(GLSLLexer.M_FLOAT_LITERAL, "macro"),
    M_CHARACTERS(GLSLLexer.M_CHARACTERS, "macro"),
    M_COMMA(GLSLLexer.M_COMMA, "macro"),
    M_LRB(GLSLLexer.M_LRB, "macro"),
    M_RRB(GLSLLexer.M_RRB, "macro"),
    M_COLON(GLSLLexer.M_COLON, "macro"),
    M_IDENTIFIER(GLSLLexer.M_IDENTIFIER, "macro"),
    M_SPACE(GLSLLexer.M_SPACE, "macro"),
    M_TAB(GLSLLexer.M_TAB, "macro"),
    //layout mode
    QP_LAYOUT(GLSLLexer.QP_LAYOUT, "qualifier_parameter"),
    QPV_LAYOUT(GLSLLexer.QPV_LAYOUT, "qualifier_parameter"),
    L_LRB(GLSLLexer.L_RRB, "character"),
    L_RRB(GLSLLexer.L_LRB, "character"),
    L_COMMA(GLSLLexer.L_COMMA, "character"),
    L_SHARED(GLSLLexer.L_SHARED, "qualifier_parameter"),
    L_ASSIGN(GLSLLexer.L_ASSIGN, "operator"),
    L_BOOL_LITERAL(GLSLLexer.L_BOOL_LITERAL, "default"),
    L_INT_LITERAL(GLSLLexer.L_INT_LITERAL, "number"),
    L_FLOAT_LITERAL(GLSLLexer.L_FLOAT_LITERAL, "number");

    public int id;
    public String category;
    public String text;

    private GlslTokenType(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public static GlslTokenType valueOf(int id) {
        GlslTokenType[] values = values();
        for (GlslTokenType value : values) {
            if (value.id == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }

}
