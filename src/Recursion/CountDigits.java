package Recursion;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print(digits(n));
    }
    public static int digits(int n){
        n = Math.abs(n);
        if(n < 10) return 1;
        return 1 + digits(n/10);
    }
}
