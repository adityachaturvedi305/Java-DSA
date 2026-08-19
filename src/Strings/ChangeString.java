package Strings;

import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String s = sc.nextLine();
        char ch = s.charAt(0);
        if (ch >= 'a' && ch <= 'z') System.out.println(s.toLowerCase());
        else System.out.println(s.toUpperCase());
    }
}
