
import java.util.Locale;
import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Category");
        String cate = sc.next();

        Category prdcate = Category.GRAINS;
        System.out.println(prdcate);
        // assign string value to enum
        // use value method given by enum

        Category produCategory = Category.valueOf(cate);
        System.out.println("Category:" + produCategory);
        sc.close();
    }

}
