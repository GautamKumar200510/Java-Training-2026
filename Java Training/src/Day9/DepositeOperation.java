public class DepositeOperation extends Thread {
    private Account act;

    public DepositeOperation(Account act) {
        this.act = act;
        System.out.println("Thread Get Created...");
    }

    @Override
    public void run() {
        try {
            System.out.println("\t\tDeposit Thread Started");
            Thread.sleep(2000);
            act.deposite(1000);
            Thread.sleep(2000);
            System.out.println("\t\tDeposit Thread over");
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
