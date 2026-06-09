
public class Account {

    private int actId;
    private String name;
    private double balance;

    public void createAccount(int actId, String name, double balance) {
        System.out.println("create account by" + Thread.currentThread());
        this.actId = actId;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account ID:" + actId + "Name:" + name + "Balance:" + balance;

    }

    public void withdraw(double amount) {
        System.out.println("withdraw by" + Thread.currentThread());

        balance = balance - amount;

        System.out.println("withdraw end by" + Thread.currentThread());
    }

    public void deposite(double amount) {
        System.out.println("deposite by" + Thread.currentThread());

        balance = balance + amount;

        System.out.println("deposite end by" + Thread.currentThread());
    }
}
