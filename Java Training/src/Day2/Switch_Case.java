
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
// ==================================Shopping Application==========================
        System.out.println("==============Shopping Application=================");
        System.out.println("1:Bag 2:pen 3: Bottle 4:Colorbox");

        int choice;
        double total=0;
        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("You have Enter : " + " " + (choice));
    //  if choice == 1 then what to do?

    switch (choice) {
        case 1 :
            total = 150;
            System.out.println("Bag Cost : 150");
            break;
        case 2:
            total =10;
            System.out.println("pen cost : 10");
            break;
        case 3:
            total = 250;
            System.out.println("Bottle cost : 250");
            break;
        case 4:
            total =50;
            System.out.println("color box :50");
            break;
        default:
            throw new AssertionError();
        
    }
        System.out.println("----Thankyou-----");
    }

}
