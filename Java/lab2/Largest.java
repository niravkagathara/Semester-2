//WAP to find out largest number from given three numbers without using Logical Operator.
import java.util.*;

public class Largest {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("enter A");
		int a = Sc.nextInt();
		System.out.print("enter B");
		int b = Sc.nextInt();
		System.out.print("enter C");
		int c = Sc.nextInt();
		
		if (a > b) {
			if (a > c) {
				System.out.print("a is Largest");
			} else {
				System.out.print("c is Largest");
			}
		} else {
			if (b > c) {
				System.out.print("b is Largest");
			} else {
				System.out.print("c is Largest");
			}
		}

	}
}
