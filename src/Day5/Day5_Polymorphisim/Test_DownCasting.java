 import java.util.Scanner ;
public class Test_DownCasting {

    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car obj = new BMW();

        obj.speed();

        // obj.abs(); // ERROR
        // the method abs() is undefined for the type car
        // how to solve compile time error
        // BMW b = (BMW) obj; //downcasting
        // b.abs();
        // error: classcastexception
        // to avoid classcastexception use RTTI
        // RTTI ----------> Run Time Identification
        // how to use RTTI
        // use -----> instanceof operator
        int choice;

        do {

            System.out.println("Enter Your Choice");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    

                    break;

                default:
                    break;
            }

        } while (choice != 0);

        // if (obj instanceof Ferrari) {
        //     Ferrari f = (Ferrari) obj;
        //     f.nos();
        //     System.out.println("---DWN casted for ferrari");

        // } else if (obj instanceof BMW) {
        //     BMW b = (BMW) obj; //downcasting
        //     b.abs();
        //     System.out.println("---DWN casted to BMW");

        // } else if (obj instanceof Nano) {
        //     Nano n = (Nano) obj;
        //     n.nanoDisplay();
        //     System.out.println("----DWN casted into Nano-----");
        // }
    }
}
