package hu.racz.zalan.editor.indentation;

import javax.swing.text.*;
import org.netbeans.modules.editor.indent.spi.*;

public class GlslIndentTask implements IndentTask {

    private final Context context;

    public GlslIndentTask(Context context) {
        this.context = context;
    }

    @Override
    public void reindent() throws BadLocationException {
        String textBeforeCursor = context.document().getText(0, context.startOffset());
        int depth = computeDepth(textBeforeCursor);
        String indentation = computeIndentation(depth);
        context.document().insertString(context.startOffset(), indentation, null);
    }

    private int computeDepth(String text) {
        int startedBlockCount = 0;
        for (int i = 0; i < text.length(); i++) {
            startedBlockCount += computeCharacterImpact(text.charAt(i));
        }
        return startedBlockCount;
    }

    private int computeCharacterImpact(char character) {
        if (character == '{') {
            return 1;
        } else if (character == '}') {
            return -1;
        } else {
            return 0;
        }
    }

    private String computeIndentation(int depth) {
        if (depth < 0) {
            return "";
        } else {
            return computeIndentationWithoutInspection(depth);
        }
    }

    private String computeIndentationWithoutInspection(int depth) {
        String indentation = "";
        for (int i = 0; i < depth; i++) {
            indentation += "    ";
        }
        return indentation;
    }

    @Override
    public ExtraLock indentLock() {
        return null;
    }
}
