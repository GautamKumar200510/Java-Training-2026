public class TestRuning_Binding {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
        System.out.println();
        BMW b=new BMW();
        b.speed();

        // Car cobj;
        // cobj = new Ferarri();

        // Base class Object can hold ref of Derived class 
        Car baseobj = new BMW(); // upcasting: implicit 

        // baseobj   --> compiler : car class 
        // baseobj   --> Runtime  : BMW class 

        baseobj.speed();  // car class 
        baseobj = new Ferarri();
        baseobj.speed();

    }

}
