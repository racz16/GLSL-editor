package hu.racz.zalan.editor.indentation;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import javax.swing.text.*;
import org.netbeans.modules.editor.indent.api.*;
import org.netbeans.modules.editor.indent.spi.*;
import static hu.racz.zalan.editor.core.Constants.*;

public class GlslIndentTask implements IndentTask {

    private final Context context;

    private String text;
    private int caretPosition;

    private int depth;
    private boolean nonSpaceTabAfterCursor;
    private boolean rightBraceAfterCursor;
    private int spaceTabCountAfterCursor;
    private int spaceTabCountBeforeCursor;
    private boolean newBlock;

    private int indentLevelSize;
    private int tabSize;
    private boolean expandTabs;

    public GlslIndentTask(Context context) {
        this.context = context;
    }

    @Override
    public void reindent() throws BadLocationException {
        initialize();
        determineNewBlock();
        computeDepth();
        applyIndentation();
    }

    private void initialize() throws BadLocationException {
        caretPosition = context.startOffset();
        text = context.document().getText(0, context.document().getLength());
        indentLevelSize = IndentUtils.indentLevelSize(context.document());
        tabSize = IndentUtils.tabSize(context.document());
        expandTabs = IndentUtils.isExpandTabs(context.document());
    }

    private void determineNewBlock() {
        newBlock = isCharacterInPosition(caretPosition, RCB) && lastCharactersLeftCurlyBraceNewLine();
    }

    private boolean lastCharactersLeftCurlyBraceNewLine() {
        if (isCharacterInPosition(caretPosition - 1, LF) && isCharacterInPosition(caretPosition - 2, LCB)) {
            return true;
        }
        if (isCharacterInPosition(caretPosition - 1, LF) && isCharacterInPosition(caretPosition - 2, CR) && isCharacterInPosition(caretPosition - 3, LCB)) {
            return true;
        }
        return false;
    }

    private boolean isCharacterInPosition(int index, char c) {
        return index >= 0 && index < text.length() && text.charAt(index) == c;
    }

    private void computeDepth() {
        for (int i = 0; i < text.length() && !nonSpaceTabAfterCursor; i++) {
            computeCharacterImpact(text.charAt(i), i);
        }
        computeSpaceTabImpactBeforeCursor();
        correctDepth();
    }

    private void correctDepth() {
        depth += computeBracelessScopeCorrection();
        depth -= spaceTabCountBeforeCursor;
        if (rightBraceAfterCursor) {
            depth -= spaceTabCountAfterCursor;
        }
    }

    private int computeBracelessScopeCorrection() {
        int result = 0;
        for (Scope bs : Scope.getBracelessScopes()) {
            if (bs.getStartIndex() <= caretPosition + 1 && bs.getStopIndex() >= caretPosition) {
                result += indentLevelSize;
            }
        }
        return result;
    }

    private void computeCharacterImpact(char character, int index) {
        if (index < caretPosition) {
            computeCharacterImpactBeforeCursor(character);
        } else {
            computeCharacterImpactAfterCursor(character);
        }
    }

    private void computeCharacterImpactBeforeCursor(char character) {
        if (character == LCB) {
            depth += indentLevelSize;
        } else if (character == RCB) {
            depth -= indentLevelSize;
        }
    }

    private void computeCharacterImpactAfterCursor(char character) {
        computeSpaceTabImpactAfterCursor(character);
        if (character != SPACE && character != TAB) {
            nonSpaceTabAfterCursor = true;
            if (character == RCB) {
                computeRightBraceImpactAfterCursor();
            }
        }
    }

    private void computeSpaceTabImpactAfterCursor(char character) {
        if (character == SPACE) {
            spaceTabCountAfterCursor += 1;
        } else if (character == TAB) {
            spaceTabCountAfterCursor += tabSize;
        }
    }

    private void computeRightBraceImpactAfterCursor() {
        rightBraceAfterCursor = true;
        depth -= indentLevelSize;
    }

    private void computeSpaceTabImpactBeforeCursor() {
        for (int i = context.caretOffset() - 1; i > 1; i--) {
            char character = text.charAt(i);
            computeSpaceTabImpactBeforeCursor(character);
            if (character != SPACE && character != TAB) {
                break;
            }
        }
    }

    private void computeSpaceTabImpactBeforeCursor(char character) {
        if (character != LF && character != CR) {
            computeSpaceTabImpactBeforeCursorUnsafe(character);
        }
    }

    private void computeSpaceTabImpactBeforeCursorUnsafe(char character) {
        if (character == SPACE) {
            spaceTabCountBeforeCursor++;
        } else if (character == TAB) {
            spaceTabCountBeforeCursor += tabSize;
        } else {
            spaceTabCountBeforeCursor = 0;
        }
    }

    private void applyIndentation() throws BadLocationException {
        String before = computeIndentationBeforeCursor();
        context.document().insertString(caretPosition, before, null);
        if (newBlock) {
            String after = System.lineSeparator() + IndentUtils.createIndentString(depth, expandTabs, tabSize);
            context.document().insertString(context.startOffset(), after, null);
            Utility.setCaretPositionInAwtThread(context.document(), caretPosition + before.length());
        }
    }

    private String computeIndentationBeforeCursor() {
        if (depth < 0) {
            return "";
        } else {
            return computeIndentationBeforeCursorUnsafe();
        }
    }

    private String computeIndentationBeforeCursorUnsafe() {
        String indentation = IndentUtils.createIndentString(depth, expandTabs, tabSize);
        if (newBlock) {
            indentation += IndentUtils.createIndentString(indentLevelSize, expandTabs, tabSize);
        }
        return indentation;
    }

    @Override
    public ExtraLock indentLock() {
        return null;
    }
}
