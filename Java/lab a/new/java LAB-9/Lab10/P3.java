import java.util.*;
abstract class Vechicle
{
	abstract void  display();
}
class Car extends Vechicle
{
	public void display()
	{
		System.out.println("Car has good engine");
	}
}
class Truck extends Vechicle
{
	public void display()
	{
		System.out.println("Truck has bad engine");
	}
}
class P3
{
	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		Truck t = new Truck();
		t.display();
	}
}
output:
Car has good engine
Truck has bad engine