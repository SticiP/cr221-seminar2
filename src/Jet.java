public class Jet {
    private  int heigh;

    public Jet(int heigh
    ) {
        this.heigh = heigh;
    }

    public void simulateMeteoEvent() {
        System.out.println("dimon");
        heigh = heigh + 5;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "heigh=" + heigh +
                '}';
    }
}
