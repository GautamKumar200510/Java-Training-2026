
import java.util.Scanner;

public class Tester_Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AccId Name Email Balance");

        int id = sc.nextInt();
        String name = sc.next();
        String email = sc.next();
        double balance = sc.nextDouble();
        // 101 Gautam gautam@.com 977960

        Bank act = new  Bank();
        act.createAccount(id,name,email,balance);
        act.show();
        System.out.println("Enter amount to withdraw");
        double amount = sc.nextDouble();

        act.withdraw(amount);
        double cBal = act.getBalance();
        System.out.println(cBal);

        Bank act1 = new Bank();
        act1.createAccount(865, "Gautam","gauta@68" , 97439);
        act.show();

        
        

    
        
    }

}
