//WAP to count number of even or odd number from an array of n numbers.
import java.util.*;
public class EvenOrOdd{
	public static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i;
		int even = 0, odd = 0;
		sc = new Scanner(System.in);
	 
		System.out.print("Enter Num of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print("Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}		
		System.out.println("\n Total Num of Even Num in this Array = " + even);
		System.out.println("\n Total Num of Odd  Num in this Array = " + odd);
	}
}