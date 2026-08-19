package Strings;
import java.util.Scanner;
public class LongestSubstringWithoutRepeatM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i, j);
                if(isUnique(sub)){
                    max = Math.max(max, sub.length());
                }
            }
        }
        System.out.println(max);
    }
    public static boolean isUnique(String s){
        int[] freq = new int[256];
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)] == 1) return false;
            freq[s.charAt(i)]++;
        }
        return true;
    }
}
