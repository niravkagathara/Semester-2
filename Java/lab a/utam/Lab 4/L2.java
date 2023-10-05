import java.util.*;

public class L2{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter a : ");
		int a=sc.nextInt();
		System.out.print("enter b : ");
		int b=sc.nextInt();
		L2 max= new L2();
		max.lg(a,b);
	}
	void lg(int a,int b){
		if(a>b){
			System.out.println("a is max.");
		}
		else{
			System.out.println("b is max.");
		}
	}
}