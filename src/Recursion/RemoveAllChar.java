package Recursion;

import java.util.Scanner;

public class RemoveAllChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String s = sc.next();
        System.out.print("Enter character: ");
        char k = sc.next().charAt(0);
        StringBuilder ans = new StringBuilder();
        System.out.println(remove(s,0,k,ans));
    }
    public static StringBuilder remove(String s,int idx, char k,StringBuilder ans){
        if(s.length() == idx) return ans;
        if(s.charAt(idx) != k) ans.append(s.charAt(idx));
        return remove(s, idx+1, k, ans);
    }
}
