

import java.util.Scanner;

public class Test_Student {
    public static void main(String[] args) {

        // Task
        // 1. Create an array to store details of 5 students.
        // 2. Accept student details from the user.
        // 3. Store the details in the array using the constructor.
        // 4. Display all student details using getter methods.


        Scanner scanner = new Scanner(System.in);

        // Step 1: Create an array to store details of 5 students.
        Student[] students = new Student[5];

        // Step 2: Accept student details from the user and store them in the array.
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Student Name: ");
            String studentName = scanner.nextLine();

            System.out.print("Marks: ");
            double marks = scanner.nextDouble();

            // Step 3: Store the details in the array using the constructor.
            students[i] = new Student(studentId, studentName, marks);
        }

        // Step 4: Display all student details using getter methods.
        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("ID: " + students[i].getStudentId());
            System.out.println("Name: " + students[i].getStudentName());
            System.out.println("Marks: " + students[i].getMarks());
            System.out.println();
        }


        // Display the student having the highest marks.
        Student topStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMarks() > topStudent.getMarks()) {
                topStudent = students[i];
            }
        }

        // Ask the user for a student ID and update the marks using the setter method.
        System.out.print("Enter the ID of the student whose marks you want to update: ");
        int idToUpdate = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (Student student : students) {
            if (student.getStudentId() == idToUpdate) {
                System.out.print("Enter the new marks for " + student.getStudentName() + ": ");
                double newMarks = scanner.nextDouble();
                student.setMarks(newMarks);
                break;
            }
        }

        // Calculate and display the average marks of all students.
        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        double averageMarks = totalMarks / students.length;
        System.out.println("Average Marks: " + averageMarks);


        // Close the scanner
        scanner.close();
    }
}


