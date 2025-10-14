package Lab3.Q3;

public class BankCustomerDriver {
    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer("Alice", "123 Main St");
        BankCustomer customer2 = new BankCustomer("Bob", "456 Oak St");

        customer1.addAccount(1000.50);
        customer1.addAccount(2500.75);
        customer1.addAccount(300.00);
        customer1.addAccount(300.00);  // This should not be added, as the limit is 3 accounts
        customer1.AccountBalance();
        System.out.println("Total balance: " + customer1.balance());
        System.out.println();

        customer2.addAccount(1500.00);        
        customer2.AccountBalance(); 
        System.out.println("Total balance: " + customer2.balance());    
    }
}
