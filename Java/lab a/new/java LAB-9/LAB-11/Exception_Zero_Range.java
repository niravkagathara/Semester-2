//1. WAP to request the user to enter a number between 1 to 5, handle the following exceptions:i. Divide by zero ii. Out of range exception

import java .util.*;

class Exception_Zero_Range
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);

		System.out.print("Enter Value of A :: ");
		int a=sc.nextInt();
		System.out.print("Enter Value of B:: ");
		int b=sc.nextInt();

		try
		{
			int c=a/b;
			System.out.println("Ans :: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception :: You Can't Divide Number By Zero ");
		}

		
		try
		{
			System.out.print("Enter Enrollment Number :: ");
			int en=sc.nextInt();

			System.out.println("Enrollment No :: "+en);
		}
		catch(Exception e)
		{
			System.out.println("Exception :: Out of Range Exception");
		}
		

	}	
}