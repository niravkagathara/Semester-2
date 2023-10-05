import java.util.*;
abstract class A
{
	abstract void display();
}
class B extends A
{
	public void display()
	{
		System.out.print("Call me from B");
	}
}
class P2
{
	public static void main(String[] args) {
		B b1 = new B();
		b1.display();
	}
}
output:
Call me from B