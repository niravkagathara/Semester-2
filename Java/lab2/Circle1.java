//WAP to find a diameter from given area of circle
import java.util.*;


public class Circle1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value Of Area Of Circle :");
        double A = s.nextDouble();
        double r =2*(A / 3.14);
        System.out.println(r);
    }
}