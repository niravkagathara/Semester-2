import java.util.*;

class Student{
	int enrollment_no;
	String name;
	String gender;
	int marks;
	static int count=2;

	Student (int e, String n,String g ,int m){
		enrollment_no=e;
		name=n;
		gender=g;
		marks=m;
	}

	void display (){
		System.out.println(enrollment_no+ " " +name+ " "  +gender+  " "  +marks);
	}
}

class L1{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter en");
		int e=sc.nextInt();

		System.out.print("Enter name");
		String n=sc.next();
		
		System.out.print("Enter gender");
		String g=sc.next();
		
		System.out.print("Enter marks");
		int m=sc.nextInt();

		Student s1=new Student(e,n,g,m);
		s1.display();
	}
}