
import java.io.BufferedReader;
import java.io.FileReader;

public class Test_ReaderFile {
    public static void main(String[] args) {
        try {
            FileReader fileRaeder = new FileReader("MyData.txt");
            BufferedReader reader = new BufferedReader(fileRaeder);

            String str = null;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        reader.close();

     } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

}
