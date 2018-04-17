package hu.racz.zalan.editor.newfile;

import java.io.*;
import org.openide.awt.*;
import org.openide.filesystems.*;
import org.openide.loaders.*;
import org.openide.util.NbBundle.Messages;

@Messages({
    "LBL_Glsl_LOADER=Files of Glsl"
})
@MIMEResolver.ExtensionRegistration(
        displayName = "#LBL_Glsl_LOADER",
        mimeType = "text/x-glsl",
        extension = {"glsl", "GLSL"}
)
@DataObject.Registration(
        mimeType = "text/x-glsl",
        iconBase = "hu/racz/zalan/editor/newfile/logo.png",
        displayName = "#LBL_Glsl_LOADER",
        position = 300
)
@ActionReferences({
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.OpenAction"),
            position = 100,
            separatorAfter = 200
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "Edit", id = "org.openide.actions.CutAction"),
            position = 300
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "Edit", id = "org.openide.actions.CopyAction"),
            position = 400,
            separatorAfter = 500
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "Edit", id = "org.openide.actions.DeleteAction"),
            position = 600
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.RenameAction"),
            position = 700,
            separatorAfter = 800
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.SaveAsTemplateAction"),
            position = 900,
            separatorAfter = 1000
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.FileSystemAction"),
            position = 1100,
            separatorAfter = 1200
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.ToolsAction"),
            position = 1300
    ),
    @ActionReference(
            path = "Loaders/text/x-glsl/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.PropertiesAction"),
            position = 1400
    )
})
public class GlslDataObject extends MultiDataObject {

    public GlslDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-glsl", false);
    }

    @Override
    protected int associateLookup() {
        return 1;
    }

}
