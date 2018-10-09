package hu.racz.zalan.editor.errordisplay;

import java.util.*;
import org.antlr.v4.runtime.*;

public class GlslErrorListener extends BaseErrorListener {

    private final List<SyntaxError> syntaxErrors = new ArrayList<>();

    public List<SyntaxError> getSyntaxErrors() {
        return Collections.unmodifiableList(syntaxErrors);
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        syntaxErrors.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }

}
