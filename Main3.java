// Base class
class Shape {
    void area() {
        System.out.println("Area method in Shape");
    }
}

// Derived class Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(10, 5);

        c.area();
        r.area();
    }
}
