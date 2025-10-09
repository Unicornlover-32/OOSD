package Lab3.Q3;

public class BankCustomerDriver {
    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer("Alice", "123 Main St");
        BankCustomer customer2 = new BankCustomer("Bob", "456 Oak St");

        customer1.addAccount(1000.50);
        customer1.addAccount(2500.75);
        customer1.addAccount(300.00);
        customer1.balance();
        System.out.println("Customer: " + customer1.getName() + ", Address: " + customer1.getAddress());
        System.out.println("Number of Accounts: " + customer1.getNumAccounts());
        System.out.println("Total Balance: " + customer1.getBalance());
        System.out.println();

        customer2.addAccount(1500.00);
        customer2.balance();            
        System.out.println("Customer: " + customer2.getName() + ", Address: " + customer2.getAddress());
        System.out.println("Number of Accounts: " + customer2.getNumAccounts());
        System.out.println("Total Balance: " + customer2.getBalance());    


    }
}
