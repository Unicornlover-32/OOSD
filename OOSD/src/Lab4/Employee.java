package Lab4;

public class Employee {
    private String name;
    private static int employeeNumber = 1000;                   // Variable to keep track of employee number
    private Address address;                                    // Address object to hold address details
    private Office office;                                      // Office object to hold office details

    // Constructors
    public Employee(String name, Address address, Office office) {
        this.name = name;
        this.address = address; 
        this.office = office;   
        employeeNumber++;                                      // Increment employee number for each new employee
    }

    public Employee() {
        setName("");
    }
    // Setters
    
    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public static int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public String toString() {
        return "Name: " + name + "\nEmployee Number: " + employeeNumber  + 
        "\nAddress: " + address.toString() +
        "\n" + office.toString();
    }
}

