/*.Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener along with mouseClicked(), mousePressed(),
mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased()
methods. WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.*/
public class L2{
	public static void main(String[] args) {
		Eventdetail e=new Eventdetail();
		e.performEvent();
		e.mouseClicked();
		e.mousePressed();
		e.mouseReleased();
		e.mouseMoved();
		e.mouseDragged();
		e.keyPressesd();
		e.keyReleased();
	}
}

interface EventListener{
	void performEvent();
}

interface MouseListener extends EventListener{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}

interface KeyListener extends EventListener{
	void keyPressesd();
	void keyReleased();
}

class Eventdetail  implements MouseListener,KeyListener{
	public void mouseClicked(){
		System.out.println("utam");		
	}
	public void mousePressed(){
		System.out.println("utam");
	}
	public void mouseReleased(){
		System.out.println("utam");
	}
	public void mouseMoved(){
		System.out.println("utam");
	}
	public void mouseDragged(){
		System.out.println("utam");
	}
	public void keyPressesd(){
		System.out.println("utam");
	}
	public void keyReleased(){
		System.out.println("utam");
	}
	public void performEvent(){
		System.out.println("utam");		
	}
}


/*1. The abstract Vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a program that demonstrates how to establish this class hierarchy. Declare
one instance variable of type String that indicates the color of a vegetable. Create and display instances of these objects. Override the toString() method of object to return a
string with the name of vegetable and its color.*/

public class L1{
	public static void main(String[] args) 
	{
		Potato p1 = new Potato("Potato","skin");
		System.out.println(p1);	
		Brinjal p2 = new Brinjal("Brinjal","purple");
		System.out.println(p2);	
		Tomato p3 = new Tomato("Tomato","red");
		System.out.println(p3);	
	}
}
abstract class Vegetable{
	String name;
	String color;
}
class Potato extends Vegetable{
	Potato(String name, String color){
		this.name = name;
		this.color = color;
	}
	public String toString(){
		return name+" "+color;
	}
}
class Brinjal extends Vegetable{
	Brinjal(String name, String color){
		this.name = name;
		this.color = color;
	}
	public String toString(){
		return name+" "+color;
	}
}
class Tomato extends Vegetable{
	Tomato(String name, String color){
		this.name = name;
		this.color = color;
	}
	public String toString(){
		return name+" "+color;
	}
}