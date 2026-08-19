package Strings;

import java.util.Scanner;

public class LongestSubstringKChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String s = sc.next();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int[] f = new int[256];
        int i = 0, j = 0, max = 0, d = 0;
        while (j<s.length()){
            f[s.charAt(j)]++;
            if(f[s.charAt(j)]==1) d++;
            while (d>k){
                f[s.charAt(i)]--;
                if(f[s.charAt(i)] == 0) d--;
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        System.out.println(max);
    }
}
