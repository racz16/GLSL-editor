package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;

@MimeRegistration(mimeType = "text/x-glsl", service = HyperlinkProvider.class)
public class GlslFunctionHyperlinkProvider implements HyperlinkProvider {

    private Function func;

    @Override
    public boolean isHyperlinkPoint(Document document, int caretPosition) {
        return verifyState(caretPosition);
    }

    public boolean verifyState(int caretPosition) {
        Scope scope = GlslProcessor.getRootScope();
        if (scope == null) {
            return false;
        }
        return verifyStateUnsafe(scope, caretPosition);
    }

    private boolean verifyStateUnsafe(Scope scope, int caretPosition) {
        for (Function fd : scope.getFunctionDefinitions()) {
            if (fd.getNameStartIndex() <= caretPosition && fd.getNameStopIndex() >= caretPosition && fd.getUsageCount() > 0) {
                func = fd;
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] getHyperlinkSpan(Document document, int caretPosition) {
        if (verifyState(caretPosition)) {
            return new int[]{func.getNameStartIndex(), func.getNameStopIndex()};
        } else {
            return null;
        }
    }

    @Override
    public void performClickAction(Document document, int caretPosition) {
        if (verifyState(caretPosition)) {
            Utility.setCaretPosition(document, func.getUsage(0).getNameStartIndex());
        }
    }

}
