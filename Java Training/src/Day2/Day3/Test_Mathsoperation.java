
import static java.lang.Double.sum;


public class Test_Mathsoperation {

    private static String sum;
    public static void main(String[] args) {
        
        Test_Mathsoperation mthd = new Test_Mathsoperation();

          mthd.add();
          int no = mthd.getNumber();
         
          int i=10 , j=67;
        

        int num = mthd.getNumber();

        System.out.println("num=" + no);
        int a=10 , b=67;
         mthd.getSum(i, j);

        mthd.sum(i, j);
        
        System.out.println("sum=" + sum);
    }

    private void add() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private int getNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void getSum(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void sum(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
