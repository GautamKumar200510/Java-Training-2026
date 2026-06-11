
import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first No.");
        int a = sc.nextInt();
        System.out.println("Enter first No.");
        int b = sc.nextInt();

        System.out.println("addition : " + " " + (a + b));
        System.out.println("Subtraction : " + " " + (a - b));
        System.out.println("Multiply : " + " " + (a - b));
        System.out.println("Divison : " + " " + (a / b));

        sc.close();

    }

}
