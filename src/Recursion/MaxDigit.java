package Recursion;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(maxDigit(n));
    }
    public static int maxDigit(int n){
        if(n == 0) return 0;
        return Math.max(n%10,maxDigit(n/10));
    }
}
