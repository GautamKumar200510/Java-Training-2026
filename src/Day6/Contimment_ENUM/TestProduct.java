
import java.util.Date;

public class TestProduct {
    public static void main(String[] args) {
        Date dom = new Date();
        Product prd = new Product(101, "Cake", dom, "Food");
        System.out.println(prd);
        Product prd2 = new Product(104, "MILK", dom, "Drink");
        System.out.println(prd2);
    }

}
