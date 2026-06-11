
import java.util.ArrayList;
import java.util.Scanner;

public class Test_Product {
    public static void main(String[] args) {
        // get all prds
        ArrayList<Product>shop = ProductUtil.getAllprds();
        System.out.println("Size:" + shop.size());
        System.out.println("prdid name price");
        Scanner sc = new Scanner(System.in);
        // Product p1 = new Product(sc.nextInt(),sc.next() , sc.nextDouble());
        shop.add(new Product(sc.nextInt(), sc.next() , sc.nextDouble()));
        sc.close();
        System.out.println("=========show all==========");
        
    }

}
