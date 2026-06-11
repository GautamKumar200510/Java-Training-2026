public class Test_StudToString {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        Student s1 = new Student(12,"aa","cc", "dddd");
        System.out.println(s1);  // implicity call tostring():Object classes
        //s1.display();;

    }

}
