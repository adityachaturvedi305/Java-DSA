package IfElse;

import java.util.Scanner;

public class AreaAndPerimeterRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter breadth : ");
        int b = sc.nextInt();
        double area = l * b;
        double perimeter = 2*(l+b);
        if(area > perimeter) System.out.println("Area is greater");
        else System.out.println("No area is not greater");
    }
}
