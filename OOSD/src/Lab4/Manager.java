package Lab4;

public class Manager extends Employee {
    
    private String carType;
    private String registration;
    private int milageWhenTaken;

    // Constructors
    public Manager(String name, String carType, String registration, int milageWhenTaken, Address address, Office office) {
        super(name, address, office);
        this.carType = carType;
        this.registration = registration;
        this.milageWhenTaken = milageWhenTaken;
    }

    // Getters
    public String getCarType() {
        return carType;
    }
    public String getRegistration() {
        return registration;
    }
    public int getMilageWhenTaken() {
        return milageWhenTaken;
    }

    // Setters
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public void setMilageWhenTaken(int milageWhenTaken) {
        this.milageWhenTaken = milageWhenTaken;
    }

    // Method to return car details
    public String carDetails() {
        return "\nCar Type: " + carType + "\nRegistration: " + registration + "\nMilage When Taken: " + milageWhenTaken;
    }
    // toString method
    public String toString() {
        return super.toString() + carDetails();    
    }
}