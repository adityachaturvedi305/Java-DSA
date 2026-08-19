package IfElse;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int aditya = (n>=0) ? 100 : 0;

        System.out.println(aditya);
    }
}
