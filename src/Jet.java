public class Jet {
    private  int heigh;
    private int latitude;
    private int longitude;

    public Jet(int heigh,
               int latitude, int longitude) {
        this.heigh = heigh;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void simulateMeteoEvent(MeteoEvent rain) {
        switch(rain){
            case SUN -> {
                heigh = heigh + 2;
                latitude = latitude + 10;
            }
            case RAIN -> latitude = latitude + 5;
        }
    }

    @Override
    public String toString() {
        return "Jet{" +
                "heigh=" + heigh +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
