package Strings;

import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int c = 0;
        for(int i=0; i <= s.length() - p.length(); i++){
            String sub = s.substring(i, i + p.length());
            if(sub.equals(p)) c++;
        }
        System.out.println(c);
    }
}
