abstract class pen{
	abstract void write();
	abstract void refill();
}
class cello extends pen{
	public void write(){
		System.out.println("cello write");
	}
	public void refill(){
		System.out.println("cello refill");
	}
}
class pinlong extends pen{
	public void write(){
		System.out.println("pinlong write");
	}
	public void refill(){
		System.out.println("pinlong refill");
	}
}
class sparkwe extends pen{
	public void write(){
		System.out.println("sparker wreite");
	}
	public void refill(){
		System.out.println("sparker refill");
	}
}
class PenAbstract{
	public static void main(String[] args) {
		cello ce = new cello();
		ce.write();
		ce.refill();
		pinlong pi = new pinlong();
		pi.write();
		pi.refill();
		sparkwe sp = new sparkwe();
		sp.write();
		sp.refill();
	}
}