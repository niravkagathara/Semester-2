import java.util.*;


class Candidate{
	int c_id;
	String c_name;
	int c_age;
	double c_weight;
	double c_height;

void Getcandidatedetails(int id , String n , int age , double w, double h){
	c_id=id;
	c_name=n;
	c_age=age;
	c_weight=w;
	c_height=h;
}

void Dispaly(){
	System.out.println(c_id+ " " +c_name+ " " +c_age+ " "+c_weight+  " " +c_height );
}
}

public class L2{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter id");
		int id=sc.nextInt();

		System.out.print("Enter name");
		String n=sc.next();
		
		System.out.print("age");
		int age =sc.nextInt();
		
		System.out.print("Enter weight");
		double w=sc.nextDouble();

		System.out.print("Enter height");
		double h=sc.nextDouble();		

		Candidate s1=new Candidate ();
		s1.Getcandidatedetails(id,n,age,w,h);
		s1.Dispaly();
	}
}