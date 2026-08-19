package IfElse;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        double n = sc.nextDouble(); // n = 3.1415
        int x = (int)n; // x = 3
        if(n - x == 0) System.out.println("Is an integer");
        else System.out.println("Not an integer");

    }
}
