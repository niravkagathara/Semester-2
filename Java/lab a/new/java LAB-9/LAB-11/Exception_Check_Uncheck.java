//WAP to demonstrate checked and unchecked exceptions.
import java.util.*;

class A extends Thread
{
		//Thread t;
			A(){
				start();

			}

			public void run()
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println("Exception :: "+e.toString());
				}
			}
	
}
class Exception_Check_Uncheck
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		A a=new A();
	
			System.out.print("Enter Size of Array :: ");
			int size=sc.nextInt();
			int a1[]=new int[5];	
		try
		{
			for (int i=0;i<=a1.length;i++)
			{
				System.out.print("Enter Number :: ");
				a1[i]=sc.nextInt();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception ::  "+e.toString());
		}
		

	}	
}