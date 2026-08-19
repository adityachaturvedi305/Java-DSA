package Recursion;

import java.util.Scanner;

public class EvenDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print(evenDigits(n));
    }
    public static int evenDigits(int n){
        n = Math.abs(n);
        if(n == 0) return 0;
        int digit = n % 10;
        if(digit % 2 == 0) return 1 + evenDigits(n / 10);
        return evenDigits(n / 10);
    }
}
