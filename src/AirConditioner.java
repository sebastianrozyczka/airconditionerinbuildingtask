public class AirConditioner {
    protected static final int MINIMAL_TEMPERATURE = 17;
    public void cooling(Room room) {
        if(room.getTemperature() > MINIMAL_TEMPERATURE) {
            room.setTemperature(room.getTemperature() - 1/room.getSize());
        }
    }
}
