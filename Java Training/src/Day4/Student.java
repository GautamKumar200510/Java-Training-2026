public class Student {
    private int rollno;
    private String name,city,emails;
    private double percentage;
    public Student(int par, String gautam, String pune, String aajgjgcom){
        System.out.println("====================Student Default=========");
        rollno =1;
        name="a";city="b";emails="c";percentage=10;
    }
    public void display(){
        System.out.println("RollNo: "+ rollno);
    }
    public void setEmail(String e){
        emails=e;
    }
    public void setname(String Gautam){
        name=Gautam;
    }
    public String getEmail(){
        return emails;
    }
    
    }
    

    
    


