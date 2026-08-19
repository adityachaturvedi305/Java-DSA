package Recursion;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Number digits root: "+digitRoots(n));
    }
    private static int digitRoots(int n) {
        if(n<10) return n;
        int sum = helper(n);
        return digitRoots(sum);
    }
    public static int helper(int n){
        if(n == 0) return 0;
        return n % 10 + helper(n / 10);
    }
}
// Another solution of this question we can reuse the same function

/*private static int digitRoots(int n) {
    if(n < 10) return n;

    int sum = sumDigits(n);

    return digitRoots(sum);
}

private static int sumDigits(int n){
    if(n == 0) return 0;
    return n%10 + sumDigits(n/10);
}
 */
