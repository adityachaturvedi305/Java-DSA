package Recursion;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reversed = rev(n, 0);
        System.out.println("Palindrome? " + (n == reversed));
    }
    public static int rev(int n, int r){
        if(n == 0) return r;
        return rev(n/10, r*10 + n%10);
    }
}
