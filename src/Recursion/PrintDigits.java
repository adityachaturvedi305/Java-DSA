package Recursion;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n%10);
        print(n/10);
    }
}
