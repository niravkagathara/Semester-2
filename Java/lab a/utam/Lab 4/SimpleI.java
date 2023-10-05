import java.util.*;

public class SimpleI{
	public static void main (String [] args ){
		Scanner sc=new Scanner (System.in);

		System.out.print("Enter principale amount :");
		double p=sc.nextInt();

		System.out.print("Enter rate :");
		double r=sc.nextInt();

		System.out.print("Enter time :");
		double t=sc.nextInt();
		SimpleI sii=new SimpleI();

		System.out.println(sii.si(p,r,t));
	}

 double si(double p,double r,double t){	
		double ans=(p*r*t)/100;

		return ans;
	}
}