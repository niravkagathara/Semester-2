import java.util.*; 
public class UdfAdd{
	public static void main (String [] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.print(a);
		System.out.print(b);
		int c=1;
		c=a*b;
		System.out.print(""+a+" * "+b+" ="+c);
		s.close();
	}
}