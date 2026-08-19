package Recursion;

import java.util.Scanner;

public class RemoveZeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Removed zero number: "+removeZeroes(n));
    }

    public static int removeZeroes(int n) {
        if(n == 0) return 0;
        int digit = n % 10;
        if(digit == 0) return removeZeroes(n/10);
        else return removeZeroes(n/10) * 10 + digit;
    }
}
