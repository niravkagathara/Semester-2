import java.util.*;

public class Per{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a :");
		int a=sc.nextInt();

		System.out.print("Enter b :");
		int b=sc.nextInt();

		System.out.print("Enter c :");
		int c=sc.nextInt();

		System.out.print("Enter d :");
		int d=sc.nextInt();

		System.out.print("Enter e :");
		int e=sc.nextInt();

		Double pr= (((a+b+c+d+e)*100)/500.0);

		if(pr<35){
			System.out.print("Student is fail =" +pr);

		}
		else if(pr>35 && pr<45){
			System.out.print("Student is pass =" +pr);
		}
		else if(pr>45 && pr<60){
			System.out.print("Student is Second class =" +pr);
		}
		else if(pr>60 && pr<70){
			System.out.print("Student is First class =" +pr);
		}
		else{
			System.out.print("Student is Distinction =" +pr);
		}

	}
}