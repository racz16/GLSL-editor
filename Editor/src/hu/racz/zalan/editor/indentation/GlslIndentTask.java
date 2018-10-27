package hu.racz.zalan.editor.indentation;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import java.util.*;
import javax.swing.text.*;
import org.antlr.v4.runtime.*;
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
        GlslProcessor.setText(context.document().getText(0, context.document().getLength()));
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
        //depth += computeBracelessScopeCorrection();
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
        return result + compute();
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

    private int compute() {
        boolean foundRrb = false;
        int rbCount = 0;
        int ltibc = getLastTokenIndexBeforeCursor();
        List<? extends Token> tokens = GlslProcessor.getTokens();

        if (ltibc != -1) {
            for (int i = ltibc; i > 1; i--) {
                Token t = tokens.get(i);
                if (!foundRrb) {
                    if (t.getType() == AntlrGlslLexer.RRB) {
                        foundRrb = true;
                        rbCount++;
                    } else if (t.getType() != AntlrGlslLexer.NEW_LINE && t.getType() != AntlrGlslLexer.TAB && t.getType() != AntlrGlslLexer.SPACE) {
                        return 0;
                    }
                } else {
                    if (t.getType() == AntlrGlslLexer.LRB) {
                        rbCount--;
                    } else if (t.getType() == AntlrGlslLexer.RRB) {
                        rbCount++;
                    } else if (rbCount == 0) {
                        if (t.getType() == AntlrGlslLexer.KW_CASE || t.getType() == AntlrGlslLexer.KW_FOR || t.getType() == AntlrGlslLexer.KW_IF || t.getType() == AntlrGlslLexer.KW_WHILE) {
                            return indentLevelSize;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
        return 0;
    }

    private int getLastTokenIndexBeforeCursor() {
        List<? extends Token> tokens = GlslProcessor.getTokens();
        int result = -1;
        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i).getStopIndex() + 1 <= caretPosition) {
                result = i;
            } else if (tokens.get(i).getStartIndex() + 1 >= caretPosition) {
                return result;
            } else {
                return -1;
            }
        }
        return result;
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
