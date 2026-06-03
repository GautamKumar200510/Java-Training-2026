public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[]arr2 = {6,7,8,9,10};

        int s1 = arr1.length;   
        int s2 = arr2.length;

        int s3 = s1+s2;
       
        int []arr3 = new int[s3];
        System.out.println(s3);

       System.out.println(s1);
       System.out.println(s2);

       int index = 0;
       for (int idx = 0; idx < s1; idx++) {
           Object elem = arr1[idx];
          System.out.println(elem); 
       }
       System.out.println("-------------------------");
       for (int idx = 0; idx < s2; idx++) {
           Object elem = arr2[idx];
          System.out.println(elem); 
    }
       

}
}