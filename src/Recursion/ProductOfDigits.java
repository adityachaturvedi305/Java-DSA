package Recursion;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print(product(n));
    }
    public static int product(int n){
        n = Math.abs(n);
        if(n < 10) return n;
        return (n % 10) * product(n / 10);
    }
}
