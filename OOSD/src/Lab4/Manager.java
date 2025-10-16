package Lab4;

public class Manager extends Employee {
    
    private String carType;

    // Constructors
    public Manager(String name, String carType, Address address, Office office) {
        super(name, address, office);
        this.carType = carType;
    }

    // Getters
    public String getCarType() {
        return carType;
    }

    // Setters
    public void setCarType(String carType) {
        this.carType = carType;
    }

    // Method to return car details
    public String carDetails() {
        return "\nCar Type: " + carType;
    }
    // toString method
    public String toString() {
        return "Employee type: Manager\n" + super.toString() + carDetails() ;    
    }
}