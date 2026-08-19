package OOPS;

import java.util.Scanner;

abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rect extends Shape {
    double length, breadth;
    Rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return length * breadth;
    }
}
public class ShapeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Shape c = new Circle(r);
        Shape rec = new Rect(l, b);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + rec.area());
    }
}
