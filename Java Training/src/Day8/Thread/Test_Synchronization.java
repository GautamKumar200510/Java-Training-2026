public class Test_Synchronization {
    public static void main(String[] args) {
        System.out.println("=====main thread started========");
        Account act1 = new Account();
        Thread1 bankemp1 = new Thread1(act1);
        bankemp1.setName("Bank Emp1");
        bankemp1.start();
    }

}
