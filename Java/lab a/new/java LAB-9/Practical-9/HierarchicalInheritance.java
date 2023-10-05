class A
{
	protected int i;
	int j;
	void showij(){
		System.out.println("inside class A: i="+i+"j="+j);
	}
}
class B extends A
{
	int k;
	void showk(){
		System.out.println("inside class B: k="+k);
	}
	void add_ijk(){
		System.out.println(i+"+"+j+"+"+k+"="+(i+j+k));
	}
}
class C extends B
{
	int m;
	void showm(){
	System.out.println("inside class C:k="+m);
}
	void add_ijm(){
	System.out.println(i+"i"+j+"+"+m+"="+(i+j+m));
	}
}
class HierarchicalInheritance
{
	public static void main(String[] args) {
		A superObjA= new A();
		superObjA.i=10;
		superObjA.j=20;
		superObjA.showij();

		B subObjB= new B();
		subObjB.i=100;
		subObjB.j=200;
		subObjB.k=300;
		subObjB.showk();
		subObjB.add_ijk();

		C subObjC= new C();
		subObjC.i=1000;
		subObjC.j=2000;
		subObjC.m=3000;
		subObjC.showm();
		subObjC.add_ijm();

	}
}