package hu.racz.zalan.editor.errordisplay;

import java.util.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.modules.parsing.api.*;
import org.netbeans.modules.parsing.spi.*;
import static hu.racz.zalan.editor.core.Constants.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = TaskFactory.class)
public class GlslSyntaxErrorHighlightingTaskFactory extends TaskFactory {

    @Override
    public Collection<SyntaxErrorsHighlightingTask> create(Snapshot snapshot) {
        return Collections.singleton(new SyntaxErrorsHighlightingTask());
    }

}
