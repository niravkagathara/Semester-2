import java.util.*;
public class PrimeNumber{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" \n enter a number :");
        int a = sc.nextInt();
        int i,co=0;
        for(i=2;i<a;i++){
           if(a%i==0){
               co++;
           }
        }
        if(co==0){
            System.out.println(" number is prime ");
        }
        else{
             System.out.println(" number is not prime ");
        }
    }
}