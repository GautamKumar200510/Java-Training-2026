public class Thread_LifeCycle {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("---------Main starteed--------");
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.start();
        t1.join(5000);
        System.err.println("");
        
    }

}
