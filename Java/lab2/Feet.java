//WAP that reads a number in meters, converts it to feet, and displays the result.
import java.util.*;
public class Feet{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter a value of meter:");
        double a=s.nextDouble();
        double feet = a*3.28;
        
        System.out.println(feet);


    }
}