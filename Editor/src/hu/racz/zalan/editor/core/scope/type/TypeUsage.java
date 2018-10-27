package hu.racz.zalan.editor.core.scope.type;

import hu.racz.zalan.editor.core.scope.*;

public class TypeUsage extends Element {

    public static final int ARRAY_SIZE_UNDEFINED = -1;
    public static final int ARRAY_SIZE_DONT_CARE = 0;

    private TypeDeclaration declaration;
    private Qualifier qualifier;
    private boolean array;
    private int arraySize;

    public static final TypeUsage ERROR_TYPE = new TypeUsage("");

    public TypeUsage(String name) {
        setName(name);
    }

    public TypeUsage(String name, boolean array, int arraySize) {
        this(name);
        setArray(array);
        setArraySize(arraySize);
    }

    public TypeDeclaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(TypeDeclaration declaration) {
        this.declaration = declaration;
    }

    public boolean isVoid() {
        return getName().equals("void");
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public Qualifier getQualifier() {
        return qualifier;
    }

    public void setQualifier(Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    @Override
    public boolean equals(Object obj) {
        TypeUsage tu = (TypeUsage) obj;
        return getName().equals(tu.getName()) && isArray() == tu.isArray()
                && getArraySize() == tu.getArraySize() && getQualifier() == tu.getQualifier();
    }

    public String toStringWithQualifier() {
        String qualStr = qualifier != null ? qualifier + " " : "";
        return qualStr + toString();
    }

    @Override
    public String toString() {
        return getName() + (array ? "[]" : "");
    }

}
