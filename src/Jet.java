public class Jet {
    private  int heigh;

    public Jet(int heigh
    ) {
        this.heigh = heigh;
    }

    public void simulateMeteoEvent(MeteoEvent rain) {
        switch(rain){
            case SUN -> {
                heigh = heigh + 5;
            }
            case RAIN -> heigh = heigh - 5;
        }
    }

    @Override
    public String toString() {
        return "Jet{" +
                "heigh=" + heigh +
                '}';
    }
}
