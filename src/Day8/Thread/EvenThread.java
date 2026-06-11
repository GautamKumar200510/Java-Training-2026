
public class EvenThread implements Runnable {

    @Override
    public void run() {
        System.out.println("=========Even Thread started======" + Thread.activeCount());
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even No:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
