package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");

        int n = sc.nextInt();
        //1,2,4,8,..
        int a = 1, r = 2;
        System.out.print("The GP is --> ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            a *= r;
        }

    }
}
