
public class Manager extends Employee {
    private int teamSize;

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.MAnagerTask();
    }

    public Manager() {
        System.out.println("---default manager---");
        teamSize = 5;
    }

    public Manager(int empid, String name, int teamSize) {
        super(empid, name);
        this.teamSize = teamSize;
    }

    public void MAnagerTask() {
        System.out.println("---manager task---");
    }
	 public void assignTask() {
        System.out.println("---assignTask ---");
    }

}
