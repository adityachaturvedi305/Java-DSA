package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatM2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String s = sc.nextLine();
        int[] f = new int[256];
        int i = 0, j = 0, max = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            f[ch]++;
            while (f[ch] > 1) {
                f[s.charAt(i)]--;
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        System.out.println(max);
    }
}
