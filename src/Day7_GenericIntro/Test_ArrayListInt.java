

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test_ArrayListInt {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        intList.add(12);
        intList.add(6386);
        intList.add(186);
        intList.add(37);
        intList.add(979);
        intList.add(3234);
        intList.add(909);

        System.out.println("Show all elements");
        for (int i : intList) {
            System.out.println(i + " ");
        }

        System.out.println("---------------------------");
        System.out.println("Enter Index");
        int index = sc.nextInt();
        System.out.println("Element " + intList.get(index));
        System.out.println("search 12 in list " + intList.contains(12));
        System.out.println("Remove Element at index");
        int r = sc.nextInt();
        intList.remove(r);
        System.out.println("After Remove : " + intList);
        System.out.println("=============Sort=========== ");
        Collections.sort(intList);
        System.out.println(intList);

        sc.close();
    }
}
            