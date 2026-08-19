package Recursion;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print(countZeros(n));
    }
    public static int countZeros(int n){
        if(n == 0) return 1;  // special case
        return helper(Math.abs(n));
    }
    public static int helper(int n){
        if(n == 0) return 0;
        if(n % 10 == 0) return 1 + helper(n / 10);
        else return helper(n / 10);
    }
}
