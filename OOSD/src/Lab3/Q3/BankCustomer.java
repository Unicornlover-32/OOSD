package Lab3.Q3;

public class BankCustomer {
    private String name;
    private String address;
    private double balance;

    public BankCustomer(String currentName, String currentAddress) {
        name = currentName;
        address = currentAddress;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
