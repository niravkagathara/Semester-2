/* WAP to read marks of five subjects. Calculate percentage and print class accordingly. Fail below 35, Pass
Class between 35 to 45, Second Class between 45 to 60, First Class between 60 to 70, Distinction if more than 
70 */
import java.util.*;
public class Result{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first marks :");
        double a = sc.nextDouble();
         System.out.println("enter second marks :");
        double b = sc.nextDouble();
         System.out.println("enter third marks :");
        double c = sc.nextDouble();
         System.out.println("enter fourth marks :");
        double d = sc.nextDouble();
         System.out.println("enter fifth marks :");
        double e = sc.nextDouble();
        double result;
      
        result = (a+b+c+d+e)/5;
        if(result<35){
             System.out.println("you fail");
        }
         else if(result<45 && result>=35){
              System.out.println("your class is pass");
        } 
         else if(result<60 && result>=45){
              System.out.println("your class is second class");
        }
        else if(result<=70 && result>=60){
              System.out.println("your class is first class");
        }
        else{
             System.out.println("your class is distinction");
        }  
    }
}