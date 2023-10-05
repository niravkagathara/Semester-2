import java.util.*;


public class L5{
	public static void main (String [] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter i is 1 to circle,2 to triangel,3 to square ");
		int i=sc.nextInt();
		int ans; 
		switch (i){
			case 1 : double r;
					 System.out.print("Enter r : ");
					 r=sc.nextDouble();
					 L5 area= new L5 ();
					 area.circle(r);
					 break;
			case 2 : double a,b;
					 System.out.print("Enter height a : ");
					 a=sc.nextDouble();
					 System.out.print("Enter base b : ");
					 b=sc.nextDouble();
					 L5 tarea= new L5 ();
					 tarea.triangle(a,b);
					 break;
			case 3 : double c;
					 System.out.print("Enter c : ");
					 c=sc.nextDouble();
					 L5 sarea= new L5 ();
					 sarea.square(c);
					 break;

		}
	}

	void circle(double r){
		double ans=r*r*3.14;
		System.out.println(ans);
	}

	void triangle (double a, double b){
		double ans=(a*b)/2;
		System.out.println(ans);
	}

	void square(double a){
		double ans = a*a;
		System.out.println(ans);
	}

}