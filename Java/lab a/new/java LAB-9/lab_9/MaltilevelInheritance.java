class A{
	int i,j;
}
class B extends A{
	int m;
	void display(){
		System.out.print("i+j+m="+(i+j+m));
	}
}
class C extends B{
	int l;
	void display(){
		System.out.print("i+j+m+l="+(i+j+m+l));
	}
}
class MaltilevelInheritance{
	public static void main(String[] args) {
		C c=new C();
		c.i=30;
		c.j=21;
		c.m=19;
		c.l=30;
		c.display();	
	}
}


