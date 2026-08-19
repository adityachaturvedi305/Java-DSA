package Strings;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int[] f = new int[256];
        int i = 0, j = 0;
        int st = 0, end = 0,d = 0;
        int max = 0;
        while (j<s.length()){
            char ch = s.charAt(j);
            f[ch]++;
            if(f[ch]==1) d++;
            while (d>k){
                f[s.charAt(i)]--;
                if(f[s.charAt(i)]==0) d--;
                i++;
            }
            if(j-i+1>max){
                max = j-i+1;
                st = i;
                end = j+1;
            }
            j++;
        }
        System.out.println(s.substring(st,end));
    }
}
