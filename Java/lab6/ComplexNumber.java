import java.util.*;
 public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;

        return new ComplexNumber(realSum, imaginarySum);
    }

    @Override
    public String toString() {
        String sign = this.imaginary < 0 ? "-" : "+";
        return String.format("%.2f %s %.2fi", this.real, sign, Math.abs(this.imaginary));
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2.5, 3.0);
        ComplexNumber c2 = new ComplexNumber(-1.5, 2.0);
    
        ComplexNumber sum = c1.add(c2);
    
        System.out.println("Complex Number 1: " + c1.toString());
        System.out.println("Complex Number 2: " + c2.toString());
        System.out.println("Sum: " + sum.toString());
    }
}    