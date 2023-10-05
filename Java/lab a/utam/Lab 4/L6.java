import java.util.*;

public class L6{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		int a,b,i;

		System.out.print("Enter number a : ");
		a=sc.nextInt();
		System.out.print("Enter number b : ");
		b=sc.nextInt();

		L6 gc= new L6();
		gc.gcd(a,b);
	}

	void gcd(int a,int b){
		int i,max=0,j;	
		for(i=1;i<a;i++){
			if(a%i==0){
				for(j=i;j<b;j++){
					if(j%i==0){

						if(max<i){
							max=i;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
