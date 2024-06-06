import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        UchebnayaGroup gr1 = new UchebnayaGroup("Group 1");
        UchebnayaGroup gr2 = new UchebnayaGroup("Group 2");
        UchebnayaGroup gr3 = new UchebnayaGroup("Group 3");
        UchebnayaGroup gr4 = new UchebnayaGroup("Group 4");
        UchebnayaGroup gr5 = new UchebnayaGroup("Group 5");

        Potok potok1 = new Potok(Arrays.asList(gr4, gr1, gr2, gr3, gr5), "Potok-1");
        Potok potok2 = new Potok(Arrays.asList(gr3), "Potok-2");
        Potok potok3 = new Potok(Arrays.asList(gr4, gr1, gr2), "Potok-3");
        Potok potok4 = new Potok(Arrays.asList(gr1, gr2), "Potok-4");

        List<Potok> potoki = Arrays.asList(potok1, potok2, potok3, potok4);

        Controller controller = new Controller();
        controller.sortPotoki(potoki);

        for (Potok potok : potoki) {
            int groupCount = potok.getGroup().size();
            String groupWord = WordUtilit.getGroupWord(groupCount);
            System.out.println(potok.getName() + " включает в себя " + groupCount + " " + groupWord + ".");
        }
    }
}
