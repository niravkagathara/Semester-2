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
public class SingleDemo{
	public static void main(String[] args) {
		B b1=new B();
	}
}