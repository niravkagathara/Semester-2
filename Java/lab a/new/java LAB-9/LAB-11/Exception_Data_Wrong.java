//Write a try block to throw an exception when a wrong type of data is keyed in
import java.util.*;
class Exception_Data_Wrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter Value :: ");
			int value=sc.nextInt();
			System.out.print("Value :: "+value);
		}	
		catch(Exception e)
		{
			System.out.println("Exception :: "+e.toString());
		}
	}
}