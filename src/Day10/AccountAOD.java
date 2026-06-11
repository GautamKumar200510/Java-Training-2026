import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccountAOD {

    private Connection con;

    public AccountAOD() throws Exception {

        con = ConnectionUtil.getDbConnection();

        System.out.println("Connection = " + con);

        System.out.println("===========Inside Account AOD Object Created===========");
    }

    // Select All Accounts
    public ArrayList<Account> getAllAccount() throws SQLException {

        if (con == null) {

            System.out.println("Database Connection Failed");

            return new ArrayList<>();
        }

        String sql = "SELECT * FROM Account";

        Statement stmt = con.createStatement();

        ResultSet rset = stmt.executeQuery(sql);

        ArrayList<Account> allActs = new ArrayList<>();

        while (rset.next()) {

            Account act = new Account(
                    rset.getInt("actid"),
                    rset.getString("name"),
                    rset.getString("email"),
                    rset.getString("pwd"),
                    rset.getDouble("balance"));

            allActs.add(act);
        }

        return allActs;
    }
}