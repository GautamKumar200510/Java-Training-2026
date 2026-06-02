import java.util.Scanner;
public class Lecture_2 {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("hello");

    }
}

// demo.java--->javac--->demo.class--->java demo--->o/p

// jvm--->classloader--->scanner.class--->bytecodeverification--->interpreter+JIP--->os specific o/p

// System--->java.lang  ---> default package
// string--->java.lang ----> default package

//System.out.println ---> is use to print o/p on console

//how to read data from user?
// use scanner class

//how to use scanner class?
//Step 1: import java.util.Scanner;
//Step 2: Scanner sc=new Scanner(System.in);
//Step 3: how to accept int input
        // sc.nextInt(); keyboard-->10-->read by nextInt()-->no1

        //sc.next(); sc.nextDouble(); sc.nextFlot(); sc.nextBoolean();

        // sc.next().charAt(0); // sc.nextLine(); // to read string with space

// string str = "Hello, World!";
    //    str = "123"; // This is valid because str is a reference variable of type String
    //    str = "True"; // This is also valid because str is a reference variable of type String


// innt no1 = 20;
// String myNo = no1; // This will cause a compile-time error because you cannot assign an int to a String variable without conversion
// sop(myNo); // This will not work because myNo is not a String, it's an int. You would need to convert the int to a String first, like this: String myNo = Integer.toString(no1);

// if, if else, for loop, while loop, do while loop, switch case

