public class Comand{
	public static void main (String [] args){
		String name=args[0];
		String name2=args[1];
		int i=Integer.parseInt(args[2]);
		int j=Integer.parseInt(args[3]);
		int sum=i+j;

		System.out.println(name);
		System.out.println(name2);
		System.out.println(sum);
	}
}