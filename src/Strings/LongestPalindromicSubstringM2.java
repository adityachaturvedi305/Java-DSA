package Strings;
import java.util.Scanner;
public class LongestPalindromicSubstringM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > max){
                max = len;
                start = i - (len - 1)/2;
            }
        }
        System.out.println(s.substring(start, start + max));
    }
    public static int expand(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}
