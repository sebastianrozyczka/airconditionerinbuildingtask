public class BasicAirConditioner extends AirConditioner {
    @Override
    public void cooling(Room room) {
        if(room.getTemperature() > MINIMAL_TEMPERATURE) {
            room.setTemperature(room.getTemperature() - 1/room.getSize());
        }
    }
}
