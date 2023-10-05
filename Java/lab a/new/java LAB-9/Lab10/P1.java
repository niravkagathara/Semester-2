import java.util.*;
abstract class Pen 
{
	abstract  void write();
	abstract void refill();

}
class Cello extends Pen
{
	public void write()
	{
		System.out.println(" Cello pen write");
	}
	public void refill()
	{
		System.out.println("Cello pen refill");
	}
}
class Natural extends Pen
{
	public void write()
	{
		System.out.println("Natural pen write");
	}
	public void refill()
	{
		System.out.println("Natural pen refill");
	}
}
class P1
{
	public static void main(String[] args) {
		Cello c = new Cello();
		c.write();
		c.refill();
		Natural n = new Natural();
		n.write();
		n.refill();
	}
}
output:
Cello pen write
Cello pen refill
Natural pen write
Natural pen refill