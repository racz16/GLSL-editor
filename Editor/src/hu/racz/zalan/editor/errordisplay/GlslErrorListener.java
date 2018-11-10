package hu.racz.zalan.editor.errordisplay;

import java.util.*;
import org.antlr.v4.runtime.*;

public class GlslErrorListener extends BaseErrorListener {

    private final List<GeneratedSyntaxError> syntaxErrors = new ArrayList<>();

    public List<GeneratedSyntaxError> getSyntaxErrors() {
        return Collections.unmodifiableList(syntaxErrors);
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        syntaxErrors.add(new GeneratedSyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }

}
