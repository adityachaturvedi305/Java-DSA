package Strings;
import java.util.Scanner;
public class CountEverything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int digits = 0, vowels = 0, consonants = 0, spaces = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') digits++;
            else if(ch == ' ') spaces++;
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
            else if(ch >= 'a' && ch <= 'z') consonants++;
        }
        System.out.println("Digits: "+digits+"\nVowels: "+vowels+"\nConsonants: "+consonants+"\nSpaces: "+spaces);
    }
}
