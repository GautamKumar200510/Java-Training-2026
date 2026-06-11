public class Book {
   private int bookid;
   private String name,author;
   private double price;

   public void assign(int id,String nm,String auth , double pri){
    bookid = id;
    name = nm;author=auth;price=pri;
   }
  public void display(){
    System.out.println(bookid + " "+name+" " + price);
  }
}
