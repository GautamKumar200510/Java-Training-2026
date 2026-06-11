
import java.io.File;

public class Test_File {
    public static void main(String[] args) {

        String fileName = "d:\\nofile.txt";
        System.out.println("========File============");
        // create an object of file
        // im[port java.io
        
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File Exist");
            System.out.println("Name:" + file.getName());
            System.out.println("canRead:" + file.canRead());
            System.out.println("Name:" + file.getAbsolutePath());
            System.out.println("Length:" + file.length());

            
        }
        else {
            try {
                System.out.println("Not Exist");
                file.createNewFile();       // chked exceptiom
                System.out.println("-------------Created------------");
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}


