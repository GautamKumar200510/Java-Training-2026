
import java.util.Scanner;

public class Test_StudResgistration {
    public static void main(String[] args) {
        
        System.out.println("1:add 2:show 3: all emails 4:edit name");
        Scanner sc =new Scanner(System.in);
        Student[] mitStudents = new Student[5];
        int ch;
        do { 
            System.out.println("choices :");
            ch=sc.nextInt();
         switch (ch)
         {
            case 1:
                for (int i = 0; i < mitStudents.length; i++) {
                    System.out.println("Enter rollno name city per");
                    Student s1= new Student(sc.nextInt() ,sc.next(),sc.next());
                    mitStudents[i] =s1;
                    System.out.println("Student added");  
                }
                break;
            case 2:
                for (int i = 0; i < mitStudents.length; i++){
                    System.out.println(mitStudents[i]);
                }
         }
        }

    }
}