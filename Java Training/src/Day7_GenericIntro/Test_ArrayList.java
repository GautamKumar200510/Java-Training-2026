
import java.util.ArrayList;

public class Test_ArrayList {
    public static void main(String[] args) {

        // int []
        // sop(strList[i]);
        ArrayList<String> strList = new ArrayList<String>();

        // size: 0 isEmpty: true capacity:10

        System.out.println("IsEmpty:" + strList.isEmpty() + "");

        strList.add("RAM");
        System.out.println("IsEmpty:" + strList.isEmpty() + "");
        strList.add("RAM");
        strList.add("SHAM");
        strList.add("SEETA");
        strList.add("ANITA");
        strList.add("ZEN");
        System.out.println("IsEmpty:" + strList.isEmpty() + "");

        System.out.println(strList);
        // display element one byone
        // iterate strList
        // for (int i =0, i < strList.length, i ++)
        // sop (strList[i];)

        // then how to iterate collection:
        // used Advnced for loop which is called (for each loop)

        // how to use for each loop
        // content --> [RAM, SHAM, SEETA, ANITA, ZEN]

        // for each loop:
        // 1. for each loop starts with forst element till last
        // 2. fwd only
        // 3. read only

        // --------------------------------------------------

        // 0 1 2 3 4
        // [RAM, SHAM, SEETA, ANITA, ZEN]

        // for (String str:strList)

        // {
        // sop(str);
        // }

        // for(int i = 0; i<5; i++)
        // {
        // sop(arr[i]);
        // }

        // ---------------------------------------------------------------

        for (String str : strList) {
            System.out.println(strList);
        }
    }
}