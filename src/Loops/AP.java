package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args){
        //nth term = a + (n-1)d
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        // 2,5,8,11,14
        for (int i = 2; i <= 3*n-1 ; i += 3) {
            System.out.print(i+" ");
        }
    }
}
