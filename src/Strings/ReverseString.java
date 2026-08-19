package Strings;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        java.lang.StringBuilder ans = new java.lang.StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
