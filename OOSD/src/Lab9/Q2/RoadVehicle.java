package Lab9.Q2;

public class RoadVehicle {
    private String make;
    private String model;

    public RoadVehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\nModel: " + model;
    }
    
}
