package Lab3.Q2;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				09/10/25
//Purpose : 			Create SavingsAccount class with constructor, getter and setter

public class SavingsAccount {
    private double savingsBalance;                  // Instance variable to hold savings balance
    private int accountNumber;                      // Instance variable to hold account number
    private static double annualInterestRate;       // Static variable to hold annual interest rate
    private static int i = 1;                       // Static variable to keep track of number of accounts


    // Constructor
    public SavingsAccount(double initialBalance) {
        savingsBalance = initialBalance;
        accountNumber = i;                          // Assign account number based on the number of accounts created
        i++;                                        // Increment the account counter

    }

    // Setter
    public void setSavingsBalance(double number) {
        savingsBalance = number;                    // Set the savings balance
    }

    // Getter
    public double getSavingsBalance() {
        return savingsBalance;                      // Return the savings balance                           
    }    

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;      // Set the new annual interest rate
    }

    // Method to calculate monthly interest and update the savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12; // Calculate monthly interest
        savingsBalance += monthlyInterest;          // Update the savings balance
    }

    // ToString method to return account details
    public String toString() {
        return "Account Number: " + accountNumber + ", Savings Balance: " + savingsBalance;
    }
}