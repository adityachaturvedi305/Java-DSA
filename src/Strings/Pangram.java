package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        boolean ok = true;
        for(int i=0; i<26; i++) {
            if(freq[i]==0) {
                ok = false;
                break;
            }
        }
        if(ok) System.out.println("PANGRAM");
        else System.out.println("NO PANGRAM");
    }
}
