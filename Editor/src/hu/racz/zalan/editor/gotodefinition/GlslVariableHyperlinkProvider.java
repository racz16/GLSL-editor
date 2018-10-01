package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;

@MimeRegistration(mimeType = "text/x-glsl", service = HyperlinkProvider.class)
public class GlslVariableHyperlinkProvider implements HyperlinkProvider {

    private VariableUsage usage;

    @Override
    public boolean isHyperlinkPoint(Document document, int caretPosition) {
        return verifyState(caretPosition);
    }

    public boolean verifyState(int caretPosition) {
        Scope scope = GlslProcessor.getCaretScope(caretPosition);
        if (scope == null) {
            return false;
        }
        return verifyStateUnsafe(scope, caretPosition);
    }

    private boolean verifyStateUnsafe(Scope scope, int caretPosition) {
        for (VariableUsage vu : scope.getVariableUsages()) {
            if (vu.getStartIndex() <= caretPosition && vu.getStopIndex() >= caretPosition && vu.getDeclaration() != null) {
                usage = vu;
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] getHyperlinkSpan(Document document, int caretPosition) {
        if (verifyState(caretPosition)) {
            return new int[]{usage.getStartIndex(), usage.getStopIndex()};
        } else {
            return null;
        }
    }

    @Override
    public void performClickAction(Document document, int caretPosition) {
        if (verifyState(caretPosition)) {
            Utility.setCaretPosition(document, usage.getDeclaration().getStartIndex());
        }
    }

}
