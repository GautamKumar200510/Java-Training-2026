
import java.util.HashMap;

public class HeapMap {
    


    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(101, "Vaishali");
        hm.put(102, "Sonali");
        hm.put(103, "Monali");
        hm.put(104, "Gonali");
        hm.put(105, "tonali");

        System.out.println(hm); // {101=Vaishali, 102=Sonali, 103=Monali, 104=Gonali, 105=tonali}
        System.out.println("Key 101:" + hm.get(101)); // Key 101:Vaishali

        System.out.println("Key 101:" + hm.remove(101));
        System.out.println(hm); // Key 101:Vaishali {102=Sonali, 103=Monali, 104=Gonali, 105=tonali}

        hm.clear();
        System.out.println(hm); // {}

        hm.containsValue(101);
    }
}

