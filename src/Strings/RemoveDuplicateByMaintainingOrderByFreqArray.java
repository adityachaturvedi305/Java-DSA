package Strings;

import java.lang.StringBuilder;
import java.util.Scanner;

public class RemoveDuplicateByMaintainingOrderByFreqArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 0){
                ans.append(ch);
                freq[ch - 'a']++;   // mark character as visited
            }
        }
        System.out.println(ans);
    }
}
