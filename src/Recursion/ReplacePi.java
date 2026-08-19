package Recursion;

import java.util.Scanner;

public class ReplacePi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(replacePi(s,"","3.14",0));
    }
    static String replacePi(String s, String ans, String k, int idx) {
        if(idx == s.length()) return ans;
        if(idx < s.length()-1 && s.charAt(idx) == 'p' && s.charAt(idx+1) == 'i') return replacePi(s, ans+k, k, idx+2);
        return replacePi(s, ans+s.charAt(idx), k, idx+1);
    }
}
