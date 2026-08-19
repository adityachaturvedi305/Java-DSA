package IfElse;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b) System.out.println("Valid Triamgle");
        else System.out.println("Invalid triangle");
    }


}
