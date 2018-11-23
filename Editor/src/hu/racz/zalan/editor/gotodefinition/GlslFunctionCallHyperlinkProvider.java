package hu.racz.zalan.editor.gotodefinition;

import static hu.racz.zalan.editor.core.Constants.GLSL_MIME_TYPE;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import java.util.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = HyperlinkProvider.class)
public class GlslFunctionCallHyperlinkProvider extends GlslHyperlinkProviderBase<FunctionCall> {

    @Override
    protected List<? extends FunctionCall> getUsages(Scope scope) {
        return scope.getFunctionCalls();
    }

    @Override
    protected boolean hasModel(FunctionCall usage) {
        return usage.getFunction() != null && usage.getFunction().getDefinition() != null;
    }

    @Override
    protected int getTargetPosition() {
        return usage.getFunction().getDefinition().getNameStartIndex();
    }
}
