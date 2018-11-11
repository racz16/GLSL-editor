package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;
import static hu.racz.zalan.editor.core.Constants.*;
import java.util.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = HyperlinkProvider.class)
public class GlslTypeHyperlinkProvider extends GlslHyperlinkProviderBase<TypeUsage> {

    @Override
    protected List<? extends TypeUsage> getUsages(Scope scope) {
        return scope.getTypeUsages();
    }

    @Override
    protected boolean hasModel(TypeUsage usage) {
        return usage.getDeclaration() != null;
    }

    @Override
    protected int getTargetPosition() {
        return usage.getDeclaration().getNameStartIndex();
    }

}
