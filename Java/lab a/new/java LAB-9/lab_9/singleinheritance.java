class A
{
	protected int i= 30;
}
class B extends A
{
	int j = 20;
	void add(){
		System.out.print("i+j="+(i+j));
	}
	
}
class SingleInheritance
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.add();	
	}
}
