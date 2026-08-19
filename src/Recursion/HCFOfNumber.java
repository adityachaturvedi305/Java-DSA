package Recursion;

import java.util.Scanner;

public class HCFOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
        sc.close();
    }
    public static int GCD(int a, int b){
        return helper(Math.min(a,b),Math.max(a,b));
    }
    public static int helper(int a, int b){
        if(a==0) return b;
        return helper(b%a,a); // O(log(min(a,b)))
    }
//    public static int GCD(int a, int b){
//        if(a==0) return b;
//        return GCD(b%a,a);
//    }
}
