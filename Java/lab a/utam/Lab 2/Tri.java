import java.util.*;

public class Tri{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter triangle side :");
		System.out.print("Enter side a :");
		int a=sc.nextInt();

		System.out.print("Enter side b :");
		int b=sc.nextInt();

		System.out.print("Enter side c :");
		int c=sc.nextInt();

		if((a==b || a==c) && b!=c){
			System.out.println("This triangle is isosceles.");
		}
		else if(a==b && a==c && b==c ){
			System.out.println("This triangle is equilateral.");
		}
		else if(a!=b && a!=c && b!=c){
			System.out.println("This triangle is scalene.");

			if(a>b){
					if(a>c){
						if((a*a)==(b*b)+(c*c)){//a is largest//
							System.out.println("This triangle is right-angled.");
						}
						else{
							System.out.println("This triangle is not right-angled.");
						}
					}
					else{//c is largest//
						if((c*c)==(a*a)+(b*b)){
							System.out.println("This triangle is right-angled.");
						}
						else{
							System.out.println("This triangle is not right-angled.");
						}
					}
				}
			else{
				if(b>c){//b is largest//
					if((b*b)==(a*a)+(c*c)){
						System.out.println("This triangle is right-angled.");
					}
					else{
						System.out.println("This triangle is not right-angled.");
					}
				}
				else{//c is largest//
					if((c*c)==(a*a)+(b*b)){
						System.out.println("This triangle is right-angled.");
						}
						else{
							System.out.println("This triangle is not right-angled.");
						}
				}
			}
		}
		else{
			System.out.println();
		}
}
}