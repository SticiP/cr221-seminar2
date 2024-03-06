//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jet jet = new Jet("Boing",50,100,100);
        Helicopter helicopter = new Helicopter("Heli", 100, 125, 100);
        Jet jet2 = new Jet("Eleonora", 75, 125, 65);

        Tower tower = new Tower();
        tower.register(jet);
        tower.register(helicopter);
        tower.register(jet2);
        tower.simulate();

        


    }
}