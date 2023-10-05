public class ShapeDemo {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(10);
        System.out.println("\nArea of circle:" + c1.getArea());
      
        Triangle t1 = new Triangle(20, 10);
        System.out.println("Area of triangle:" + t1.getArea());
      
        Square s1 = new Square(10);
        System.out.println("Area of square:" + s1.getArea());
    }
}

class Shape {
    int var;
}

class Circle extends Shape {
    Circle(int radius) {
        var = radius;
    }

    public double getArea() {
        return Math.PI * var * var;
    }

}

class Triangle extends Shape {
    int height;

    Triangle(int base, int h) {
        var = base;
        height = h;
    }

    public double getArea() {
        return (0.5 * var * height);
    }
}

class Square extends Shape {
    Square(int lenght) {
        var = lenght;
    }

    public int getArea() {
        return var * var;
    }
}