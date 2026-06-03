public class MathsOperation {
    public void add(){
        System.out.println("-----------------------\n---------Add----");
    }
        public void sum(int i, int j) {
            int k =i+j;
            System.out.println("Sum=" + k);
        }
    // function with return value
        public int getNumber(){
            System.out.println("-------Get Number---------");
            return 101;
    // System.out.println("---------*********---------"); // Unreachable code
        }
    // function accepts and return
    public int getSum(int i, int j){
        int k= i+j;
        return k;
    }
    }


