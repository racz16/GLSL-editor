package hu.racz.zalan.editor.core.scope.type;

import hu.racz.zalan.editor.core.scope.*;

public class TypeUsage extends Element {

    public static final TypeUsage VOID;

    private TypeDeclaration declaration;

    static {
        VOID = new TypeUsage();
        VOID.setName("void");
    }

    public TypeDeclaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(TypeDeclaration declaration) {
        this.declaration = declaration;
    }

    @Override
    public boolean equals(Object obj) {
        TypeUsage tu = (TypeUsage) obj;
        return getName().equals(tu.getName());
    }

}
