abstract class A{
	abstract void display();
}
class B extends A{
	void display(){
		System.out.println("call me from B");
	}
}
class AbstractClass{
	public static void main(String[] args) {
		B b = new B();
		b.display();		
	}
}