package hu.racz.zalan.editor.folding;

import static hu.racz.zalan.editor.core.Constants.GLSL_MIME_TYPE;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.spi.editor.fold.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = FoldManagerFactory.class)
public class GlslFoldManagerFactory implements FoldManagerFactory {

    @Override
    public FoldManager createFoldManager() {
        return new GlslFoldManager();
    }
}
