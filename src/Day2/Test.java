
import java.util.Scanner;

public class Test {
    public static void main (String [] args){
        System.out.println("---------Day2----------");
        int no1,no2,no3;
    // Data Type:
    // Primitive-->Value Type
    // Non-Primitive--> Ref type (UDT) 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter No1 No2");
         no1 = sc.nextInt();
         no2 = sc.nextInt();

         System.out.println(no1);
         System.out.println(no2);

         if (no1<no2) {
             System.out.println("no1<no2");
         } else {
            System.out.println("no1>no2");
         }

    System.out.println("----------Even---------");
       if (no1%2==0 && no1>) {
        System.out.println("No1 is even number");
        System.out.println(no1);
           }
             else{
                System.out.println("No1 is odd nnumber");
             }

    }

}
