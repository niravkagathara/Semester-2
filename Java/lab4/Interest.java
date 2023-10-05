//WAP to calculate simple interest using method.
import java.util.*;
public class Interest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Principal amount: ");
		double principal = s.nextDouble();
		System.out.println("Enter the rate of interest: ");
		double rate = s.nextDouble();
		System.out.println("Enter the time period(in year): ");
		double time = s.nextDouble();
		double simpleinterset = calculateSimpleInterest(principal,rate,time);
		System.out.println("simple interest: "+simpleinterset);
	}
	public static double calculateSimpleInterest(double principal,double rate,double time){
		double simpleinterset = (principal * rate * time) / 100;
		return simpleinterset;
	}
}