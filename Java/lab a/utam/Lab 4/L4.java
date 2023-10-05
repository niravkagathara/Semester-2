import java.util.*;

public class L4{
	public static void main (String [] args){
		Scanner sc=new Scanner (System.in);

		System.out.print("ENter number n : ");
		int n=sc.nextInt();

		L4 prime=new L4();
		int ans=prime.check(n);
		System.out.println(ans);
	}

	int check(int n){
		int i,co=0;
		for(i=2;i<n;i++){
			if(n%i==0){
				co++;
				break;
			}
		}
		if(co==0){
			return 1;
		}
		else{
			return 0;
		}
	}
}