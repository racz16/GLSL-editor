package hu.racz.zalan.glsleditor.codefolding;

import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.spi.editor.fold.*;

@MimeRegistration(mimeType = "text/x-glsl", service = FoldManagerFactory.class)
public class GlslFoldManagerFactory implements FoldManagerFactory {

    @Override
    public FoldManager createFoldManager() {
        return new GlslFoldManager();
    }

}
