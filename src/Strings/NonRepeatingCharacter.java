package Strings;
import java.util.Scanner;
public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z') freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch-'a']==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No non repeating character");
    }
}
