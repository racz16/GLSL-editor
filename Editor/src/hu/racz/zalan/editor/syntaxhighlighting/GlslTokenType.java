package hu.racz.zalan.editor.syntaxhighlighting;

import hu.racz.zalan.editor.antlr.generated.*;

public enum GlslTokenType {
    PD_ERROR(GLSLLexer.PD_ERROR, "macro"),
    PD_PRAGMA(GLSLLexer.PD_PRAGMA, "macro"),
    PDA_PRAGMA_DEBUG(GLSLLexer.PDA_PRAGMA_DEBUG, "macro"),
    PDA_PRAGMA_OPTIMIZE(GLSLLexer.PDA_PRAGMA_OPTIMIZE, "macro"),
    PDA_PRAGMA_STDGL(GLSLLexer.PDA_PRAGMA_STDGL, "macro"),
    PDA_PRAGMA_TOGGLE(GLSLLexer.PDA_PRAGMA_TOGGLE, "macro"),
    PD_VERSION(GLSLLexer.PD_VERSION, "macro"),
    PDA_VERSION_PROFILE(GLSLLexer.PDA_VERSION_PROFILE, "macro"),
    PD_LINE(GLSLLexer.PD_LINE, "macro"),
    PD_EXTENSION(GLSLLexer.PD_EXTENSION, "macro"),
    PDA_EXTENSION_ALL_BEHAVIOUR(GLSLLexer.PDA_EXTENSION_ALL_BEHAVIOUR, "macro"),
    PDA_EXTENSION_BEHAVIOUR(GLSLLexer.PDA_EXTENSION_BEHAVIOUR, "macro"),
    PDA_EXTENSION_ALL(GLSLLexer.PDA_EXTENSION_ALL, "macro"),
    KW_LAYOUT(GLSLLexer.KW_LAYOUT, "keyword"),
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
    KW_PRECISION(GLSLLexer.KW_PRECISION, "keyword"),
    Q_PRECISE(GLSLLexer.Q_PRECISE, "keyword"),
    Q_INVARIANT(GLSLLexer.Q_INVARIANT, "keyword"),
    Q_SUBROUTINE(GLSLLexer.Q_SUBROUTINE, "keyword"),
    Q_INTERPOLATION(GLSLLexer.Q_INTERPOLATION, "keyword"),
    Q_STORAGE(GLSLLexer.Q_STORAGE, "keyword"),
    Q_SHARED(GLSLLexer.Q_SHARED, "keyword"),
    Q_PRECISION(GLSLLexer.Q_PRECISION, "keyword"),
    RESERVED_KEYWORD(GLSLLexer.RESERVED_KEYWORD, "error"),
    TYPE(GLSLLexer.TYPE, "type"),
    BI_FUNCTION(GLSLLexer.BI_FUNCTION, "builtin"),
    BI_MACRO(GLSLLexer.BI_MACRO, "default"),
    BI_INTERPOLATION_VARIABLE(GLSLLexer.BI_INTERPOLATION_VARIABLE, "default"),
    BOOL_LITERAL(GLSLLexer.BOOL_LITERAL, "default"),
    INT_LITERAL(GLSLLexer.INT_LITERAL, "number"),
    FLOAT_LITERAL(GLSLLexer.FLOAT_LITERAL, "number"),
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
    DOT(GLSLLexer.DOT, "character"),
    COMMA(GLSLLexer.COMMA, "character"),
    COLON(GLSLLexer.COLON, "character"),
    SEMICOLON(GLSLLexer.SEMICOLON, "character"),
    QUESTION(GLSLLexer.QUESTION, "character"),
    VECTOR_FIELD(GLSLLexer.VECTOR_FIELD, "character"),
    LRB(GLSLLexer.LRB, "character"),
    RRB(GLSLLexer.RRB, "character"),
    LCB(GLSLLexer.LCB, "character"),
    RCB(GLSLLexer.RCB, "character"),
    LSB(GLSLLexer.LSB, "character"),
    RSB(GLSLLexer.RSB, "character"),
    MULTI_LINE_COMMENT(GLSLLexer.MULTI_LINE_COMMENT, "comment"),
    SINGLE_LINE_COMMENT(GLSLLexer.SINGLE_LINE_COMMENT, "comment"),
    NEW_LINE(GLSLLexer.NEW_LINE, "character"),
    SPACE(GLSLLexer.SPACE, "character"),
    TAB(GLSLLexer.TAB, "character"),
    IDENTIFIER(GLSLLexer.IDENTIFIER, "identifier");

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
