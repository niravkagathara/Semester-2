//WAP to print numbers between two given numbers which is divisible by 2 but not divisible by 3
import java.util.*;
public class DivisibleBy2Not3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number :");
        int a = sc.nextInt();
        System.out.println("enter 2nd number :");
        int b = sc.nextInt();

        for(int i=a ; i<=b ; i++){
            if(i%2==0 && i%3!=0){
               System.out.println(i);
            }
        }
    }
    }