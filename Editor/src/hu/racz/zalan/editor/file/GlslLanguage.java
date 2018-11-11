package hu.racz.zalan.editor.file;

import static hu.racz.zalan.editor.core.Constants.*;
import hu.racz.zalan.editor.syntaxhighlighting.*;
import org.netbeans.api.lexer.*;
import org.netbeans.modules.csl.spi.*;

@LanguageRegistration(mimeType = GLSL_MIME_TYPE)
public class GlslLanguage extends DefaultLanguageConfig {

    @Override
    public Language<GlslTokenId> getLexerLanguage() {
        return GlslTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return GLSL;
    }
}
