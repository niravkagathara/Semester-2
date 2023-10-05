import java.util.*;

public class L4{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter number a :");
		int a=sc.nextInt();
		System.out.print("Enter number b :");
		int b=sc.nextInt();

		int i;

		for(i=a;i<=b;i++){
			if((i%2)==0 && (i%3)!=0){
				System.out.println(i);
			}
		}
	}
}