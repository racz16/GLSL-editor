package hu.racz.zalan.editor.indentation;

import javax.swing.text.*;
import org.netbeans.modules.editor.indent.api.*;
import org.netbeans.modules.editor.indent.spi.*;

public class GlslIndentTask implements IndentTask {

    private final Context context;

    private String text;
    private int cursorPosition;

    private int depth;
    private boolean nonSpaceTabAfterCursor;
    private boolean rightBraceAfterCursor;
    private int spaceTabCountAfterCursor;

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
	String indentation = computeIndentation();
	context.document().insertString(context.startOffset(), indentation, null);
    }

    private void initialize() throws BadLocationException {
	cursorPosition = context.startOffset();
	text = context.document().getText(0, context.document().getLength());
	indentLevelSize = IndentUtils.indentLevelSize(context.document());
	tabSize = IndentUtils.tabSize(context.document());
	expandTabs = IndentUtils.isExpandTabs(context.document());
    }

    private void determineNewBlock() {
	newBlock = isCharacterInPosition(cursorPosition, '}') && lastCharactersLeftCurlyBraceNewLine();
    }

    private boolean lastCharactersLeftCurlyBraceNewLine() {
	if (isCharacterInPosition(cursorPosition - 1, '\n') && isCharacterInPosition(cursorPosition - 2, '{')) {
	    return true;
	}
	if (isCharacterInPosition(cursorPosition - 1, '\n') && isCharacterInPosition(cursorPosition - 2, '\r') && isCharacterInPosition(cursorPosition - 3, '{')) {
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

    private void computeCharacterImpactBeforeCursor(char character) {
	if (character == '{') {
	    depth += indentLevelSize;
	} else if (character == '}') {
	    depth -= indentLevelSize;
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

    private void computeSpaceTabImpactAfterCursor(char character) {
	if (character == ' ') {
	    spaceTabCountAfterCursor += 1;
	} else if (character == '\t') {
	    spaceTabCountAfterCursor += tabSize;
	}
    }

    private void computeRightBraceImpactAfterCursor() {
	rightBraceAfterCursor = true;
	depth -= indentLevelSize;
    }

    private String computeIndentation() {
	if (depth < 0) {
	    return "";
	} else {
	    return computeIndentationWithoutInspection();
	}
    }

    private String computeIndentationWithoutInspection() {
	String indentation = computeIndentationString(depth);
	if (newBlock) {
	    indentation += computeIndentationString(indentLevelSize)
		    + System.lineSeparator()
		    + computeIndentationString(depth);
	}
	return indentation;
    }

    private String computeIndentationString(int depth) {
	if (expandTabs) {
	    return computeIndentationStringWithSpaces(depth);
	} else {
	    return computeIndentationStringWithTabs(depth);
	}
    }

    private String computeIndentationStringWithTabs(int depth) {
	String indentation = "";
	while (depth >= tabSize) {
	    indentation += "\t";
	    depth -= tabSize;
	}
	indentation += computeIndentationStringWithSpaces(depth);
	return indentation;
    }

    private String computeIndentationStringWithSpaces(int depth) {
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
