
/*1. WAP to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance*/
public class HierarchicalDemo{
	public static void main(String[] args) {
		D d1=new D();
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
class D extends B{
	D(){
		System.out.println("From D");
	}
}
