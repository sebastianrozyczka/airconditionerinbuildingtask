
public class Room {
    private double temperature;
    private double size;
    private AirConditioner airConditioner;

    public Room(double temperature, double size, AirConditioner airConditioner) {
        this.temperature = temperature;
        this.size = size;
        this.airConditioner = airConditioner;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void turnAirConditionerOn() {
        temperature = temperature - airConditioner.coolingPower(size);
    }
}
