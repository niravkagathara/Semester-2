import java.util.*;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

public static void main(String[] args) {
    Circle circle1 = new Circle(1.0);
    System.out.println("Area: " + circle1.getArea());
    System.out.println("Perimeter: " + circle1.getPerimeter());
}
}
//WAP to create Circle class with area and perimeter function to find area and perimeter of circle.