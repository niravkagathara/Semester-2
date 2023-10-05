//WAP that calculates area of circle, triangle and square using method overloading
import java.util.Scanner;

class Area {
    static double area(double radius) {
        return Math.PI * radius * radius;
    }
  
    static double area(double base, double height) {
        return 0.5 * base * height;
    }
  
    static double area1(double side) {
        return side * side;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Area of Square");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = in.nextDouble();
                System.out.println("Area of Circle: " + area(radius));
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = in.nextDouble();
                System.out.print("Enter height: ");
                double height = in.nextDouble();
                System.out.println("Area of Triangle: " + area(base, height));
                break;
            case 3:
                System.out.print("Enter side: ");
                double side = in.nextDouble();
                System.out.println("Area of Square: " + area(side));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
