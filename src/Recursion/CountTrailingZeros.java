package Recursion;

import java.util.Scanner;

public class CountTrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n == 0) System.out.println(1);
        else System.out.println(trailingZeros(n));
    }
    public static int trailingZeros(int n){
        if(n == 0) return 0;
        if(n % 10 != 0) return 0;
        return 1 + trailingZeros(n / 10);
    }
}
