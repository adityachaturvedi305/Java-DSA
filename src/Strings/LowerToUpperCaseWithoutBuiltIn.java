package Strings;

import java.util.Scanner;

public class LowerToUpperCaseWithoutBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            ans += ch;
        }
        System.out.println(ans);
    }
}
