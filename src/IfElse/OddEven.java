package IfElse;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
