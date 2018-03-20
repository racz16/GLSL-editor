package hu.racz.zalan.glsleditor.syntaxhighlighting;

import hu.racz.zalan.glsleditor.antlr.*;
import hu.racz.zalan.glsleditor.antlr.generated.*;
import org.antlr.v4.runtime.*;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.*;

public class GlslLexer implements Lexer<GlslTokenId> {

    private LexerRestartInfo<GlslTokenId> info;

    private GLSLLexer glslLexer;

    public GlslLexer(LexerRestartInfo<GlslTokenId> info) {
        this.info = info;
        AntlrCharStream acs2 = new AntlrCharStream(info.input(), "GLSL Editor");
        glslLexer = new GLSLLexer(acs2);
    }

    @Override
    public org.netbeans.api.lexer.Token<GlslTokenId> nextToken() {
        Token token = glslLexer.nextToken();
        org.netbeans.api.lexer.Token<GlslTokenId> createdToken = null;
        if (token.getType() != -1) {
            GlslTokenId tokenId = GlslLanguageHierarchy.getToken(token.getType());
            createdToken = info.tokenFactory().createToken(tokenId);
        } else if (info.input().readLength() > 0) {
            GlslTokenId tokenId = GlslLanguageHierarchy.getToken(GLSLLexer.SPACE);
            createdToken = info.tokenFactory().createToken(tokenId);
        }

        return createdToken;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {

    }

}
