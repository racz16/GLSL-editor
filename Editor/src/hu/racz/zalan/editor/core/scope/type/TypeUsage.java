package hu.racz.zalan.editor.core.scope.type;

import hu.racz.zalan.editor.core.scope.*;

public class TypeUsage extends Element {

    public static final TypeUsage VOID;

    private TypeDeclaration declaration;

    static {
        VOID = new TypeUsage("void");
    }

    public TypeUsage(String name) {
        setName(name);
    }

    public TypeDeclaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(TypeDeclaration declaration) {
        this.declaration = declaration;
    }

}
