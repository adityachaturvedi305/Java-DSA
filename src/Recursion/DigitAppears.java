package Recursion;

import java.util.Scanner;
public class DigitAppears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter digit: ");
        int d = sc.nextInt();
        System.out.print(appearDigits(n,d));
    }
    public static int appearDigits(int n,int digit){
        n = Math.abs(n);
        if(n == 0) return (digit == 0) ? 1 : 0;
        if(n%10 == digit) return 1 + appearDigits(n/10,digit);
        return appearDigits(n/10,digit);
    }
}
