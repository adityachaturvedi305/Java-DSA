package Strings;

import java.util.Scanner;
import java.lang.StringBuilder;
public class SmallestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int[] f = new int[256];
        for(char ch : p.toCharArray()) f[ch]++;
        int i = 0, cnt = p.length();
        int min = Integer.MAX_VALUE, st = 0;
        for(int j=0; j<s.length(); j++){
            if(f[s.charAt(j)] > 0) cnt--;
            f[s.charAt(j)]--;
            while(cnt == 0){
                if(j - i + 1 < min){
                    min = j - i + 1;
                    st = i;
                }
                f[s.charAt(i)]++;
                if(f[s.charAt(i)] > 0) cnt++;
                i++;
            }
        }
        if(min == Integer.MAX_VALUE) System.out.println("");
        else System.out.println(s.substring(st, st + min));
    }
}
