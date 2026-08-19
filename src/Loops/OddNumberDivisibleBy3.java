package Loops;

import java.util.Scanner;

public class OddNumberDivisibleBy3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i += 2){
            if(i%3==0) System.out.print(i+" ");
        }
    }
}
