package hu.racz.zalan.editor.indentation;

import javax.swing.text.*;
import org.netbeans.modules.editor.indent.api.*;
import org.netbeans.modules.editor.indent.spi.*;

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

    private static final char CARRIGE_RETURN = '\r';
    private static final char LINE_FEED = '\n';
    private static final char TAB = '\t';
    private static final char SPACE = ' ';
    private static final char LCB = '{';
    private static final char RCB = '}';

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
        if (isCharacterInPosition(caretPosition - 1, LINE_FEED) && isCharacterInPosition(caretPosition - 2, LCB)) {
            return true;
        }
        if (isCharacterInPosition(caretPosition - 1, LINE_FEED) && isCharacterInPosition(caretPosition - 2, CARRIGE_RETURN) && isCharacterInPosition(caretPosition - 3, LCB)) {
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
        depth -= spaceTabCountBeforeCursor;
        if (rightBraceAfterCursor) {
            depth -= spaceTabCountAfterCursor;
        }
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
        if (character != LINE_FEED && character != CARRIGE_RETURN) {
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
            context.document().insertString(context.startOffset() + 1, after + RCB, null);
            //ez egy hack, mivel a context.setCaretOffset(...) nem működik
            //ha az aftert közvetlen a kurzorhoz szúrnám be (ahogy a before-t), akkor eltolná a kurzort
            //így a kurzor nem a blokk belsejében lenne, hanem egy sorral lentebb, a '}' mellett
            //a megoldás az, hogy egy karakterrel később, a '}' után szúrum be az indentációt és egy plusz '}' karaktert
            //majd a végén az eredeti, már fölösleges '}' karaktert törlöm
            //ezzel elérem, hogy a kurzot a blokk közepén maradjon
            context.document().remove(context.startOffset(), 1);
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
