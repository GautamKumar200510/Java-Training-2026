public class Test_ThreadSynch {
    public static void main(String[] args) throws InterruptedException {
        Account act = new Account(101, "John", 1000.0);

        // create t1 for withdraw
        WithdrawOperation t1 = new WithdrawOperation(act);

        // create t2 for deposit
        DepositeOperation t2 = new DepositeOperation(act);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("-----Main Thread over--------");
    }
}
