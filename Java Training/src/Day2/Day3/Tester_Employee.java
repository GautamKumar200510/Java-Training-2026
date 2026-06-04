 
import java.util.Scanner;

public class Tester_Employee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.assignDetails(100 ,  "Gautam", "gautam@123" , 121186);
        emp.calSalary();
        emp.display();
        
        emp.display();
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter id anme enmil salary");
        int id = sc.nextInt();
        String nm = sc.next();
        String em = sc.next();
        double salary = sc.nextDouble();
        emp.assignDetails(id, nm, em, salary);
        emp.display();
        System.out.println("----------end-----------");
    }

   

}
