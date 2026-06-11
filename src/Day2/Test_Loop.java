
public class Test_Loop {

    public static void main(String[] args) {
        System.out.println("==================For Loop=======================");
        System.out.println("Print the loop 1 to 10 : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------------");

        for (int i = 1; i < 10; i++) {
            if (i%2==0 ) {
                System.out.println("Even No :" + (i));
            }
        }
        System.out.println("-----------------------------------");
        for (int i = 1; i < 10; i++){
            if (i%2!=0) {
                System.out.println("Odd No: " +(i));
            }
            
        }
        System.out.println("--------------------------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println("Reverse No: " + (i));
        }
        System.out.println("----------------------------------");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
                System.out.println("Stop when i is = 6");
            }
            System.out.println("---------------------------------------");

            for (int i = 1; i <=10; i++) {
                System.out.println(i*2);
            }
        
        System.out.println("-------------------while-----------------------");

            int no1 = 1;
            while(no1<=10){
                System.out.println(no1);
                no1++;
            }
            System.out.println("No1=" + no1);
            System.out.println("-------------------(Do While)---------------------------");
            do { 
                System.out.println(no1);
                no1++;
            } while (no1<=10);

            
        }
        }
    


