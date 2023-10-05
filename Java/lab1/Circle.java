// WAP to calculate Area of Circle.
import java.util.*;

public class Circle{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int r = s.nextInt();
		double pi = 3.14, area;
		area = pi * r * r;
		System.out.print("Area of circle: "+area);
	}
}