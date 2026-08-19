package IfElse;

import java.util.Scanner;

public class PointsXY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point x --> ");
        int x = sc.nextInt();
        System.out.print("Enter point y --> ");
        int y = sc.nextInt();
        if (x == 0 && y == 0) System.out.println("Origin");
        else if(x == 0) System.out.println("x axis");
        else if(y == 0) System.out.println("y axis");
        else if(x>0 && y>0) System.out.println("1st quadrant");
        else if(x<0 && y>0) System.out.println("2nd quadrant");
        else if(x>0 && y<0) System.out.println("3rd quadrant");
        else if(x<0 && y<0) System.out.println("4th quadrant");


    }
}
