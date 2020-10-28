import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
       ArrayList<Room>rooms = new ArrayList<>();

        rooms.add(new Room(23, 20, new BasicAirConditioner()));
        rooms.add(new Room(23, 30, new ProAirConditioner()));

        System.out.println(rooms.get(0).getTemperature());
        rooms.get(0).turnAirConditionerOn();
        System.out.println(rooms.get(0).getTemperature());
        rooms.get(0).turnAirConditionerOn();
        System.out.println(rooms.get(0).getTemperature());

        System.out.println(rooms.get(1).getTemperature());
        rooms.get(1).turnAirConditionerOn();
        System.out.println(rooms.get(1).getTemperature());
        rooms.get(1).turnAirConditionerOn();
        System.out.println(rooms.get(1).getTemperature());
    }
}
