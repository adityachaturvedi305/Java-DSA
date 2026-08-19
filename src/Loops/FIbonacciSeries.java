package Loops;

import java.util.Scanner;

public class FIbonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        int a=0, b=1;
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
