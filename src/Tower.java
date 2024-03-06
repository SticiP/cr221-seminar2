import java.util.ArrayList;

public class Tower {
    private ArrayList<Jet> airCrafts = new ArrayList<>();
    public void register(Object jet) {
        System.out.println("Tower says: Jet#"+ jet.getName()+"("+jet.getId()+") registered to weather tower");
    airCrafts.add(jet);
    }

    public void simulate() {

        for (aircraft jet : airCrafts) {
            jet.simulateMeteoEvent(MeteoEvent.SUN);
        }
    }
}
