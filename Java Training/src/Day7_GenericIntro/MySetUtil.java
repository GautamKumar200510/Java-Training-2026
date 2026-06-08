
import java.util.HashSet;

public class MySetUtil {
    public static HashSet<Integer> getAllNumber(){
        HashSet<Integer>obj = new HashSet<Integer>();
        obj.add(10); // true
        obj.add(30);  // true
        obj.add(50); // true
        obj.add(1);  // true
        obj.add(90);  // true
        obj.add(10);  // true
        return obj;  // true
    }

}
