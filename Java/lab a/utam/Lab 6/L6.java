import java.util.*;


class Circle {
	double r;
	double area;
	Circle(double r){
		this.r=r;
	}
	void area (){
		area=(this.r*this.r*3.14);
	}
	void display (){
		System.out.print("area of circle");
		System.out.println(area);
	}
}

public class L6{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radious :");
		double r=sc.nextDouble();

		Circle s= new Circle(r);
		s.area();
		s.display();

	}
}