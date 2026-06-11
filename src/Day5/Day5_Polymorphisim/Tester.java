public class Tester {
    public static void main(String[] args) {
        System.out.println("================start=========");
        Nano nano = new Nano();
        nano.speed();
        System.out.println("-----------Speed-----------------");
        System.out.println("--60km/hr--");
        Ferarri cs = new Ferarri();
        cs.speed();
        System.out.println("------------Speed--------------");
        System.out.println("----240km/hr--");
        BMW b = new BMW();
        b.speed();
        System.out.println("---------Speed--------------");
        System.out.println("---320km/hr---");
    }

}
