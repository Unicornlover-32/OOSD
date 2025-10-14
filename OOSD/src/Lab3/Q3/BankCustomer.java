package Lab3.Q3;

public class BankCustomer {
    private String name;                           
    private String address;  
    private int i = 0;                                              // Variable to keep track of number of accounts
    private SavingsAccount[] account = new SavingsAccount[3];       // Object to hold up to 3 savings account balances    
    private double balance = 0;                                     // Variable to hold total balance across all accounts

    // Constructor
    public BankCustomer(String currentName, String currentAddress) {
        name = currentName;
        address = currentAddress; 
    }

    // Method to add a new savings account with an initial balance
    public void addAccount(double value){
        if (i < 3){
            account[i] = new SavingsAccount(value);
            i++;
        }
        else if (i >= 3){
            System.out.println("Cannot add more accounts. Maximum of 3 accounts reached.");
            System.out.println();
        }
    }

    // Getters
    public int getNumAccounts(){
        return i;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    //Bank Customer summary
    public void AccountBalance(){
        System.out.println("Name: " + name + "\nAddress: " + address);
        for(int j = 0; j < i; j ++){
            System.out.println("Account number: " + (j+1) + ", Savings balance: " + account[j].getSavingsBalance());
        }
    }

    //other methods
     public double balance(){
        for (int j = 0; j < i; j++){
            balance = balance + account[j].getSavingsBalance();
        }

        return balance;
    }
}
