public class Test_StudentArray {
    public static void main(String[] args) {
        Student[] allStds = new Student[5];
        Student s1 = new Student(100, "Gautam", "pune", "abc@gmail.com");
        //Student s2 = new Student();
        Student s3 = new Student(102, "Ram", "patna", "xyc@gmail.com");
        Student s4 = new Student(103, "Sham", "delhi", "hjh@gmail.com");
        Student s5 = new Student(104, "mohan", "goa", "jbc@gmail.com");

        allStds[0] = s1;
        //allStds[1] = s2;
        allStds[2] = s3;
        allStds[3] = s4;
        allStds[4] = s5;

        for (int i = 0; i < allStds.length; i++) {
            System.out.println(allStds[i]);
        }
    }

}
