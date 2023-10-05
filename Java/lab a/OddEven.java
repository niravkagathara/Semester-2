import java.util.*;
public class OddEven{
    public static void main( String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" \n enter a number 1 :");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("\n number is even");
        }
        else{
                  System.out.println("\n number is odd");
        }
    }
}