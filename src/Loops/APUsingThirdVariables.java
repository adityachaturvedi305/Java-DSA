package Loops;

import java.util.Scanner;

public class APUsingThirdVariables {
    public static void main(String[] args){
        //nth term = a + (n-1)d
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        // 2,5,8,11,14
        int a = 2, d = 3;
        for (int i = 1; i <= n ; i++) {
            System.out.print(a+" ");
            a += d;
        }
    }
}
