class Vegetable{
	String name;
	String color;
}
class Potato extends Vegetable{
 Potato(String name,String color){
 	this.name=name;
 	this.color=color;
 }
 public String toString(){
 	return name+" "+color;
 }
}
class Brinjal extends Vegetable{
  Brinjal(String name,String color){
  	this.name=name;
  	this.color=color;
  }
  public String toString(){
 	return name+" "+color;
 }
}
class Tomato extends Vegetable{
 Tomato(String name,String color){
  	this.name=name;
  	this.color=color;
  }
 public String toString(){
 	return name+" "+color;
 }
}
public class Demo{
	public static void main(String [] args){
 Potato p1=new Potato("Potato","skin");
 System.out.println(p1);

 Brinjal p2=new Brinjal("Brinjal","parpul");
 System.out.println(p2);

 Tomato p3=new Tomato("Tomato","red");
 System.out.println(p3);
	}
}