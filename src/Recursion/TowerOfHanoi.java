package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        hanoi(n,'A','B','C');
    }
    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        // n-1 disks from A to B via C
        hanoi(n-1, a, c, b);
        // largest from A to C
        System.out.println(a +" --> "+ c);
        // n-1 disks from B to C via A
        hanoi(n-1, b, a, c);
    }

}
