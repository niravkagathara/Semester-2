/*Write a class program with following specifications:
Class Name: Student
Data Members: Enrollment_No, Student_Name, Semester, CPI and SPI
Member Functions: GetStudentDetails () and DisplayStudentDetails ().*/
import java.util.*;
public class Enrollno {
    private int enrollmentNo;
    private String studentName;
    private int semester;
    private double cpi;
    private double spi;

    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment No: ");
        this.enrollmentNo = sc.nextInt();

        System.out.print("Enter Student Name: ");
        this.studentName = sc.next();

        System.out.print("Enter Semester: ");
        this.semester = sc.nextInt();

        System.out.print("Enter CPI: ");
        this.cpi = sc.nextDouble();

        System.out.print("Enter SPI: ");
        this.spi = sc.nextDouble();
    }

    public void displayStudentDetails() {
        System.out.println("Enrollment No: " + this.enrollmentNo);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Semester: " + this.semester);
        System.out.println("CPI: " + this.cpi);
        System.out.println("SPI: " + this.spi);
    }

public static void main(String[] args) {
    Enrollno student1 = new Student();
    student1.getStudentDetails();
    student1.displayStudentDetails();
}
}