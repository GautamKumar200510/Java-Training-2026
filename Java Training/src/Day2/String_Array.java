import java.util.Scanner;
public class String_Array {
    public static void main(String[] args) {
        String[] name = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }
          System.out.println("=====================Names=============");
          for (int i = 0; i < name.length; i++) {
              System.out.println(name[i]);
          }
    }

}
