package BinarySearch;

import java.util.Scanner;

public class ArrangingCoinsMethod2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long lo = 0, hi = n;
        long ans = 0;

        while (lo <= hi) {
            long k = lo + (hi - lo) / 2;
            long m = k * (k + 1) / 2;

            if (m == n) {
                ans = k;
                break;
            }
            else if (m > n) {
                hi = k - 1;
            }
            else {
                ans = k;
                lo = k + 1;
            }
        }

        System.out.println("Number of complete rows = " + ans);
    }
}
