package Strings;
import java.util.Scanner;
public class FreqEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                int idx = ch - 'a';
                freq[idx]++;
            }
        }
        for(int i=0; i<26; i++){
            char ch = (char)(i+'a');
            if(freq[i]>0) {
                System.out.println(ch +" -> "+ freq[i]);
            }
        }
    }
}
