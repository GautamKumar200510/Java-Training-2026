public class WithdrawOperation extends Thread {
    private Account act;

    public WithdrawOperation(Account act) {
        this.act = act;
        System.out.println("Thread Get Created...");
    }

    @Override
    public void run() {
        try {
            System.out.println("\t\tWithdraw Thread Started");
            Thread.sleep(2000);
            act.withdraw(1000);
            Thread.sleep(2000);
            System.out.println("\t\tWithdraw Thread over");
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}



