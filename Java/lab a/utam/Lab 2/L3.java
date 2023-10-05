import java.util.*;

public class L3{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		double ans=0.0;

		System.out.print("Enter phone calls :");
		int a=sc.nextInt();

		if(a<=100){
			ans=200.00;
			System.out.println("Monthly bill is " +ans);
		}
		else if(a>100 && a<=150){
			ans=200+((a-100)*0.60);
			System.out.println("Monthly bill is " +ans);
		}
		else if(a>150 && a<=200){
			ans=200+((50)*0.60)+((a-150)*0.50);
			System.out.println("Monthly bill is " +ans);
		}
		else {
			ans=200+((50)*0.60)+((50)*0.50)+((a-200)*0.40);
			System.out.println("Monthly bill is " +ans);
		}
	}
}