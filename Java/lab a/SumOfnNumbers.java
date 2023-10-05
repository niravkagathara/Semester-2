// Print sum of 1 to n numbers.
import java.util.*;
    public class SumOfnNumbers{
        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number : ");
            int n= sc.nextInt();
            int i,sum=0;
            for(i=1;i<=n;i++){
               sum=sum+i;
        }
        System.out.println("sum = "+sum);
    }
}
