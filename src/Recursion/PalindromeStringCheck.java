package Recursion;

import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        isPal(s,0,s.length()-1);
    }
    public static boolean isPal(String s, int i, int j){
        if(i >= j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;
        return isPal(s, i+1, j-1);
    }
}
