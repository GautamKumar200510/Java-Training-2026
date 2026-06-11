public class Test_Account {
      public static void main(String[] args) {
        Account act1 = new Account();
        act1.show();

        Account act2 = new Account(101, "Gautam", 5000);
        act2.show();

        Account act3 = new Account(202, "Ramesh", 100000);
        act3.show();
    }

}
