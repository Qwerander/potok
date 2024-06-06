import java.util.Collections;
import java.util.List;

public class PotokService {
    public void sortPotoki(List<Potok> potoki) {
        Collections.sort(potoki, new StreamComparator());
    }
}
