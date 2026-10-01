abstract class Shape {
    String color = "Red";

    Shape() {
        System.out.println("Shape constructor");
    }
    abstract double area();
    void display() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    double area() {
        return length * breadth;
    }
}
public class TestAbstract {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 3);

        System.out.println("Circle area: " + s1.area());
        s1.display();

        System.out.println("Rectangle area: " + s2.area());
        s2.display();
    }
}
