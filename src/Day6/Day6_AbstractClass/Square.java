public class Square extends Shape {
    int l=5;
    int Sum = l*l;
    @Override
    public void area (){
        System.out.println("----------Square area---------");
        System.out.println("Area of Square" + Sum);
    }

}
