
import java.util.Scanner;

public class Test_Student {
    public static void main(String[] args) {
        Student std1 = new Student(101,"Gautam","pune","a@ajgjg.com");
        std1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New Email");
        String email=sc.next();

        std1.setEmail("a@gmail.com");
        System.out.println("Update Email:" + std1.getEmail());
        System.out.println();
        std1.display();

        std1.setname("Gautam");
        System.out.println("Update Email:" + std1.getEmail());
        System.out.println();
        std1.display();


        // System.out.println(std1)
        int a=10;
        System.out.println(a);
        System.out.println(std1);


        }
    }


