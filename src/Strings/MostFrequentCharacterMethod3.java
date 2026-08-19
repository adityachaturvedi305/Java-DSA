package Strings;

import java.util.Scanner;

public class MostFrequentCharacterMethod3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String s = sc.nextLine().toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int idx = ch - 'a';
                freq[idx]++;
            }
        }
        int maxFreq = 0;
        char ans = 'a';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }
        System.out.println("Most frequent character: " + ans);
    }
}
