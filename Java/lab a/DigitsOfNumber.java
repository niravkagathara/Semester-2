//Print digits of given number.
import java.util.*;
public class DigitsOfNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a = sc.nextInt();
        int i=1,n=0;

        for(i=1;a>10;i++){
            n=a%10;
            a=a/10;
                      System.out.println(i+"th digit is =" +n);
        }
           if(a<10){
                          System.out.println("first digit is =" +a);
            }
    }
    }