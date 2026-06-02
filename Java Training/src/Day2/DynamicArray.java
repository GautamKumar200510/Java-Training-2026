
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        System.out.println("============Array Demo=============");
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Element ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("-------Array Elememts-----------");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("============Incremnt by 10================");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] +10);         // Temporanry Array
        }
        for (int i = 0; i < 5; i++) {
            arr[i] = arr[i] +10;
            System.out.println(arr[i]);               // permanent Array
        }
    System.out.println("==========================");
    for (int i = 0; i < 5; i++) {
        System.out.println(arr[i]);
    }
    System.out.println("---------------Odd Array------------");
    for (int i = 0; i < 5; i++) {
        if (arr[i]%2!=0) {
            System.out.println(arr[i]);
        }
    }
    System.out.println("------------Sum of an array------------");
        int sum =0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        System.out.println(sum);
        }
    System.out.println("----------Maximum N0. in array-------");
             
        }
    }


