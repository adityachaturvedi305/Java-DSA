package Recursion;

import java.util.Scanner;

public class OneToN {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        print(1,n);
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
    }
//    public static void print(int x,int n){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1,n);
//    }
//    public static void print(int x){
//        if(x>n) return;
//        System.out.print(x+" ");
//        print(x+1);
//    }
}
