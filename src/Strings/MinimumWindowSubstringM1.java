package Strings;
import java.util.Scanner;
public class MinimumWindowSubstringM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String ans = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i, j);
                if(isValid(sub, t)){
                    if(ans.isEmpty() || sub.length() < ans.length()){
                        ans = sub;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    public static boolean isValid(String s, String t){
        int[] freq = new int[256];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        for(char ch : t.toCharArray()){
            if(freq[ch] == 0) return false;
            freq[ch]--;
        }
        return true;
    }
}
