import java.util.Comparator;

public class StreamComparator implements Comparator<Potok> {
    @Override
    public int compare(Potok p1, Potok p2) {
        return Integer.compare(p1.getGroup().size(), p2.getGroup().size());
    }
}
