import java.util.*;
 public class L1{
 	public static void main(String[] args) {
 	Brinjal s=new Brinjal();
 	s.call();	
 	}
 }

abstract class Vegetable{
 	abstract void call();
 } 

class Brinjal extends Vegetable{
 	String color;
 	String name;
 	Brinjal(){
 		color="purpale";
 		name="brinjal";
 	}
 	void call(){
 		System.out.println(color);
 	}

 }

 class Tomato extends Vegetable{
 	String color;
 	String name;
 	Tomato(){
 		color="Red";
 		name="Tomato";
 	}
 	void call(){
 		System.out.println(color);
 	}
 }

  class Potato extends Vegetable{
 	String color;
 	String name;
 	Potato(){
 		color="red";
 		name="Potato";
 	}
 	void call(){
 		System.out.println(color);
 	}
 }