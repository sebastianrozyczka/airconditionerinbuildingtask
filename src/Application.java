public class Application {
    public static void main(String[] args) {
        Room[] rooms = new Room[2];

        AirConditioner basicAirConditioner = new BasicAirConditioner();
        AirConditioner proAirConditioner = new ProAirConditioner();

        rooms[0] = new Room(21, 20);
        rooms[1] = new Room(21, 30);

        System.out.println("Temperatura w pokoju o wielkości: " + rooms[0].getSize() + " to " +rooms[0].getTemperature());
        basicAirConditioner.cooling(rooms[0]);
        System.out.println("Temperatura w pokoju o wielkości: " + rooms[0].getSize() + " to " +rooms[0].getTemperature());
        basicAirConditioner.cooling(rooms[0]);
        System.out.println("Temperatura w pokoju o wielkości: " + rooms[0].getSize() + " to " +rooms[0].getTemperature());
        basicAirConditioner.cooling(rooms[0]);
        System.out.println("Temperatura w pokoju o wielkości: " + rooms[0].getSize() + " to " +rooms[0].getTemperature());

        System.out.println("Temperatura w pokoju o wielkości: " + rooms[1].getSize() + " to " +rooms[1].getTemperature());
        proAirConditioner.cooling(rooms[1]);
        System.out.println("Temperatura w pokoju o wielkości: " + rooms[1].getSize() + " to " +rooms[1].getTemperature());
        proAirConditioner.cooling(rooms[1]);
        System.out.println("Temperatura w pokoju o wielkości: " + rooms[1].getSize() + " to " +rooms[1].getTemperature());
        proAirConditioner.cooling(rooms[1]);
        System.out.println("Temperatura w pokoju o wielkości: " + rooms[1].getSize() + " to " +rooms[1].getTemperature());
    }
}
