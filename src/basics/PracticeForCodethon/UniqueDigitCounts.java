package basics.PracticeForCodethon;

import java.util.Scanner;

public class UniqueDigitCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            int remaining = n / 10;
            boolean isUnique = true;
            while (remaining > 0) {
                if (digit == remaining % 10) {
                    isUnique = false;
                    break;
                }
                remaining /= 10;
            }
            if (isUnique) count++;
            n /= 10;
        }
        System.out.println(count);
        sc.close();
    }
}
