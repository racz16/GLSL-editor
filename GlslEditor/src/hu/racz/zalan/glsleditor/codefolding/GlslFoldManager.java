package hu.racz.zalan.glsleditor.codefolding;

import hu.racz.zalan.glsleditor.syntaxhighlighting.*;
import javax.swing.event.*;
import javax.swing.text.*;
import org.netbeans.api.editor.fold.*;
import org.netbeans.api.lexer.*;
import org.netbeans.spi.editor.fold.*;
import org.openide.util.*;

public class GlslFoldManager implements FoldManager {

    private FoldOperation operation;
    public static final FoldType COMMENT_FOLD_TYPE = FoldType.COMMENT;

    @Override
    public void init(FoldOperation operation) {
        this.operation = operation;
    }

    @Override
    public void initFolds(FoldHierarchyTransaction transaction) {
        FoldHierarchy hierarchy = operation.getHierarchy();
        Document document = hierarchy.getComponent().getDocument();
        TokenHierarchy<Document> hi = TokenHierarchy.get(document);
        TokenSequence<GlslTokenId> ts = (TokenSequence<GlslTokenId>) hi.tokenSequence();
        FoldType type = null;
        int start = 0;
        int offset = 0;
        while (ts.moveNext()) {
            offset = ts.offset();
            Token<GlslTokenId> token = ts.token();
            GlslTokenId id = token.id();
            if (id.name().equals("MULTI_LINE_COMMENT") && type == null) {
                type = COMMENT_FOLD_TYPE;
                start = offset;
                try {
                    operation.addToHierarchy(
                            type,
                            type.toString(),
                            false,
                            start,
                            offset + token.length(),
                            0,
                            0,
                            hierarchy,
                            transaction);
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
    }

    @Override
    public void removeUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
    }

    @Override
    public void changedUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
    }

    @Override
    public void removeEmptyNotify(Fold fold) {
    }

    @Override
    public void removeDamagedNotify(Fold fold) {
    }

    @Override
    public void expandNotify(Fold fold) {
    }

    @Override
    public void release() {
    }
}
