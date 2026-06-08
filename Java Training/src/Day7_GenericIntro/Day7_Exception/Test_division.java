
import java.util.Scanner;

public class Test_division {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1,no2,no3;
        System.out.println("No1 No2");
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        no3 = no1/no2;
        
        // example use to avoid unused variable warnings
        System.out.println("");
        //System.out.println("Inputs: " + no1 + ", " + no2 + ", " + no3);
        
    }

}
