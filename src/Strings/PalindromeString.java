package Strings;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String str = sc.nextLine();
        int i = 0, j = str.length()-1;
        boolean palindrome = true;
        while (i<=j){
            if (str.charAt(i)!=str.charAt(j)){
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(palindrome) System.out.print("Palindrome");
        else System.out.print("Not palindrome");
    }
}
