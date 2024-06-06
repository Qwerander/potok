import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<UchebnayaGroup> {
    private List<UchebnayaGroup> group;
    private String name;

    public Potok(List<UchebnayaGroup> group, String name) {
        this.group = group;
        this.name = name;
    }

    public List<UchebnayaGroup> getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<UchebnayaGroup> iterator() {
        return group.iterator();
    }
}
