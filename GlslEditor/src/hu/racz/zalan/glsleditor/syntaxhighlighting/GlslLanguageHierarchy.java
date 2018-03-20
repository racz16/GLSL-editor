package hu.racz.zalan.glsleditor.syntaxhighlighting;

import java.util.*;
import org.netbeans.spi.lexer.*;

public class GlslLanguageHierarchy extends LanguageHierarchy<GlslTokenId> {

    private static List<GlslTokenId> tokens = new ArrayList<>();
    private static Map<Integer, GlslTokenId> idToToken = new HashMap<Integer, GlslTokenId>();

    static {
        GlslTokenType[] tokenTypes = GlslTokenType.values();
        for (GlslTokenType tokenType : tokenTypes) {
            tokens.add(new GlslTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (GlslTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized GlslTokenId getToken(int id) {
        return idToToken.get(id);
    }

    @Override
    protected Collection<GlslTokenId> createTokenIds() {
        return tokens;
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
