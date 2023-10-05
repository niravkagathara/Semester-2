public class Override {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.move();
        Animal dog = new Dog();
        dog.move();
    }
}

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}
