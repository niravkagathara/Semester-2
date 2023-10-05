interface Transport{
	void Deliver();
}
abstract class Animal implements Transport{
	abstract void eat();
}
class Tiger extends Animal{
	void eat(){
System.out.println("non veg");
	}
}
class camel extends Animal implements Transport{
void eat(){
System.out.println("veg");
	}
	public void Deliver(){
System.out.println("yes");
	}
} 

public class Demo3{
public static void main(String [] args)
{
	Animal[]a=new Animal[2];

	a[0]=new Tiger();
	a[1]=new camel();
 ((camel)a[1]).Deliver();
}
}