import java.util.*;

public class L3{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n : ");
		int n=sc.nextInt(); 

		L3 fibo=new L3();
		fibo.fibonaci(n);

	}
	void fibonaci(int n) {
		int i,ft=0,nt=1,ans=0;
		for (i=0;i<n;i++){
			System.out.print(ans+ ",");
			ft = nt;
			nt=ans;
			ans=nt+ft;
		
		}
	}
}