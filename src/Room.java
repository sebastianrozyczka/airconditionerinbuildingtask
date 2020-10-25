public class Room {
    private double temperature;
    private double size;

    public Room(double temperature, double size) {
        this.temperature = temperature;
        this.size = size;
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
}
