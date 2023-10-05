class Base
{
	void show()
	{
       System.out.println("Base clss Show method");
	}
	void printShow()
	{
	   System.out.println("Base clss printShow method");
	}
}
class Derive extends Base
{
	void show()
	{

	   System.out.println("Derive clss Show method");
	}
	void printShow()
	{
	   System.out.println("Derive clss print Show method");
	}
}
class BaseDerive
{
	public static void main(String[] args) 
  {
	Base b=new Base();
	Derive d=new Derive();

	b.show();
    b.printShow();
    d.show();
    d.printShow();
  }
}