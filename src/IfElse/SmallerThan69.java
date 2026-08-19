package IfElse;

import java.util.Scanner;

public class SmallerThan69 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if (n < 69 && n > -69) System.out.println("True");
        else System.out.println("False");
    }
}
