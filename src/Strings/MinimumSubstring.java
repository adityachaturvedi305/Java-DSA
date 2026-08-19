package Strings;
import java.util.Scanner;

public class MinimumSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] arr = new boolean[256];
        int total = 0;
        for(char c : s.toCharArray()){
            if(!arr[c]){
                arr[c] = true;
                total++;
            }
        }
        int[] f = new int[256];
        int i = 0, j = 0, d = 0,min = Integer.MAX_VALUE;
        while (j < s.length()) {
            char ch = s.charAt(j);
            f[ch]++;
            if(f[ch]==1) d++;
            while (d == total){
                min = Math.min(min, j - i + 1);
                f[s.charAt(i)]--;
                if(f[s.charAt(i)] == 0) d--;
                i++;
            }
            j++;
        }
        System.out.println(min);
    }
}
