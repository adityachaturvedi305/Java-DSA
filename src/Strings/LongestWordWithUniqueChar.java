package Strings;

import java.util.Scanner;

public class LongestWordWithUniqueChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String s = sc.nextLine();
        int i=0, length=0;
        String ans = "";
        int j;
        for(j=0; j<s.length();j++){
            char ch = s.charAt(j);
            if(ch == ' '){
                if(i < j){
                    String w = s.substring(i, j);
                    if(unique(w) && w.length() > length){
                        length = w.length();
                        ans = w;
                    }
                }
                i = j+1;
            }
        }
        if(i < j){
            String w = s.substring(i, j);
            if(unique(w) && w.length() > length){
                length = w.length();
                ans = w;
            }
        }
        System.out.println(ans);
    }
    public static boolean unique(String s) {
        int[] check = new int[256];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(check[ch]>0) return false;
            check[ch]++;
        }
        return true;
    }
}
