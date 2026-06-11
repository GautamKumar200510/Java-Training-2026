public class Test_Thread {

    private static EvenThread even;
    public static void main(String[] args) {
        System.out.println("----------");
        Thread t1 = new Thread();
        t1.setName("Thraet1");
        t1.start();
        System.out.println("main");
    }

}
