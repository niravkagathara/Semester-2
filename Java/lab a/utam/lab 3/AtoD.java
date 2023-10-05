import java.util.*;

public class AtoD{
	public static void  main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter area : ");
		Double area=sc.nextDouble();
		Double dia=((Math.sqrt(area/3.14))*2);
		System.out.println("diameter is ="+dia);
	}
}