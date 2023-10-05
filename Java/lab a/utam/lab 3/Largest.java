import java.util.*;

public class Largest{
	public static void  main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a :");
		int a=sc.nextInt();

		System.out.print("Enter b :");
		int b=sc.nextInt();

		System.out.print("Enter c :");
		int c=sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.print(" largest number is =" +a);
			}
			else{
				System.out.print("largest number is =" +c);
			}
		}
		else{
			if(b>c){
				System.out.print(" largest number is =" +b);
			}
			else{
				System.out.print("largest number is =" +c);
			}
		}
	}
}