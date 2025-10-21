package Lab4;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				16/10/25
//Purpose : 			Create Staff class that inherits from Employee and stores staff specific details

public class Staff extends Employee {

    // Constructors
    public Staff(String name, Address address, Office office) {
        super(name, address, office);
    }

    public String toString() {
        return "Employee type: Staff\n" + super.toString();    
    }
}
