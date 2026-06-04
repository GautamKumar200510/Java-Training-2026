
public class Account {

    private int atcid;
    private String name;
    private double balance;

    // Default Constructor
    public Account() {
        System.out.println("---Account Default---");
        atcid = 10;
        name = "Gautam";
        balance = 1000;
    }

    // Parameterized Constructor
    public Account(int i, String n, double b) {
        System.out.println("---Account Constructor---");
        atcid = i;
        name = n;
        balance = b;
    }

    public void Withdraw(double amount) {
        balance = this.balance - amount;
        System.out.println("" + balance);

    }

    // Display the account details
    public void show() {
        System.out.println("atcid: " + atcid + ", name: " + name + ", balance: " + balance);
    }

    // Display the account details
    

}
