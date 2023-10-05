import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n,i=1,count=0;
        n=s.nextInt();
        while (i<=n)
    {
        
        if(n%i==0){
            count++;
        }i++;
    }
    if (count==2)
    {
        System.out.printf("num is prime:");
        /* code */
    }
    else{
        System.out.printf("num is not prime:");
    }
}
}