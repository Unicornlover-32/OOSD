package Lab4;

public class Office extends Employee {
    private String officeName;
    private String officeLocation;
    private static int officeNumber =  100;                     // Static variable to keep track of office number

    // Constructors
    public Office() {
        officeName = "";
        officeLocation = "";
        officeNumber++;                                        // Increment office number for each new office
    }

    public Office(String officeName, String officeLocation) {
        this.officeName = officeName;
        this.officeLocation = officeLocation;
        officeNumber++;                                        // Increment office number for each new office
    }

    // Getters
    public String getOfficeName() {
        return officeName;
    }
    public String getOfficeLocation() {
        return officeLocation;
    }

    // Setters
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
    
    // toString method
    public String toString() {
        return "Office Name: " + officeName + "\nOffice Location: " + officeLocation + "\nOffice Number: " + officeNumber;
    }

}
