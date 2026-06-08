
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("Volvo");

        cars.contains("Mazda");
        cars.remove("Volvo");
        cars.clear();
        cars.size();
        System.out.println("size:" + cars.size());
        System.out.println("add:" + cars.add("Toyota"));


    }

}
