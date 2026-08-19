package Recursion;

import java.util.Scanner;

public class RemoveCharacterByRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(removeChar(s,"",'a',0));
    }

    private static String removeChar(String s, String ans, char k, int idx) {
        if(idx == s.length()) return ans;
        if(s.charAt(idx) != k) return removeChar(s, ans+s.charAt(idx), k, idx+1);
        return removeChar(s, ans, k, idx+1);
    }

}
