
public class Tester_ITC {

    public static void main(String[] args) throws InterruptedException {
        Account act = new Account(101, "Ram", 5000);
        DepositeOperation t1 = new DepositeOperation(act);
        WithdrawOperation t2 = new WithdrawOperation(act);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("-----Main Thread over--------");

    }

}
