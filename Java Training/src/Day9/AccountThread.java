public class AccountThread {



    private int actId;
    private String name;
    private double balance;

    public AccountThread(int actId, String name, double balance) {
        super();
        this.actId = actId;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account ID:" + actId + "Name:" + name + "Balance:" + balance;

    }

    // synchronized withdraw (for threaded use)
    public synchronized void withdraw(double amount) throws InterruptedException {

        // Thread t = Thread.currentThread();
        // System.out.println(t.getName());
        // Thread.currentThread().getName();
        Thread.sleep(10000);
        System.out.println("deposit operation started by" + Thread.currentThread());
        if (balance<amount) {
            System.out.println("----------Waiting for somedeposit to occur");
        }

        

        balance = balance - amount;
        Thread.sleep(2000);

        System.out.println("after Deposit:" + balance);
        System.out.println("deposit operation end by" + Thread.currentThread());
    }
}


