import java.util.*;
public class Employee {
    
    private int Employee_ID;
    private String Employee_Name;
    private String Designation;
    private int Age;
    private double Salary;

    // Constructor to initialize the data members
    public Employee(int Employee_ID, String Employee_Name, String Designation, int Age, double Salary) {
        this.Employee_ID = Employee_ID;
        this.Employee_Name = Employee_Name;
        this.Designation = Designation;
        this.Age = Age;
        this.Salary = Salary;
    }

    // Getter method to get the employee details
    public void GetEmployeeDetails() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Employee ID:");
            this.Employee_ID = sc.nextInt();
            System.out.println("Enter the Employee Name:");
            this.Employee_Name = sc.next();
            System.out.println("Enter the Designation:");
            this.Designation = sc.next();
            System.out.println("Enter the Age:");
            this.Age = sc.nextInt();
            System.out.println("Enter the Salary:");
            this.Salary = sc.nextDouble();
        }
    }

    // Method to display the employee details
    public void DisplayEmployeeDetails() {
        System.out.println("Employee ID: " + this.Employee_ID);
        System.out.println("Employee Name: " + this.Employee_Name);
        System.out.println("Designation: " + this.Designation);
        System.out.println("Age: " + this.Age);
        System.out.println("Salary: " + this.Salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(0, "", "", 0, 0.0);
        emp1.GetEmployeeDetails();
        emp1.DisplayEmployeeDetails();
    }
}
/*WAP with following specifications:
Class Name: Employee
Data Members: Employee_ID, Employee_Name, Designation, Age, Salary
Member Functions: GetEmployeeDetails () and DisplayEmpolyeeDetails ().*/
