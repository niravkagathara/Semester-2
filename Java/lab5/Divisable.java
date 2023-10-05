//WAP to accept n numbers in an array. Display the sum of all the numbers which are divisible by either 3 or 5.

import java.util.*;
public class Divisable{
	public static Scanner sc;
	public static void main(String[] args){
		int Size, i;
		int sum=0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();
		int [] a = new int[Size];
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++){
			a[i] = sc.nextInt();
		}
		for(i = 0; i < Size; i++){
			if(a[i]%3==0 || a[i]%5==0)
			{
				sum+=a[i];
			}
		}
		System.out.print("Sum is : "+sum);
	}
}