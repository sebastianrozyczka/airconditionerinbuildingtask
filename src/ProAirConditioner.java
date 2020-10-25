public class ProAirConditioner extends AirConditioner{
    @Override
    public void cooling(Room room) {
        if(room.getTemperature() > MINIMAL_TEMPERATURE) {
            room.setTemperature(room.getTemperature() - 2/room.getSize());
        }
    }
}
