


public class Thread extends java.lang.Thread{

   
     public void run(){
        System.out.println("========Thread1========");
        for (int  i=1; i<=5; i++ ){
            System.out.println(i);
            try {
                java.lang.Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("----------Thread1----------");
     }


}
