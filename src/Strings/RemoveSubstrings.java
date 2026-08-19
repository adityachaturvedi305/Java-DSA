package Strings;
import java.lang.StringBuilder;
import java.util.Scanner;
public class RemoveSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i <= s.length() - p.length()){
            String sub = s.substring(i, i + p.length());
            if(sub.equals(p)) i += p.length();
            else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        while(i < s.length()){
            ans.append(s.charAt(i));
            i++;
        }
        System.out.println(ans);
    }
}
