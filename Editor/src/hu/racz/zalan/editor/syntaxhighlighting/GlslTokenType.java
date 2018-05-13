package hu.racz.zalan.editor.syntaxhighlighting;

import hu.racz.zalan.editor.antlr.generated.*;

public enum GlslTokenType {
    MACRO(AntlrGlslLexer.MACRO, "macro"),
    //keywords
    KW_BREAK(AntlrGlslLexer.KW_BREAK, "keyword"),
    KW_CONTINUE(AntlrGlslLexer.KW_CONTINUE, "keyword"),
    KW_DO(AntlrGlslLexer.KW_DO, "keyword"),
    KW_FOR(AntlrGlslLexer.KW_FOR, "keyword"),
    KW_WHILE(AntlrGlslLexer.KW_WHILE, "keyword"),
    KW_SWITCH(AntlrGlslLexer.KW_SWITCH, "keyword"),
    KW_CASE(AntlrGlslLexer.KW_CASE, "keyword"),
    KW_DEFAULT(AntlrGlslLexer.KW_DEFAULT, "keyword"),
    KW_IF(AntlrGlslLexer.KW_IF, "keyword"),
    KW_ELSE(AntlrGlslLexer.KW_ELSE, "keyword"),
    KW_DISCARD(AntlrGlslLexer.KW_DISCARD, "keyword"),
    KW_RETURN(AntlrGlslLexer.KW_RETURN, "keyword"),
    KW_STRUCT(AntlrGlslLexer.KW_STRUCT, "keyword"),
    KW_VOID(AntlrGlslLexer.KW_VOID, "keyword"),
    //reserved keywords
    RESERVED_KEYWORD(AntlrGlslLexer.RESERVED_KEYWORD, "error"),
    //qualifiers
    Q_PRECISION(AntlrGlslLexer.Q_PRECISION, "qualifier"),
    Q_LAYOUT(AntlrGlslLexer.Q_LAYOUT, "qualifier"),
    Q_PRECISE(AntlrGlslLexer.Q_PRECISE, "qualifier"),
    Q_INVARIANT(AntlrGlslLexer.Q_INVARIANT, "qualifier"),
    Q_SUBROUTINE(AntlrGlslLexer.Q_SUBROUTINE, "qualifier"),
    Q_SMOOTH(AntlrGlslLexer.Q_SMOOTH, "qualifier"),
    Q_FLAT(AntlrGlslLexer.Q_FLAT, "qualifier"),
    Q_NONPERSPECTIVE(AntlrGlslLexer.Q_NONPERSPECTIVE, "qualifier"),
    Q_CONST(AntlrGlslLexer.Q_CONST, "qualifier"),
    Q_INOUT(AntlrGlslLexer.Q_INOUT, "qualifier"),
    Q_IN(AntlrGlslLexer.Q_IN, "qualifier"),
    Q_OUT(AntlrGlslLexer.Q_OUT, "qualifier"),
    Q_CENTROID(AntlrGlslLexer.Q_CENTROID, "qualifier"),
    Q_PATCH(AntlrGlslLexer.Q_PATCH, "qualifier"),
    Q_SAMPLE(AntlrGlslLexer.Q_SAMPLE, "qualifier"),
    Q_UNIFORM(AntlrGlslLexer.Q_UNIFORM, "qualifier"),
    Q_BUFFER(AntlrGlslLexer.Q_BUFFER, "qualifier"),
    Q_VARYING(AntlrGlslLexer.Q_VARYING, "qualifier"),
    Q_ATTRIBUTE(AntlrGlslLexer.Q_ATTRIBUTE, "qualifier"),
    Q_COHERENT(AntlrGlslLexer.Q_COHERENT, "qualifier"),
    Q_VOLATILE(AntlrGlslLexer.Q_VOLATILE, "qualifier"),
    Q_RESTRICT(AntlrGlslLexer.Q_RESTRICT, "qualifier"),
    Q_READONLY(AntlrGlslLexer.Q_READONLY, "qualifier"),
    Q_WRIREONLY(AntlrGlslLexer.Q_WRIREONLY, "qualifier"),
    Q_SHARED(AntlrGlslLexer.Q_SHARED, "qualifier"),
    Q_HIGHP(AntlrGlslLexer.Q_HIGHP, "qualifier"),
    Q_MEDIUMP(AntlrGlslLexer.Q_MEDIUMP, "qualifier"),
    Q_LOWP(AntlrGlslLexer.Q_LOWP, "qualifier"),
    //types
    TYPE(AntlrGlslLexer.TYPE, "type"),
    //literals
    BOOL_LITERAL(AntlrGlslLexer.BOOL_LITERAL, "default"),
    INT_LITERAL(AntlrGlslLexer.INT_LITERAL, "number"),
    FLOAT_LITERAL(AntlrGlslLexer.FLOAT_LITERAL, "number"),
    //operators
    OP_MUL(AntlrGlslLexer.OP_MUL, "operator"),
    OP_ADD(AntlrGlslLexer.OP_ADD, "operator"),
    OP_SUB(AntlrGlslLexer.OP_SUB, "operator"),
    OP_DIV(AntlrGlslLexer.OP_DIV, "operator"),
    OP_MOD(AntlrGlslLexer.OP_MOD, "operator"),
    OP_INC(AntlrGlslLexer.OP_INC, "operator"),
    OP_DEC(AntlrGlslLexer.OP_DEC, "operator"),
    OP_SHIFT(AntlrGlslLexer.OP_SHIFT, "operator"),
    OP_RELATIONAL(AntlrGlslLexer.OP_RELATIONAL, "operator"),
    OP_BIT(AntlrGlslLexer.OP_BIT, "operator"),
    OP_BIT_UNARY(AntlrGlslLexer.OP_BIT_UNARY, "operator"),
    OP_LOGICAL(AntlrGlslLexer.OP_LOGICAL, "operator"),
    OP_LOGICAL_UNARY(AntlrGlslLexer.OP_LOGICAL_UNARY, "operator"),
    OP_MODIFY(AntlrGlslLexer.OP_MODIFY, "operator"),
    OP_ASSIGN(AntlrGlslLexer.OP_ASSIGN, "operator"),
    //comments
    MULTI_LINE_COMMENT(AntlrGlslLexer.MULTI_LINE_COMMENT, "comment"),
    SINGLE_LINE_COMMENT(AntlrGlslLexer.SINGLE_LINE_COMMENT, "comment"),
    //characters
    NEW_LINE(AntlrGlslLexer.NEW_LINE, "character"),
    SPACE(AntlrGlslLexer.SPACE, "character"),
    TAB(AntlrGlslLexer.TAB, "character"),
    IDENTIFIER(AntlrGlslLexer.IDENTIFIER, "identifier"),
    DOT(AntlrGlslLexer.DOT, "character"),
    COMMA(AntlrGlslLexer.COMMA, "character"),
    COLON(AntlrGlslLexer.COLON, "character"),
    SEMICOLON(AntlrGlslLexer.SEMICOLON, "character"),
    QUESTION(AntlrGlslLexer.QUESTION, "character"),
    LRB(AntlrGlslLexer.LRB, "character"),
    RRB(AntlrGlslLexer.RRB, "character"),
    LCB(AntlrGlslLexer.LCB, "character"),
    RCB(AntlrGlslLexer.RCB, "character"),
    LSB(AntlrGlslLexer.LSB, "character"),
    RSB(AntlrGlslLexer.RSB, "character");

    private final int id;
    private final String category;

    private GlslTokenType(int id, String category) {
	this.id = id;
	this.category = category;
    }

    public String getCategory() {
	return category;
    }

    public int getId() {
	return id;
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
