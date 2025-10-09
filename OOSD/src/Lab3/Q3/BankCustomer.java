package Lab3.Q3;

public class BankCustomer {
    private String name;                           
    private String address;  
    private static int[] i = new int[50];  
    public static int x = 0;
    private double[] savingsAccount = new double[3];   
    private double balance = 0;             

    public BankCustomer(String currentName, String currentAddress) {
        name = currentName;
        address = currentAddress; 
    }

    public void addAccount(double value){
        while (i[x] < 3){
            savingsAccount[i[x]] = value;
            i[x]++;
        }
    }

    public void balance(){
        for (int j = 0; j < i[x]; j++){
            balance = balance + savingsAccount[j];
        }
    }

    // Getters
    public double getBalance(){ 
        return balance;
    }

    public int getNumAccounts(){
        return i[x];
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}
