package Recursion;

import java.util.Scanner;

public class RemoveDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(removeDigit(n,k));
    }

    private static int removeDigit(int n, int k) {
        if(n==0) return 0;
        if(n%10==k) return removeDigit(n/10,k);
        else return removeDigit(n/10,k)*10+(n%10);
    }
}
