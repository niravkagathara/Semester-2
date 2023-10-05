import java.util.*;

public class L2{
	public static void main (String [] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Numberof array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,sum=0;
		for(i=0;i<n;i++){
			System.out.print("Enter array element of " +i+ ": ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]+ ",");
		}

		System.out.println();
		for(i=0;i<n;i++){
			if(a[i]%3==0 || a[i]%5==0){
				sum=sum+a[i];
			}
		}
		System.out.println("divisible by either 3 or 5 sum is =" +sum);
	}
}