package Strings;

import java.util.Scanner;

public class AnagramByFreqArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] freq = new int[26];
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']--;
            }
        }
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
