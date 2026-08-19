package Strings;

import java.util.Scanner;

public class PrintSumOfNumSubstring {
    public static int sumSubstrings(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                int num = Integer.parseInt(s.substring(i, j));
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int result = sumSubstrings(s);
        System.out.println("Sum of substrings = " + result);
    }
}
