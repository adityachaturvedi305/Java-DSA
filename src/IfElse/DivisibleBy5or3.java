package IfElse;

import java.util.Scanner;

public class DivisibleBy5or3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n % 5 == 0 || n % 3 == 0) System.out.println("Divisible by 5 or 3");
        else System.out.println("Not divisible by 5 or 3");
    }
}
