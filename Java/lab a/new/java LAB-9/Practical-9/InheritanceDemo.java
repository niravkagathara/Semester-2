class A
{
	protected int i;
	int j;
	void showij(){
		System.out.println("i="+i+" j="+j);
	}
}
class B extends A
{
	int k;
	void showk(){
		System.out.println("k="+k);
	}
	void add(){
		System.out.println("i+j+k="+(i+j+k));
	}
}
class InheritanceDemo
{
	public static void main(String[] args) {
		
		A superObjA= new A();
		superObjA.i=10;
		superObjA.j=20;

		B subObjB= new B();
		subObjB.k=30;

		superObjA.showij();
		subObjB.showk();
		subObjB.add();
	}
}