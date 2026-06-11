public class Employee {
    private int empid;
    public  String name,email;
    public  double salary;

    // methods
    public void assignDetails(int id, String nm , String em, double sal ){
        empid =id;
        name =nm;
        email=em;
        salary = sal;
        System.out.println("===================Employee Details Assigned================");

        }
        public void calSalary(){
            System.out.println("-----------Calculate Salary--------");
        }
        public void display(){
            System.out.println("--------------------------");
            System.out.println(empid);
            System.out.println(name);
            System.out.println(email);
            System.out.println(salary);
        }
       
    }


