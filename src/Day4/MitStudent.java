public class MitStudent {
    private static String clgname;
    // for assigning static data
    // use static block
    static {
        System.out.println("=====================");
        clgname ="MIT";
    }
        public static void displayclgname(){
            System.out.println(clgname);
        }    
        public MitStudent(){
            super();
            System.out.println("=====================");
        }    
    }


