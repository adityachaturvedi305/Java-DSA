package Recursion;

import java.util.Scanner;

public class AToPowerB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter power : ");
        int b = sc.nextInt();
        if(b<0){
            System.out.print("Please enter positive power");
            return;
        }
        System.out.println(power(a,b));
        sc.close();
    }
    public static int power(int a , int b){
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
//    public static int power(int a , int b){
//        if(b==0) return 1;
//        return a*power(a,b-1);
//    }
}
