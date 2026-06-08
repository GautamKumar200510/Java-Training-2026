public class Date {
     private int day, month, year;
    public Date(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.println("---DATE CREATED---");
    }

    @Override
    public String toString() {
        return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }


}
