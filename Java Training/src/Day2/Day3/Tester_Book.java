public class Tester_Book {
    public static void main(String[] args) {
        Book bk1 = new Book();
        bk1.assign(101,"Abs","p", 900);
        bk1.display();  // 101 Abc p 900

        Book bk2 = new Book();
        bk2.assign(345,"Xyz","Anil" , 100);
        bk2.display();
        
        Book bk3 = new Book();
        bk3.assign(873,"Xyz","Gautam" , 189);
        bk3.display();

        Book bk4 = new Book();
        bk4.assign(345,"jkn","Brishal" , 977);
        bk4.display();
    }

}
