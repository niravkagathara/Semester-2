//WAP to convert temprature from fehrnheit to Celsius.
import java.util.*;

public class FintoC{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of F: ");
		int f = s.nextInt();
		float c;
		c=(float)5/9*(f-32);
		System.out.print(c);
	}
}