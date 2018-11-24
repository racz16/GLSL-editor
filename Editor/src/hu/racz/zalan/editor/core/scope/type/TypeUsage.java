package hu.racz.zalan.editor.core.scope.type;

import hu.racz.zalan.editor.core.scope.qualifier.QualifierUsage;
import hu.racz.zalan.editor.core.scope.qualifier.Qualifier;
import hu.racz.zalan.editor.core.scope.*;
import java.util.*;

public class TypeUsage extends Element {

    private TypeDeclaration declaration;
    private final List<QualifierUsage> qualifiers = new ArrayList<>();
    private final List<Qualifier> implicitQualifiers = new ArrayList<>();
    private int arrayDepth;

    public static final TypeUsage ERROR_TYPE = new TypeUsage("");

    public TypeUsage(String name) {
        super(name);
    }

    public TypeUsage(String name, int arrayDepth) {
        this(name);
        setArrayDepth(arrayDepth);
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
        return arrayDepth > 0;
    }

    public int getArrayDepth() {
        return arrayDepth;
    }

    public void setArrayDepth(int arrayDepth) {
        this.arrayDepth = arrayDepth;
    }

    //
    //qualifiers----------------------------------------------------------------
    //
    public void addQualifier(QualifierUsage qualifier) {
        qualifiers.add(qualifier);
    }

    public List<QualifierUsage> getQualifiers() {
        return Collections.unmodifiableList(qualifiers);
    }

    public void addImplicitQualifier(Qualifier qualifier) {
        implicitQualifiers.add(qualifier);
    }

    public List<Qualifier> getImplicitQualifiers() {
        return Collections.unmodifiableList(implicitQualifiers);
    }

    @Override
    public boolean equals(Object obj) {
        TypeUsage tu = (TypeUsage) obj;
        return getArrayDepth() == tu.getArrayDepth()
                && qualifiersEquals(tu)
                && getDeclaration().equals(tu.getDeclaration());
    }

    public boolean qualifiersEquals(TypeUsage tu) {
        for (QualifierUsage q : getQualifiers()) {
            if (!tu.getQualifiers().contains(q) && !tu.getImplicitQualifiers().contains(q.getQualifier())) {
                return false;
            }
        }
        for (Qualifier q : getImplicitQualifiers()) {
            if (!tu.containsQualifier(q) && !tu.getImplicitQualifiers().contains(q)) {
                return false;
            }
        }
        return getQualifiers().size() + getImplicitQualifiers().size() == tu.getQualifiers().size() + tu.getImplicitQualifiers().size();
    }

    private boolean containsQualifier(Qualifier q) {
        for (QualifierUsage qu : getQualifiers()) {
            if (qu.getQualifier().equals(q)) {
                return true;
            }
        }
        return false;
    }

    public String toStringWithQualifier() {
        String qualStr = "";
        for (int i = 0; i < getQualifiers().size(); i++) {
            qualStr += getQualifiers().get(i) + " ";
        }
        return qualStr + toString();
    }

    @Override
    public String toString() {
        return getName() + toStringArray();
    }

    private String toStringArray() {
        String ret = "";
        for (int i = 0; i < arrayDepth; i++) {
            ret += "[]";
        }
        return ret;
    }

}
