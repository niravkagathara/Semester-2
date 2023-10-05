/*Create a class “Rectangle” that would contain length and width as an instance variable and count as a static variable. Define constructors [constructor overloading (default,
parameterized and copy)] to initialize variables of objects. Define methods to find area and to display variables’ value of objects which are created. [Note: define initializer
block, static initializer block and the static variable and method. Also demonstrate the sequence of execution of initializer block and static initialize block]*/
import java.util.*;
class Rectangle{
	int height;
	int width;
	static int count=0;

	Rectangle(){
		int height;
		int width;
		count++;

	}
	Rectangle(int height,int width){
		this.height=height;
		this.width=width;
		count++;
	}
		Rectangle(Rectangle r){
			height=r.height;
			width=r.width;
			count++;
		}
		public void area(){
			System.out.println("Area number is = "+count);
			System.out.println("Area is ="+(height*width));
			count++;
		}
}
public class Rectangledemo{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.height=20;
		r1.width=10;

		r1.area();
		Rectangle r2=new Rectangle(30,10);
		r2.area();
		Rectangle r3=new Rectangle(r2);
		r3.area();
	}
}
