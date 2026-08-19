package Recursion;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("factorial of negative numbers are not defined");
            return;
        }
        System.out.println(fact(n));
        sc.close();
    }
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
}
