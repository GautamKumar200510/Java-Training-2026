
import java.sql.Connection;
import java.sql.DriverManager;

public class Test_connection {
    public static void main(String[] args) {
        
        // check the driver jar files added in project

        // jdbc steps 
        // load driver
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");  // Reflection
        System.out.println("==========Driver Loaded=========");

        // Step1: Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test" , "root" , "root"); 
        System.out.println("-----connected with jdbc----------");
        }
                 catch( Exception e){
                    e.printStackTrace();
                 }
    }


}
