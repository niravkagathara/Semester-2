//. WAP to check whether the given number is positive or negative.
import java.util.*;

public class Positive1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter num check num positive or negative");
        int n = s.nextInt();
        if (n < 0) {
            System.out.println(n + "Number is negative");
        } else if (n > 0) {
            System.out.println(n + "Number is positive");
        } else {
            System.out.println("Invalide");
        }
    }
}
