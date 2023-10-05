import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        Prime n=new Prime();
        int ans=n.cheak(a);
        if(ans==1){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
    int cheak(int a){
        int i;
        for(i=2;i<=a-1;i++){
            if(a%i==0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}