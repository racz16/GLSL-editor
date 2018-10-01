package hu.racz.zalan.editor.indentation;

import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.modules.editor.indent.spi.*;

@MimeRegistration(mimeType = "text/x-glsl", service = IndentTask.Factory.class)
public class GlslIndentTaskFactory implements IndentTask.Factory {

    @Override
    public IndentTask createTask(Context context) {
        return new GlslIndentTask(context);
    }
}
