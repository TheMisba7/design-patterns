package comopsite;

public abstract class Component {
    protected int level = 0;
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void print();

    public String tab() {
        return "\t".repeat(level);
    }

}
