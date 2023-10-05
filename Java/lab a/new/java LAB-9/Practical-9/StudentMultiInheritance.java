import java.util.Scanner;
class Student_Data
{
	String name;
	int rollno;
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("rollno="+rollno);
	}
	
}
class Marks extends Student_Data
{
	double s1,s2,s3;

}
class Percentage extends Marks
{
      double per,total;
      void result()
      {
      	total=s1+s2+s3;
      	per=(total/300)*100;
      	System.out.println("Result is = "+per);
      }
}
class StudentMultiInheritance
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Percentage p1=new Percentage();
		Marks m1=new Marks();
		Student_Data s=new Student_Data();
		System.out.println("Enter the name");
		s.name=sc.next();
		System.out.println("Enter the name");
		s.rollno=sc.nextInt();
		System.out.println("Enter the 3 Subject marks");
		p1.s1=sc.nextDouble();
		p1.s2=sc.nextDouble();
		p1.s3=sc.nextDouble();

		s.display();
		p1.result();		
	}
}