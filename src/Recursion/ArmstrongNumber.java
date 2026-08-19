package Recursion;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        n = Math.abs(n);
        System.out.println(isArmstrong(n, digitCount(n)));
    }
    public static boolean isArmstrong(int n,int count) {
        return sumArmstrong(n,count) == n;
    }
    public static int sumArmstrong(int n,int count){
        if(n==0) return 0;
        return power(n%10,count)+sumArmstrong(n/10,count);
    }
    public static int power(int a , int b){
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
    public static int digitCount(int n){
        if(n==0) return 1;
        return 1 + digitCount(n/10);
    }
}
