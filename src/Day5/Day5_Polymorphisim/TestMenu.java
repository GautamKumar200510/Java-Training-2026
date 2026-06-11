
import java.util.Scanner;

public class TestMenu {
    
    public static void main(String[] args) {
        System.out.println("1: Ferrai 2: BMw 3: Nano 4:Start race");
        int ch;
        int index=0;
        Scanner sc = new Scanner(System.in);
        Car[] myCars = new Car[3];
        do {
            System.out.println("Enter ch");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if(index<myCars.length){
                    Ferarri fObj = new Ferarri();
                    myCars[index] = fObj;
                    index++;
                    System.out.println("------Ferarri added");
                    
                    }
                    break;
                    
                case 2:
                    if(index<myCars.length){
                    BMW bObj = new BMW();
                    myCars[index] = bObj;
                    index++;
                      System.out.println("---------BMW Added------");
                    
                    
                    }
                    break;
                case 3:
                    if(index<myCars.length){
                    Nano cObj = new Nano();
                    myCars[index] = cObj;
                    index++;
                      System.out.println("---------Nano Added------");
                    }
                    break;
                
                case 4:
                    for(int i=0;i<myCars.length;i++){
                        if(myCars[i]!=null)
                        myCars[i].speed();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (ch != 0);
        
    }
}


