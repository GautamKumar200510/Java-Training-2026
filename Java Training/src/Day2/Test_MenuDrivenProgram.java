
import java.util.Scanner;

public class Test_MenuDrivenProgram {
    public static void main(String[] args) {
        System.out.println("===============Real world Application(MenuDrivenProgram============)");
        System.out.println("1:Bag : 250 2:Pen :10 3:Bottle: 140  4:Color Box : 99" );

    // if else if switch case 
    int choice,qty ;
    
    Scanner sc = new Scanner(System.in);
    double totalcost = 0;

    do{
    System.out.println("Enter the Choice");
    
    choice  = sc.nextInt();

    
    switch(choice){
        case 1:
            System.out.println("Bag Cost");
            System.out.println("Enter Qty");
            qty = sc.nextInt();
            totalcost =totalcost +(qty*250);
            break;
        case 2:
            System.out.println("pen cost");
             qty = sc.nextInt();
            totalcost =totalcost +(qty*10);
            
            break;
        case 3:
            System.out.println("Bottle Cost");
            qty = sc.nextInt();
            totalcost =totalcost +(qty*140);
            break;
        case 4:
            System.out.println("Color Box");
             qty = sc.nextInt();
            totalcost =totalcost +(qty*99);
            break;
        default:
            System.err.println("Invalid output");
            break;
 
    }
    
    }
    while(choice !=0);

}
