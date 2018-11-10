package hu.racz.zalan.editor.core.scope;

public abstract class Element {

    private int nameStartIndex = 0;
    private int nameStopIndex = 0;
    private String name = "";

    public Element() {
    }

    public Element(String name) {
        setName(name);
    }

    public int getNameStartIndex() {
        return nameStartIndex;
    }

    public void setNameStartIndex(int startIndex) {
        this.nameStartIndex = startIndex;
    }

    public int getNameStopIndex() {
        return nameStopIndex;
    }

    public void setNameStopIndex(int stopIndex) {
        this.nameStopIndex = stopIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        Element kw = (Element) obj;
        return getName().equals(kw.getName());
    }

    @Override
    public String toString() {
        return getName();
    }

}
