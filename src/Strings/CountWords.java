package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int count = 1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) count++;
        }
        System.out.println(count);
    }
}
