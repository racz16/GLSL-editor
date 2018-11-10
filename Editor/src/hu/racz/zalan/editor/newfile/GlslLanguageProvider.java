package hu.racz.zalan.editor.newfile;

import hu.racz.zalan.editor.syntaxhighlighting.*;
import org.netbeans.api.lexer.*;
import org.netbeans.spi.lexer.*;
import static hu.racz.zalan.editor.core.Constants.*;

@org.openide.util.lookup.ServiceProvider(service = LanguageProvider.class)
public class GlslLanguageProvider extends LanguageProvider {

    @Override
    public Language<?> findLanguage(String mimeType) {
        if (GLSL_MIME_TYPE.equals(mimeType)) {
            return new GlslLanguageHierarchy().language();
        }
        return null;
    }

    @Override
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath lp, InputAttributes ia) {
        return null;
    }

}
