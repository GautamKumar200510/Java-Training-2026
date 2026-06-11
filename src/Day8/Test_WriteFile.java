
import java.io.PrintWriter;
import java.io.File;

public class Test_WriteFile {
    public static void main(String[] args) {
        try {
            PrintWriter  writer = new PrintWriter(new File("MyInfo.txt"));
            writer.println("This is my Info");
            writer.println("RollNo: 101");
            writer.println("Name:gautam");
            writer.println("City: Patna");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
