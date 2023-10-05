interface Transport{
  void deliver();
  void notDeliver();
}

abstract class Animal{
  // void deliver(){}
}

class Tiger extends Animal{}

class Camel extends Animal implements Transport{
  public void deliver(){
    System.out.println("Camel delivered");
  }
  public void notDeliver(){
    System.out.println("Camel NOT delivered");
    System.out.println();
  }
}

class Deer extends Animal{}

class Donkey extends Animal implements Transport{
  public void deliver(){
    System.out.println("Donkey delivered");
  }
  public void notDeliver(){
    System.out.println("Donkey NOT delivered");
    System.out.println();
  }
}

public class L3{
  public static void main(String[] args) {
     Animal[] a = new Animal[4];
     a[0]= new Tiger();
     a[1]= new Camel();
     a[2]= new Deer();
     a[3]= new Donkey();

    for(Animal animal : a){
      if(animal instanceof Transport){
        Transport transport  = (Transport) animal;
        transport.notDeliver();
        transport.deliver();
      }
    }
  }
}

