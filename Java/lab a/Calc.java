//WAP to make a Simple Calculator using switch...case
import java.util.*;
public class Calc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operation(+,-,*,/) :");
        char c = sc.next().charAt(0);
        System.out.println("enter first value :");
        double a = sc.nextDouble();
        System.out.println("enter second value :");
        double b = sc.nextDouble();
      
        switch(c){
           case '+':
           System.out.println("summation is "+(a+b));
           break;
            case '-':
           System.out.println("substraction is "+(a-b));
           break;
            case '*':
           System.out.println("multiplication is "+(a*b));
           break;
            case '/':
           System.out.println("division is "+(a/b));
           break;
           default:
            System.out.println("please enter a valid operation");
        }
    }
}