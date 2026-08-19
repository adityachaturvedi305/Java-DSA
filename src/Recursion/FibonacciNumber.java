package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth number : ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
        sc.close();
    }
    public static int fibonacci(int n){
        if(n < 0){
            System.out.println("Fibonacci not defined for negative numbers");
            return -1;
        }
        if(n==0 || n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
