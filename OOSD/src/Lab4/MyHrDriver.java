package Lab4;

import java.util.Scanner;

public class MyHrDriver {
    public static void main(String[] args) {
        int employeeCount = 0;
        int managerCount = 0;
        int staffCount = 0;
        int optionPick = 1;
        boolean validManager = false;
        String isManager = "";
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Address[] address = new Address[5];
        Office[] office = new Office[5];
        Employee[] manager = new Manager[2];
        Employee[] staff = new Staff[5];

        office[0] = new Office(); // Initialize the first office to avoid null when listing offices
        while (optionPick != 4) {
            
            System.out.println("1: List all offices");
            System.out.println("2: Add new employee");
            System.out.println("3: List all employees");
            System.out.println("4: Exit");
            System.out.println();
            optionPick = myObj.nextInt();
            System.out.println();

            while (optionPick < 1 && optionPick > 4) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                optionPick = myObj.nextInt();
                System.out.println();
            }
            if (optionPick == 1) {
                System.out.println(office[0].listOffice());
                System.out.println();
            }
            else if (optionPick == 2 && employeeCount < 5) {
                System.out.println("Enter name and surname");
                String name = myObj.nextLine();  // Read user input
                name = myObj.nextLine();  // Read user input
                System.out.println("Enter street");
                String street = myObj.nextLine();  
                System.out.println("Enter city");
                String city = myObj.nextLine();  
                System.out.println("Enter county");
                String county = myObj.nextLine(); 
                address[employeeCount] = new Address(street, city, county);

                office[employeeCount] = new Office();

                System.out.println("Is your employee a manager? (yes/no)");
                do {
                    isManager = myObj.nextLine(); 
                    if (!isManager.equals("yes") && !isManager.equals("no")) {
                        System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    }
                    else if (managerCount >= 2 && isManager.equals("yes")) {
                        System.out.println("You have reached the maximum number of managers (2). Please enter 'no'.");
                    }
                    else {
                        validManager = true;
                    }
                    System.out.println();
                } while (validManager == false);

                if (isManager.equals("yes")) {
                    System.out.println("What type of vehicle is given to them");
                    String vehicleType = myObj.nextLine();
                    System.out.println();
                    manager[employeeCount] = new Manager(name, vehicleType, address[employeeCount], office[employeeCount]);
                    System.out.println(manager[employeeCount].toString());
                    managerCount++;
                    employeeCount++;
                }
                else {
                    staff[employeeCount] = new Staff(name, address[employeeCount], office[employeeCount]);
                    System.out.println(staff[employeeCount].toString());
                    employeeCount++;
                    staffCount++;
                }
            
                System.err.println();
                validManager = false;
                employeeCount++;
            }
            else if (optionPick == 2) {
                System.out.println("You have reached the maximum number of employees (5). Please select another option.");
                System.out.println();
            }
            else if (optionPick == 3 && employeeCount > 0) {
                for (int i = 0; i < managerCount; i++) {
                    System.out.println(manager[i].toString());
                    System.out.println();
                }
                for (int i = 0; i < staffCount; i++) {
                    System.out.println(staff[i].toString());
                    System.out.println();
                }
            }
            else if (optionPick == 4) {
                System.out.println("Exiting program. Goodbye!");
            }
            else {
                System.out.println("No employees to display.");
                System.out.println();
            }
        }
    }
}
