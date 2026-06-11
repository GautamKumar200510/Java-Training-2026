import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        String name;
        int age;
        char section;
        int rollno;
        boolean pass;

        System.out.println("Student name : ");
        name = sc.nextLine();
        System.out.println("Age :");
        age = sc.nextInt();
        
         System.out.print("Enter Section: ");
        section = sc.next().charAt(0);
        System.out.println("roll no");
        rollno = sc.nextInt();
        System.out.println("Student pass or fail");
        pass = sc.nextBoolean();

        
    }
    
 
     
    

    

}
