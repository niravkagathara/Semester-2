class Person{
	String name;
	int a=10;
	Person(){
		name="UNdefien";
	}
	Person(String name){
		this.name=name;
	}
	public void displayA(){
		System.out.println(a);
	}
}
class Student extends Person{
	int marks;
	int a=20;
	Student(String name,int marks){
		super(name);
		this.marks=marks;
	}
	public void displayA(){
		System.out.println(a);
	}
	// public String toString(){
	// 	return name+" "+marks;
	// }
}

public class SuperDemo{
	public static void main(String[] args) {
		Student s1=new Student("sanket",90);
		s1.displayA();
		//System.out.println(s1);
	}
}