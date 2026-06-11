
public class Test_Shape {

    public static void main(String[] args) {
        // shape s = new shpae ;  can not instance shape classs

        Circle c = new Circle();
        c.area();

        Square sqr = new Square();
        sqr.area();

        Rectangle rect = new Rectangle();
        rect.area();

        //Shape obj = new Circle();
        Shape obj = rect;
        calArea(rect);

        // Base Class Object can find 

    }

    public static void calArea(Shape obj) {
        obj.area();

    }
}
