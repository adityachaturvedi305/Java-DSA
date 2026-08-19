package basics.PracticeForCodethon.MayankSirQues;

import java.util.Scanner;

public class PrimeRangeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        for (int i = start; i <= end; i++) {
            if (i < 2) continue; // 0 and 1 are not prime
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        sc.close();
    }
}
