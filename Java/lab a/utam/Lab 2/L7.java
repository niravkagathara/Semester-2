import java.util.*;

public class L7{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter number a :");
		int a=sc.nextInt();

		int i,ans=1,co;
		i=a;
		while(i>0){
			ans=i%10;
			i=i/10;
			System.out.print(ans);
		}
	}
}