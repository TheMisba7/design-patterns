package comopsite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private final List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tab() + "+ " + name);
        for (Component child: children) {
            child.print();
        }
    }

    public void add(Component child) {
        child.level = this.level + 1;
        children.add(child);
    }
}
