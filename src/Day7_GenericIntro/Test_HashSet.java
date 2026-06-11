
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Test_HashSet {


    public static void main(String[] args) {
        HashSet<Integer> myNumbers = MySetUtil.getAllNumber();
        System.out.println(myNumbers);

        myNumbers.add(101);
        myNumbers.add(364);

        System.out.println(myNumbers);
       
        System.out.println(myNumbers.contains(100));
        System.out.println(myNumbers.remove(100));
        System.out.println(myNumbers);
         // myNuumber.clear();
        // Collection.sort(myNumbers);
        System.out.println(myNumbers);



        TreeSet<Integer> sortedNumber = new TreeSet<Integer>(myNumbers);
        
        // is Empty:false size:>10
        System.out.println("==============Sorted =======");
        System.out.println(sortedNumber);


        
    }

}
