package hu.racz.zalan.editor.syntaxhighlighting;

import hu.racz.zalan.editor.antlr.*;
import hu.racz.zalan.editor.antlr.generated.*;
import org.antlr.v4.runtime.*;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.*;

public class GlslLexer implements Lexer<GlslTokenId> {

    private final LexerRestartInfo<GlslTokenId> info;
    private final GLSLLexer glslLexer;
    private final AntlrCharStream acs;

    public GlslLexer(LexerRestartInfo<GlslTokenId> info) {
        this.info = info;
        acs = new AntlrCharStream(info.input(), "GLSL Editor");
        glslLexer = new GLSLLexer(acs);
    }

    @Override
    public org.netbeans.api.lexer.Token<GlslTokenId> nextToken() {
//        int index = acs.index();
//        if (index > 5) {
//            for (int i = -4; i <= 0; i++) {
//                System.err.println((char) acs.LA(i));
//            }
//        }

        Token token = glslLexer.nextToken();
        if (token.getType() != -1) {
            GlslTokenId tokenId = GlslLanguageHierarchy.getToken(token.getType());
            return info.tokenFactory().createToken(tokenId);
        } else if (info.input().readLength() > 0) {
            GlslTokenId tokenId = GlslLanguageHierarchy.getToken(GLSLLexer.SPACE);
            return info.tokenFactory().createToken(tokenId);
        } else {
            return null;
        }
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {

    }

}
