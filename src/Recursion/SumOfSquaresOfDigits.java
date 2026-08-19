package Recursion;

import java.util.Scanner;

public class SumOfSquaresOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        n = Math.abs(n);
        System.out.println("The digits square sum: "+squareDigits(n));
    }
    private static int squareDigits(int n) {
        if(n==0) return 0;
        int digit = n%10;
        return digit*digit+squareDigits(n/10);
    }
}
