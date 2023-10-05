public class MultilevelDemo{
	public static void main(String[] args) {
		C c1=new C();
	}
}

class A{
	A(){
		System.out.println("From A");
	}
}
class B extends A{
	B(){
		System.out.println("From B");
	}
}
class C extends B{
	C(){
		System.out.println("From C");
	}
}
