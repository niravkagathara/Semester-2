class Student {
	int rollno;
	String name;
	static String colleage= "abc";
	static void change (){
		colleage="Diet";
		//rollno=10;
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(rollno+ "" +name+"" +colleage);

	}

}
class Test{
	public static void main (String [] args){
	//			Student.change();
				Student s1=new Student(111,"utam");
				Student s2=new Student(121,"chintan");
				s1.display();
				s2.display();
	}
}