public class ArrayIntroduction {
    public static void main(String[] args) {
    // Why Array
    String name="ram";
    System.out.println(name); // ram
    name="sham";
    System.out.println(name); // sham  it is difficult to store one by one in the data

    // why Array?
    // what is an Array:
    // --> collection of similar data type

    // int a = 10;
    // a=20;
    // int arr[] = {2,4,5,6,};
    // System.out.println(arr);

    // Syntax
    int [] arr = {12,4,76,45,12,23}; 
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println("=============Dispaly Array Element================");
    
    for (int i = 0; i < 6; i++) {          // Array size can not get changed dynamically
        System.out.print(arr[i] + " ");    // Array size is fixed
        
    }
    }

}
