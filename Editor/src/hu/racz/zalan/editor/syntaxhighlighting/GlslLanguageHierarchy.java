package hu.racz.zalan.editor.syntaxhighlighting;

import java.util.*;
import org.netbeans.spi.lexer.*;

public class GlslLanguageHierarchy extends LanguageHierarchy<GlslTokenId> {

    private static final List<GlslTokenId> TOKENS = new ArrayList<>();
    private static final Map<Integer, GlslTokenId> ID_TOKEN_MAP = new HashMap<Integer, GlslTokenId>();

    static {
	GlslTokenType[] tokenTypes = GlslTokenType.values();
	for (GlslTokenType tokenType : tokenTypes) {
	    TOKENS.add(new GlslTokenId(tokenType.name(), tokenType.getCategory(), tokenType.getId()));
	}
	for (GlslTokenId token : TOKENS) {
	    ID_TOKEN_MAP.put(token.ordinal(), token);
	}
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
