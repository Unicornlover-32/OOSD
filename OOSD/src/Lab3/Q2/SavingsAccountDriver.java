package Lab3.Q2;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				09/10/25
//Purpose : 			Create SavingsAccount driver to test SavingsAccount class

public class SavingsAccountDriver {
    public static void main(String[] args) {
        // Create two SavingsAccount objects with initial balances
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate and display the monthly interest for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("After applying 4% interest:");
        System.out.println(saver1);
        System.out.println(saver2);

        // Change the annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate and display the monthly interest for both savers again
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("After applying 5% interest:");
        System.out.println(saver1);
        System.out.println(saver2);
    }
}
