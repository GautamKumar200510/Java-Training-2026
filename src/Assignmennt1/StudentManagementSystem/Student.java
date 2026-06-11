public class Student {
   
    private int studentId;
    private String studentName;
    private double marks;

    // A parameterized constructor to initialize all data members.
    public Student(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Getter methods for all data members.
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods for all data members.
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}


