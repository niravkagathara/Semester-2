import java.util.*;

public class PoNe{
	public static void  main (String [] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0){
			System.out.println("Number is nagative");

		}
		else if(a>0){
			System.out.println("Number is posittive");

		}
		else{
			System.out.println("Number is 0");
		}
	}
}