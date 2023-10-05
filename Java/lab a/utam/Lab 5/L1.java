import java.util.*;

public class L1{
	public static void main (String [] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number of array : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		int i,even=0,odd=0;
		for(i=0;i<n;i++){
			System.out.print("enter array element of " +i+ ": ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			System.out.print(a[i]+ ",");
		}
		System.out.println();
		for(i=0;i<n;i++){
			if(a[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System .out.println("Enter element of array in even number is =" +even);
		System .out.println("Enter element of array in odd number is =" +odd);

	}
}    