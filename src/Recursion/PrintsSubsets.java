package Recursion;

import java.util.Scanner;

public class PrintsSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subsets("",s,0);
    }
    private static void subsets(String ans, String s, int idx) {
        if(idx == s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1);
        subsets(ans,s,idx+1);
    }
}
