package Lab4;

public class Manager extends MyHr {
    
    private String carType;
    private String registration;
    private int milageWhenTaken;

    // Constructors
    public Manager(String name, String address ,String carType, String registration, int milageWhenTaken) {
        super(name, address);
        this.carType = carType;
        this.registration = registration;
        this.milageWhenTaken = milageWhenTaken;
    }
}
