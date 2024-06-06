import java.util.List;

public class Controller {
    private PotokService potokService;

    public Controller() {
        this.potokService = new PotokService();
    }

    public void sortPotoki(List<Potok> potoki) {
        potokService.sortPotoki(potoki);
    }
}
