package Lab3.Q3;

public class BankCustomer {
    private String name;                           
    private String address;  
    private int i = 0;
    private double[] savingsAccount = new double[3];   
    private double balance = 0;             

    public BankCustomer(String currentName, String currentAddress) {
        name = currentName;
        address = currentAddress; 
    }

    public void addAccount(double value){
        savingsAccount[i] = value;
        i++;
        if (i > 3){
            System.out.println("Cannot add more accounts. Maximum of 3 accounts reached.");
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
            System.out.println("Savings Account " + (j+1) + " balance: " + savingsAccount[j]);
        }
    }

    //other methods
     public double balance(){
        for (int j = 0; j < i; j++){
            balance = balance + savingsAccount[j];
        }

        return balance;
    }
}
