package hu.racz.zalan.editor.indentation;

import javax.swing.text.*;
import org.netbeans.modules.editor.indent.spi.*;

public class GlslIndentTask implements IndentTask {

    private final Context context;

    private String text;
    private int cursorPosition;

    private int depth;
    private boolean nonSpaceTabAfterCursor;
    private boolean rightBraceAfterCursor;
    private int spaceTabCountAfterCursor;

    public GlslIndentTask(Context context) {
        this.context = context;
    }

    @Override
    public void reindent() throws BadLocationException {
        cursorPosition = context.startOffset();
        text = context.document().getText(0, context.document().getLength());
        computeDepth();
        String indentation = computeIndentation();
        context.document().insertString(context.startOffset(), indentation, null);
    }

    private void computeDepth() {
        for (int i = 0; i < text.length() && !nonSpaceTabAfterCursor; i++) {
            computeCharacterImpact(text.charAt(i), i);
        }
        if (rightBraceAfterCursor) {
            depth -= spaceTabCountAfterCursor;
        }
    }

    private void computeCharacterImpact(char character, int index) {
        if (index < cursorPosition) {
            computeCharacterImpactBeforeCursor(character);
        } else {
            computeCharacterImpactAfterCursor(character);
        }
    }

    private void computeCharacterImpactAfterCursor(char character) {
        computeSpaceTabImpactAfterCursor(character);
        if (character != ' ' && character != '\t') {
            nonSpaceTabAfterCursor = true;
            if (character == '}') {
                computeRightBraceImpactAfterCursor();
            }
        }
    }

    private void computeCharacterImpactBeforeCursor(char character) {
        if (character == '{') {
            depth += 4;
        } else if (character == '}') {
            depth -= 4;
        }
    }

    private void computeSpaceTabImpactAfterCursor(char character) {
        if (character == ' ') {
            spaceTabCountAfterCursor += 1;
        } else if (character == '\t') {
            spaceTabCountAfterCursor += 4;
        }
    }

    private void computeRightBraceImpactAfterCursor() {
        rightBraceAfterCursor = true;
        depth -= 4;
    }

    private String computeIndentation() {
        if (depth < 0) {
            return "";
        } else {
            return computeIndentationWithoutInspection();
        }
    }

    private String computeIndentationWithoutInspection() {
        String indentation = "";
        for (int i = 0; i < depth; i++) {
            indentation += " ";
        }
        return indentation;
    }

    @Override
    public ExtraLock indentLock() {
        return null;
    }
}
