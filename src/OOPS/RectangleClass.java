package OOPS;

import java.util.Scanner;

class Rectangle{
    double length;
    double breadth;
    Rectangle(){}
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length + breadth);
    }
}
public class RectangleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        Rect r = new Rect(length,breadth);
        System.out.println("Area: " + r.area());
//        System.out.println("Perimeter: " + r.perimeter());
    }
}
