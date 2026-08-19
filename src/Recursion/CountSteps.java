package Recursion;

import java.util.Scanner;

public class CountSteps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(stepCounts(n)+" steps");
    }
    public static int stepCounts(int n) {
        if(n == 0) return 0;
        if(n % 2 == 0) return 1 + stepCounts(n/2);
        else return 1 + stepCounts(n-1);
    }
}
