package Recursion;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(reverse(n,0));
    }
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10,r*10+(n%10));
    }
}
