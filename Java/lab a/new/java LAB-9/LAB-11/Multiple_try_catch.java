//4. WAP for multiple catch with single try

import java.util.*;

class Multiple_try_catch
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter Number1 :: ");
			int num1=sc.nextInt();
			System.out.print("Enter Number2 :: ");
			int num2=sc.nextInt();

			int div=num1/num2;
			System.out.println("Divison :: "+div);

		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divison :: "+ae.toString());
		}
		catch(InputMismatchException im)
		{
			System.out.println("InputMismatchException:: "+im.toString());
		}
		catch(Exception e)
		{
			System.out.println("Exception :: "+e.toString());
		}
		

	}
}