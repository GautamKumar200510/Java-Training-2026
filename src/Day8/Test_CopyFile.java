

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test_CopyFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("MyInfo.txt"));
             PrintWriter writer = new PrintWriter("Destination.txt")) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.println(str);
            }
            System.out.println("-----------data copied done----------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





