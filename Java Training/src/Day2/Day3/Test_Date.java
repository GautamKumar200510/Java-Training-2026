public class Test_Date {
    public static void main(String[] args) {

        Date dob1 = new Date();

        dob1.showDate(); // 0/0/0

        dob1.assignDate(8, 5, 1982);
        dob1.showDate();

        Date dob2 = new Date();
        dob2.assignDate(2,12,2009);
        dob2.showDate();

        Date dob3 = new Date();
        dob3.assignDate(3,10,2006);
        dob3.showDate();
    }

}
