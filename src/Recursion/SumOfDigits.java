package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("The sum is "+sum(n,0));
    }
    public static int sum(int n,int s){
        if(n==0) return s;
        return sum(n/10,s+n%10);
    }
//    public static int sum(int n){
//        if(n == 0) return 0;
//        return n % 10 + sum(n / 10);
//    }
}
