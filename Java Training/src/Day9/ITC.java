
public class ITC {

    private int actId;
    private String name;
    private double balance;

    public ITC(int actId, String name, double balance) {
        super();
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

    // deposite thread
    public void deposite(double amount) throws InterruptedException {

        // Thread t = Thread.currentThread();
        // System.out.println(t.getName());
        // Thread.currentThread().getName();

        System.out.println("deposite operation started by" + Thread.currentThread());

        Thread.sleep(2000);

        balance = balance + amount;

        System.out.println("after Deposite:" + balance);
        System.out.println("deposite operation end by" + Thread.currentThread());
    }
}