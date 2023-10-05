import java.util.*;

public class L5{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter number a :");
		int a=sc.nextInt();

		int i,ans=1;

		for(i=1;i<=a;i++){
			ans=ans*i;	
		}
		System.out.println("this number factorial is =" +ans);
	}
}