import java.util.ArrayList;

public class TestCRUD {

    public static void main(String[] args) {

        try {

            AccountAOD dao = new AccountAOD();

            ArrayList<Account> allActs = dao.getAllAccount();

            for (Account act : allActs) {
                System.out.println(act);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}