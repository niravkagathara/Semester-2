class A{
	int i,j;
}
class B extends A{
	int m;
	void display(){
		System.out.print("i+j+m="+(i+j+m));
	}	
}
class C extends A{
	int m;
	void display(){
		System.out.print("i+j+m="+(i+j+m));
	}	
}
class HierachicalInheritance{
	public static void main(String[] args) {
		C c=new C();
		c.i=30;
		c.j=21;
		c.m=19;
		c.display();
	}
}

