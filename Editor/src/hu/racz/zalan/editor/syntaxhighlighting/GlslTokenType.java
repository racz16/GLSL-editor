package hu.racz.zalan.editor.syntaxhighlighting;

import hu.racz.zalan.editor.antlr.generated.*;

public enum GlslTokenType {
    MACRO(GLSLLexer.MACRO, "macro"),
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
    RSB(GLSLLexer.RSB, "character");
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
