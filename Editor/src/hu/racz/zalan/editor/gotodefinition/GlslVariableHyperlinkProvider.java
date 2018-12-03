package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;
import static hu.racz.zalan.editor.core.Constants.*;
import java.util.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = HyperlinkProvider.class)
public class GlslVariableHyperlinkProvider extends GlslHyperlinkProviderBase<VariableUsage> {

    @Override
    protected List<? extends VariableUsage> getUsages(Scope scope) {
        return scope.getVariableUsages();
    }

    @Override
    protected boolean hasModel(VariableUsage usage) {
        return usage.getDeclaration() != null && !usage.getDeclaration().isBuiltIn();
    }

    @Override
    protected int getTargetPosition() {
        return usage.getDeclaration().getNameStartIndex();
    }
}
