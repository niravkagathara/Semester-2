import java.util.*;
class Shape
{
	String name;
	String color;
	void shape(){
		System.out.println("Inside Shape Class");
	}
}
class Circle extends Shape
{
	double radius;
	double pi=3.14;
	void calCircleArea(double r){
		System.out.println("Area Of Circle :"+pi*r*r);
	}
}
class Triangle extends Shape
{
	double length;
	double width;
	void calTriArea(double l,double w){
		System.out.println("Area Of Rectangle :"+l*w);
	}
}
class Square extends Shape
{
	double heigth;
	double width;
	void calSqrArea(double h,double a){
		System.out.println("Area Of Square :"+h*a);
	}
}
class ShapeDemo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Radius :");
		double r=sc.nextDouble();
		Circle c=new Circle();
		c.calCircleArea(r);

		System.out.println("Enter Length :");
		double l=sc.nextDouble();
		System.out.println("Enter Width :");
		double w=sc.nextDouble();
		Triangle t=new Triangle();
		t.calTriArea(l,w);
		
		System.out.println("Enter Height :");
		double h=sc.nextDouble();
		System.out.println("Enter Width :");
		double a=sc.nextDouble();
		Square s=new Square();
		s.calSqrArea(h,w);
	}
}