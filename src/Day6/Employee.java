public class Employee {
    
	private int empid;
	private String name;

	public Employee() {
		System.out.println("default employee");
		empid = 101;
		name = "Ram";
	}

	public Employee(int empid, String name) {

		System.out.println("---parameter Employee---");
		this.empid=empid;
		this.name=name;
	}
	public void calSalary()
	{
		System.out.println("Emp Salary");
	}
}


