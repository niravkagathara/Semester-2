import java.util.*;

public class VorC{
	public static void  main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter char :");
		char ch=sc.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
			System.out.println("Enter char is vowel ");
		}
		else{
			System.out.println("Enter char is Consonants");
		}
	}
}