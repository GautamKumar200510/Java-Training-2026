
public class Test_EvenThread {

    public static void main(String[] args) {

        System.out.println("-----Main------");

        EvenThread even = new EvenThread();

        Thread t1 = new Thread(even);

        t1.setName("Even Thread");
        t1.start();
        System.out.println("---------Main----------");

    }

}
