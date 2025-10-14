package Lab4;

public class MyHr {
    private String name;
    private String address;
    private String[] office = {"Head Office", "Branch Office", "Main Office"};
    private static int officeNumber = 100;
    private static int employeeNumber = 1000;                   // Variable to keep track of employee number

    // Constructors
    public MyHr(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public MyHr() {
        setName("");
        setAddress("");
        setOffice(new String[]{"Head Office", "Branch Office", "Main Office"});
    }
    // Getters and Setters
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void setOffice(String[] office) {
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String[] getOffice() {
        return office;
    }

    public static int getOfficeNumber() {
        return officeNumber;
    }

    public static int getEmployeeNumber() {
        return employeeNumber;
    }
    

}

