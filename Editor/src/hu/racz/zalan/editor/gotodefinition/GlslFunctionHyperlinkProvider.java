package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;
import static hu.racz.zalan.editor.core.Constants.*;
import java.util.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = HyperlinkProvider.class)
public class GlslFunctionHyperlinkProvider extends GlslHyperlinkProviderBase<FunctionPrototype> {

    @Override
    protected List<? extends FunctionPrototype> getUsages(Scope scope) {
        return Scope.getFunctionPrototypes();
    }

    @Override
    protected boolean hasModel(FunctionPrototype usage) {
        return usage.getDefinition() != null;
    }

    @Override
    protected int getTargetPosition() {
        return usage.getDefinition().getNameStartIndex();
    }

}
