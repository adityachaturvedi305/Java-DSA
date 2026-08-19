package Strings;
import java.util.Scanner;
public class LongestPalindromicSubstringM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String sub = s.substring(i, j);
                if(isPalindrome(sub) && sub.length() > ans.length()){
                    ans = sub;
                }
            }
        }
        System.out.println(ans);
    }
    public static boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
