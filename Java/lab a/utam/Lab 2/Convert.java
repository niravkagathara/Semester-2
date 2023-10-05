import java.util.*; 
public class Convert{
	public static void main (String [] args){
		Scanner s=new Scanner(System.in);
		double w=s.nextDouble();
		double h=s.nextDouble();

		double f=0.0;
		System.out.println("Enter what to do: ");
		int i=s.nextInt();
		switch(i){
			case 1:f=w*3.2;
					System.out.print("feet :"+f);
					break;
			case 2:f=w/(h*h);
					System.out.print("BMI :"+f);
					break;
		}
		
	}
}