
public class Car {

    private int carid;
    private String name;
    private double price;

    public Car() {
        super();

        System.out.println("--------Default Constructor----");
    }

    public int getCarid() {
        return carid;
    }

    public double getPrice() {
        return price;
    }
    public void setCarid(int carid){
        this.carid = carid;
    }

    public String getName() {
        return name;
    }
    // object class tostring()
    //tostring() get cancelde implicity

    // public string tosstring();
    @Override
    public String toString() {
        return carid + " " + name + " " + price;
    }

    public void speed() {
        System.out.println("----------Car speed id 60km/hr");
    }

}
