public class Jet implements aircraft {
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

    @Override
    public void simulateMeteoEvent(MeteoEvent rain) {
        switch(rain){
            case SUN -> {
                heigh = heigh + 2;
                latitude = latitude + 10;
                
                System.out.println("Jet#"+ name + "(" + id +"): " + "It's always sunny in Philadelphia");
            }
            case RAIN ->{
                 latitude = latitude + 5;
                System.out.println("Jet#"+ name + "(" + id +"): " +"It's always rainy in Vietnam");
                }
            case SNOW -> {
                heigh = heigh - 7;
                System.out.println("Jet#"+ name + "(" + id +"): " +"It's always snowy in Alaska");
            }
            case FOG -> {
                latitude = latitude + 1;
                System.out.println("Jet#"+ name + "(" + id +"): " +"It's always foggy in Canada");
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
