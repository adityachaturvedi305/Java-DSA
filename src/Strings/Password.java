package Strings;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String s = sc.next();
        boolean upper = false, lower = false, digit = false;
        if(s.length() >= 6) {
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch >= 'A' && ch <= 'Z') upper = true;
                else if(ch >= 'a' && ch <= 'z') lower = true;
                else if(ch >= '0' && ch <= '9') digit = true;
            }
            if(upper && lower && digit) System.out.println("STRONG");
            else System.out.println("WEAK");
        }
        else System.out.println("WEAK");
    }
}
