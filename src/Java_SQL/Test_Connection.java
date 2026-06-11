import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_Connection {

    public static void main(String[] args) {

        try {

            Connection con = ConnectionUtil.getDbConnection();

            if (con == null) {
                System.out.println("Connection Failed");
                return;
            }

            String sql = "SELECT * FROM student";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getInt("age") + " "
                        + rs.getString("course")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}