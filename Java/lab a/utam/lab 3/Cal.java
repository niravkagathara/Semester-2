import java.util.*;

public class Cal{
	public static void  main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a :");
		double a=sc.nextDouble();


		System.out.print("Enter b :");
		double b=sc.nextDouble();

		double ans;
		System.out.println("Enter i is 1 for add");
		System.out.println("Enter i is 2 for subs");
		System.out.println("Enter i is 3 for mul");
		System.out.println("Enter i is 4 for div");

		System.out.print("Enter i :");
		int i=sc.nextInt();
		switch(i){
			case 1:ans=a+b;
				System.out.print("Addition is =" +ans);
				break;
			case 2:ans=a-b;
				System.out.print("Subtraction is =" +ans);
				break;
			case 3:ans=a*b;
				System.out.print("Multiplication is =" +ans);
				break;
			case 4:ans=a/b;
				System.out.print("Division is =" +ans);
				break;

		}
	}
}