package hu.racz.zalan.editor.syntaxhighlighting;

import hu.racz.zalan.editor.antlr.generated.*;
import java.util.*;
import org.netbeans.spi.lexer.*;

public class GlslLanguageHierarchy extends LanguageHierarchy<GlslTokenId> {

    private static final List<GlslTokenId> TOKENS = new ArrayList<>();
    private static final Map<Integer, GlslTokenId> ID_TOKEN_MAP = new HashMap<Integer, GlslTokenId>();

    static {
        for (GlslTokenId token : createTokens()) {
            TOKENS.add(token);
            ID_TOKEN_MAP.put(token.ordinal(), token);
        }
    }

    private static List<GlslTokenId> createTokens() {
        List<GlslTokenId> tokens = new ArrayList<>();

        tokens.add(new GlslTokenId("macro", TokenCategory.MACRO, AntlrGlslLexer.MACRO));
        tokens.add(new GlslTokenId("reserved keyword", TokenCategory.ERROR, AntlrGlslLexer.RESERVED_KEYWORD));
        tokens.add(new GlslTokenId("type", TokenCategory.TYPE, AntlrGlslLexer.TYPE));
        tokens.add(new GlslTokenId("identifier", TokenCategory.IDENTIFIER, AntlrGlslLexer.IDENTIFIER));
        //qualifiers
        tokens.add(new GlslTokenId("precision", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_PRECISION));
        tokens.add(new GlslTokenId("layout", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_LAYOUT));
        tokens.add(new GlslTokenId("precise", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_PRECISE));
        tokens.add(new GlslTokenId("invariant", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_INVARIANT));
        tokens.add(new GlslTokenId("subroutine", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_SUBROUTINE));
        tokens.add(new GlslTokenId("smooth", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_SMOOTH));
        tokens.add(new GlslTokenId("flat", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_FLAT));
        tokens.add(new GlslTokenId("nonperspective", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_NONPERSPECTIVE));
        tokens.add(new GlslTokenId("const", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_CONST));
        tokens.add(new GlslTokenId("inout", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_INOUT));
        tokens.add(new GlslTokenId("in", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_IN));
        tokens.add(new GlslTokenId("out", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_OUT));
        tokens.add(new GlslTokenId("centroid", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_CENTROID));
        tokens.add(new GlslTokenId("patch", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_PATCH));
        tokens.add(new GlslTokenId("sample", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_SAMPLE));
        tokens.add(new GlslTokenId("uniform", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_UNIFORM));
        tokens.add(new GlslTokenId("buffer", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_BUFFER));
        tokens.add(new GlslTokenId("varying", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_VARYING));
        tokens.add(new GlslTokenId("attribute", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_ATTRIBUTE));
        tokens.add(new GlslTokenId("coherent", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_COHERENT));
        tokens.add(new GlslTokenId("volatile", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_VOLATILE));
        tokens.add(new GlslTokenId("restrict", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_RESTRICT));
        tokens.add(new GlslTokenId("readonly", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_READONLY));
        tokens.add(new GlslTokenId("writeonly", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_WRIREONLY));
        tokens.add(new GlslTokenId("shared", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_SHARED));
        tokens.add(new GlslTokenId("highp", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_HIGHP));
        tokens.add(new GlslTokenId("mediump", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_MEDIUMP));
        tokens.add(new GlslTokenId("lowp", TokenCategory.QUALIFIER, AntlrGlslLexer.Q_LOWP));
        //keywords
        tokens.add(new GlslTokenId("break", TokenCategory.KEYWORD, AntlrGlslLexer.KW_BREAK));
        tokens.add(new GlslTokenId("continue", TokenCategory.KEYWORD, AntlrGlslLexer.KW_CONTINUE));
        tokens.add(new GlslTokenId("do", TokenCategory.KEYWORD, AntlrGlslLexer.KW_DO));
        tokens.add(new GlslTokenId("for", TokenCategory.KEYWORD, AntlrGlslLexer.KW_FOR));
        tokens.add(new GlslTokenId("while", TokenCategory.KEYWORD, AntlrGlslLexer.KW_WHILE));
        tokens.add(new GlslTokenId("switch", TokenCategory.KEYWORD, AntlrGlslLexer.KW_SWITCH));
        tokens.add(new GlslTokenId("case", TokenCategory.KEYWORD, AntlrGlslLexer.KW_CASE));
        tokens.add(new GlslTokenId("default keyword", TokenCategory.KEYWORD, AntlrGlslLexer.KW_DEFAULT));
        tokens.add(new GlslTokenId("if", TokenCategory.KEYWORD, AntlrGlslLexer.KW_IF));
        tokens.add(new GlslTokenId("else", TokenCategory.KEYWORD, AntlrGlslLexer.KW_ELSE));
        tokens.add(new GlslTokenId("discard", TokenCategory.KEYWORD, AntlrGlslLexer.KW_DISCARD));
        tokens.add(new GlslTokenId("return", TokenCategory.KEYWORD, AntlrGlslLexer.KW_RETURN));
        tokens.add(new GlslTokenId("struct", TokenCategory.KEYWORD, AntlrGlslLexer.KW_STRUCT));
        tokens.add(new GlslTokenId("void", TokenCategory.KEYWORD, AntlrGlslLexer.KW_VOID));
        //literals
        tokens.add(new GlslTokenId("bool literal", TokenCategory.KEYWORD, AntlrGlslLexer.BOOL_LITERAL));
        tokens.add(new GlslTokenId("int literal", TokenCategory.NUMBER, AntlrGlslLexer.INT_LITERAL));
        tokens.add(new GlslTokenId("float literal", TokenCategory.NUMBER, AntlrGlslLexer.FLOAT_LITERAL));
        //operators
        tokens.add(new GlslTokenId("*", TokenCategory.OPERATOR, AntlrGlslLexer.OP_MUL));
        tokens.add(new GlslTokenId("+", TokenCategory.OPERATOR, AntlrGlslLexer.OP_ADD));
        tokens.add(new GlslTokenId("-", TokenCategory.OPERATOR, AntlrGlslLexer.OP_SUB));
        tokens.add(new GlslTokenId("/", TokenCategory.OPERATOR, AntlrGlslLexer.OP_DIV));
        tokens.add(new GlslTokenId("%", TokenCategory.OPERATOR, AntlrGlslLexer.OP_MOD));
        tokens.add(new GlslTokenId("++", TokenCategory.OPERATOR, AntlrGlslLexer.OP_INC));
        tokens.add(new GlslTokenId("--", TokenCategory.OPERATOR, AntlrGlslLexer.OP_DEC));
        tokens.add(new GlslTokenId("shift operator", TokenCategory.OPERATOR, AntlrGlslLexer.OP_SHIFT));
        tokens.add(new GlslTokenId("relational operator", TokenCategory.OPERATOR, AntlrGlslLexer.OP_RELATIONAL));
        tokens.add(new GlslTokenId("bit operator", TokenCategory.OPERATOR, AntlrGlslLexer.OP_BIT));
        tokens.add(new GlslTokenId("~", TokenCategory.OPERATOR, AntlrGlslLexer.OP_BIT_UNARY));
        tokens.add(new GlslTokenId("logical operator", TokenCategory.OPERATOR, AntlrGlslLexer.OP_LOGICAL));
        tokens.add(new GlslTokenId("!", TokenCategory.OPERATOR, AntlrGlslLexer.OP_LOGICAL_UNARY));
        tokens.add(new GlslTokenId("modify operator", TokenCategory.OPERATOR, AntlrGlslLexer.OP_MODIFY));
        tokens.add(new GlslTokenId("=", TokenCategory.OPERATOR, AntlrGlslLexer.OP_ASSIGN));
        //comments
        tokens.add(new GlslTokenId("single line comment", TokenCategory.COMMENT, AntlrGlslLexer.SINGLE_LINE_COMMENT));
        tokens.add(new GlslTokenId("multi line comment", TokenCategory.COMMENT, AntlrGlslLexer.MULTI_LINE_COMMENT));
        //whitespaces
        tokens.add(new GlslTokenId("new line", TokenCategory.WHITESPACE, AntlrGlslLexer.NEW_LINE));
        tokens.add(new GlslTokenId("space", TokenCategory.WHITESPACE, AntlrGlslLexer.SPACE));
        tokens.add(new GlslTokenId("tab", TokenCategory.WHITESPACE, AntlrGlslLexer.TAB));
        //default
        tokens.add(new GlslTokenId(".", TokenCategory.DEFAULT, AntlrGlslLexer.DOT));
        tokens.add(new GlslTokenId(",", TokenCategory.DEFAULT, AntlrGlslLexer.COMMA));
        tokens.add(new GlslTokenId(":", TokenCategory.DEFAULT, AntlrGlslLexer.COLON));
        tokens.add(new GlslTokenId(";", TokenCategory.DEFAULT, AntlrGlslLexer.SEMICOLON));
        tokens.add(new GlslTokenId("?", TokenCategory.DEFAULT, AntlrGlslLexer.QUESTION));
        tokens.add(new GlslTokenId("(", TokenCategory.DEFAULT, AntlrGlslLexer.LRB));
        tokens.add(new GlslTokenId(")", TokenCategory.DEFAULT, AntlrGlslLexer.RRB));
        tokens.add(new GlslTokenId("{", TokenCategory.DEFAULT, AntlrGlslLexer.LCB));
        tokens.add(new GlslTokenId("}", TokenCategory.DEFAULT, AntlrGlslLexer.RCB));
        tokens.add(new GlslTokenId("[", TokenCategory.DEFAULT, AntlrGlslLexer.LSB));
        tokens.add(new GlslTokenId("]", TokenCategory.DEFAULT, AntlrGlslLexer.RSB));

        return tokens;
    }

    public static synchronized GlslTokenId getToken(int id) {
        return ID_TOKEN_MAP.get(id);
    }

    @Override
    protected Collection<GlslTokenId> createTokenIds() {
        return TOKENS;
    }

    @Override
    protected Lexer<GlslTokenId> createLexer(LexerRestartInfo<GlslTokenId> lri) {
        return new GlslLexer(lri);
    }

    @Override
    protected String mimeType() {
        return "text/x-glsl";
    }

}
