package hu.racz.zalan.editor.errordisplay;

import java.util.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.modules.parsing.api.*;
import org.netbeans.modules.parsing.spi.*;

@MimeRegistration(mimeType = "text/x-glsl", service = TaskFactory.class)
public class GlslSyntaxErrorHighlightingTaskFactory extends TaskFactory {

    @Override
    public Collection create(Snapshot snapshot) {
        return Collections.singleton(new SyntaxErrorsHighlightingTask());
    }

}
