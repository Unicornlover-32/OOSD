package Lab4;

public class Staff extends Employee {

    // Constructors
    public Staff(String name, Address address, Office office) {
        super(name, address, office);
    }

    public String toString() {
        return "Employee type: Staff\n" + super.toString();    
    }
}
