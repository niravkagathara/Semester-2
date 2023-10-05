/* WAP that prompts the user to input number of calls and calculate the monthly telephone bills as per the following rule:
Minimum Rs. 200 for up to 100 calls.
Plus Rs. 0.60 per call for next 50 calls.
Plus Rs. 0.50 per call for next 50 calls.
Plus Rs. 0.40 per call for any call beyond 200 calls.*/
import java.util.*;
public class TelephoneBill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of calls :");
        int a = sc.nextInt();
        double bill;

        if(a<=100){
            bill = 200;
           System.out.println("bill is "+bill);
        }
        else if(a>100 && a<=150){
            bill = 200 + 0.60 * (a-100);
            System.out.println("bill is "+bill);
        }
        else if(a>150 && a<=200){
            bill = 230 + 0.50 * (a-150);
            System.out.println("bill is "+bill);
        }
        else if(a>200){
            bill = 255 + 0.40 * (a-200);
            System.out.println("bill is "+bill);
        }
    
  }
}
