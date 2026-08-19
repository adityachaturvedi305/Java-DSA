package Loops;

import java.util.Scanner;

public class LCMMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = 0;
        int max = Math.max(a, b);
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
        sc.close();
    }
}
