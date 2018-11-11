package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.Element;
import java.util.*;
import javax.swing.text.*;

import org.netbeans.lib.editor.hyperlink.spi.*;

public abstract class GlslHyperlinkProviderBase<T extends Element> implements HyperlinkProvider {

    protected T usage;

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
        for (T vu : getUsages(scope)) {
            if (vu.getNameStartIndex() <= caretPosition && vu.getNameStopIndex() >= caretPosition && hasModel(vu)) {
                usage = vu;
                return true;
            }
        }
        return false;
    }

    protected abstract List<? extends T> getUsages(Scope scope);

    protected abstract boolean hasModel(T usage);

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
            Utility.setCaretPosition(document, getTargetPosition());
        }
    }

    protected abstract int getTargetPosition();
}
