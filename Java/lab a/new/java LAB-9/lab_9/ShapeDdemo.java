class Shape{
	double r,base,height,length;
}
class Circle extends Shape{
	double area (double r){
		return(3.14*r*r);
	}
}
class Triangle extends Shape{
	double area(double base, double height){
		return(base*height)/2;
	}
}
class Square extends Shape{
	double area(double length){
		return(length*length);
	}
}

class ShapeDdemo{
	public static void main(String [] args) {
		Circle cr =new Circle();
		Triangle tr=new Triangle();
		Square sq=new Square();

		System.out.println("Area of Circle is"+cr.area(30));
		System.out.println("Area of Triangle is"+tr.area(01,30));
		System.out.println("Area of Square is"+sq.area(19));
		
	}
	
}