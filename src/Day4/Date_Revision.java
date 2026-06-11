
public class Date_Revision {

    // data Members: Instance Variable
    // private: accesable inside class only
    private int day, month, year;

    // how to assign values to priavte data members?
    // Ans--> write public method
    public void assignDefault() {
        day = 1;
        month = 7;
        year = 1995;
    }

    // parameter constructor
    public Date_Revision(int i, int j, int k) {
        System.out.println("========date Parameter Constructor========");
        day = i;
        month = j;
        year = k;
    }

    public void print() {
        System.out.println("Date:" + day + "-" + month + "-" + year);
    }

}
