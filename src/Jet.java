public class Jet {
    private static int nextId = 0;
    private  String name;
    private  int heigh;
    private int latitude;
    private int longitude;
    private int id;

    private static int getNextId() {
        return nextId++;
    }

    public Jet(String name, int heigh,
               int latitude, int longitude) {
        this.name = name;
        this.heigh = heigh;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = getNextId();
    }

    public void simulateMeteoEvent(MeteoEvent rain) {
        switch(rain){
            case SUN -> {
                heigh = heigh + 2;
                latitude = latitude + 10;
            }
            case RAIN -> latitude = latitude + 5;
            case SNOW -> {
                heigh = heigh - 7;
            }
            case FOG -> {
                latitude = latitude + 1;
            }
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

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
