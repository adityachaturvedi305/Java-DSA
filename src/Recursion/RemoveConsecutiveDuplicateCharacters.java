package Recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(removeCons(s,0));
    }

    static String removeCons(String s, int idx) {
        if(idx == s.length()-1) return s.charAt(idx) + "";
        if(s.charAt(idx) == s.charAt(idx+1)) return removeCons(s, idx+1);
        return s.charAt(idx) + removeCons(s, idx+1);
    }
}
