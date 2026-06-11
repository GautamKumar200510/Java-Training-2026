import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

    public static Connection getDbConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("------------Bank Presentation-----------");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "1234"
            );

            System.out.println("Connected to MySQL!");

            return con;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}