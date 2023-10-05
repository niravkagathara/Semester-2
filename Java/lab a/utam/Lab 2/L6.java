import java.util.*;

public class L6{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter number a :");
		int a=sc.nextInt();

		int i,ans=1,co=0;

		for(i=2;i<a;i++){
			if(a%i==0){
				co++;
				break;
			}	
		}
		if(co==1){
			System.out.println("this number is not prime =" +a);
		}
		else{
			System.out.println("this number is prime =" +a);	
		}
	}
}