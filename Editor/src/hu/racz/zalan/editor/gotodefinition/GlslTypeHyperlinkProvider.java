package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;

@MimeRegistration(mimeType = "text/x-glsl", service = HyperlinkProvider.class)
public class GlslTypeHyperlinkProvider implements HyperlinkProvider {

    private TypeUsage usage;

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
        for (TypeUsage tu : scope.getTypeUsages()) {
            if (tu.getNameStartIndex() <= caretPosition && tu.getNameStopIndex() >= caretPosition && tu.getDeclaration() != null && !tu.getDeclaration().isBuiltIn()) {
                usage = tu;
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] getHyperlinkSpan(Document document, int caretPosition) {
        if (verifyState(caretPosition)) {
            return new int[]{usage.getNameStartIndex(), usage.getNameStopIndex()};
        } else {
            return null;
        }
    }

    @Override
    public void performClickAction(Document document, int caretPosition) {
        if (verifyState(caretPosition)) {
            Utility.setCaretPosition(document, usage.getDeclaration().getNameStartIndex());
        }
    }

}
