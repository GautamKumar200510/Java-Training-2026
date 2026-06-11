
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        System.out.println("1 : Create Account"); // C
        System.out.println("2 : Show Details");  // R
        System.out.println("3: Edit Details");  // U
        System.out.println("4: Withdraw");
        System.out.println("5: Deposite");
        System.out.println("6: Check Balance ");
        System.out.println("7 : Delete Account "); // D
        System.out.println("8: Exit");

        int ch;
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        String name, city, email;
        double amount ,balance = 0;
        long contactNumber = 0;

        do {
            System.out.println("Enter Choice");
            ch = sc.nextInt();
        
        switch (ch) {
            case 1:
                System.out.println("Enter Name city email cell no balanace ");
                name = sc.next();
                city = sc.next();
                email = sc.next();
                contactNumber = sc.nextLong();
                balance = sc.nextDouble();
                System.out.println("Enter day month Year");
                day = sc.nextInt();
                month = sc.nextInt();
                year = sc.nextInt();
                System.out.println("Account Created");
                break;
            case 2:
                if (balance == 0) {
                    System.out.println("Balance sufficient");
                } else {
                    System.out.println("------------");

                }

                break;
                case 3:
                    System.out.println("Edit name city email");
                    name = sc.next();
                    city = sc.next();
                    email = sc.next();
                    System.out.println("Edited");
                    break;
                    case 4: 
                    System.out.println("enter amount to Withdraw");
                    amount = sc.nextDouble();
                    if (amount > 0  && amount < balance) {
                        balance = balance - amount;
                        System.out.println("Amount withdraw" + balance);
                    }
                    case 5:
                        System.out.println("Enter amount ot deposit");
                        amount = sc.nextDouble();
                        if (amount >0) {
                            balance = balance + amount ;
                            System.out.println("After Deposit balance :" + balance);
                            
                        }
                        case 6:
                            System.out.println("Check balance" + balance);
                            break;
                            
                            
            }
        }
             while (ch != 8);

        System.out.println("---- thank You for bank Application ------");

        

    }

    private static long nextLong() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
