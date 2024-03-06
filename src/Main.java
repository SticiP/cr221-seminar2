//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jet jet = new Jet(50,100,100);
        System.out.println(jet);
        jet.simulateMeteoEvent(MeteoEvent.SUN);
        System.out.println(jet);
        jet.simulateMeteoEvent(MeteoEvent.RAIN);
        System.out.println(jet);
        jet.simulateMeteoEvent(MeteoEvent.SNOW);
        System.out.println(jet);
        jet.simulateMeteoEvent(MeteoEvent.FOG);
        System.out.println(jet);

        Tower tower = new Tower();
        tower.register(jet);


    }
}