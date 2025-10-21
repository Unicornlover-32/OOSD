package Lab4;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				16/10/25
//Purpose : 			Create Office class to store office details

public class Office extends Employee {
    private String[] officeName = {"Headquarters", "branch1", "branch2"};
    private String office;
    private int officeID;
    private static int officeNumber =  100;                     // Static variable to keep track of office number

    // Constructors
    public Office() {
        officeID = officeNumber;
        officeNumber++;                                       // Increment office number for each new office
        if (officeID < 102) {
            office = officeName[0];
        }
        else if (officeID < 104) {
            office = officeName[1];
        }
        else {
            office = officeName[2];
        }                                       
    }

    public String listOffice() {
        return "these are the available offices: \n" + officeName[0] + "\n" + officeName[1] + "\n" + officeName[2];
    }
    // toString method
    public String toString() {
        return "Office Name: " + office + "\nOffice Number: " + officeID;
    }

}
