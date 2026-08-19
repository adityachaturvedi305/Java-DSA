package Recursion;

import java.util.Scanner;

public class RemoveDuplicatesM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] seen = new boolean[26];
        System.out.println(remDup(s, 0, seen));
    }
    private static String remDup(String s, int idx, boolean[] seen){
        if(idx == s.length()) return "";
        char ch = s.charAt(idx);
        if(seen[ch - 'a']) return remDup(s, idx+1, seen);
        seen[ch - 'a'] = true;
        return ch + remDup(s, idx+1, seen);
    }
}
