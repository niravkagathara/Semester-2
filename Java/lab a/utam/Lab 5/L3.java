import java.util.*;

public class L3 {
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter number of array : " );
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for (i=0;i<n;i++){
			System.out.print("Enetr element of array " +i+ ":");
			a[i]=sc.nextInt();
		}

		for (i=0;i<n;i++){
			System.out.print( a[i]+ ",");
		}
		System.out.println();

		System.out.print("Enetr search element : ");
		int sel=sc.nextInt();
		for(i=0;i<n;i++){
			if(a[i]==sel){
				System.out.println("ENter number is array in present " +a[i]+ "&");
				System.out.println("Enter number is presen in array this location " +i);
			}
			else{
				System.out.println("Enetr number is not in array.");
			}
		}
	}
}