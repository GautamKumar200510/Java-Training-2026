public class Circle  extends Shape{             // Circle is not abstract and does not override abstract method area() in Shape
    int r = 5;
    float f = 3.14f;
    float sum = r*f;
    @Override 
    public void area(){
            System.out.println("--------circle area------");
            System.out.println("Area of Circle"+ sum);
           
        }
}
