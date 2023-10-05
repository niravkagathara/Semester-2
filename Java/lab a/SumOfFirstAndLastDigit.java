//Find out sum of first and last digit of a given number.
import java.util.*;
public class SumOfFirstAndLastDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        int i=1,sum=0,b=0,n=0;
         b=a%10;
         System.out.println("last digit is =" +b);
         for(i=1;a>10;i++){
            n=a%10;
            a=a/10;
         } 
         if(a<10){
             System.out.println("first digit is ="+a);
              sum=b+a;
         }
        
         System.out.println("sum is ="+sum);
    }
}