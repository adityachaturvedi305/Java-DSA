package Recursion;

import java.util.Scanner;

public class MoveAllxToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(moveX(s, 0));
    }
    private static String moveX(String s, int idx){
        if(idx == s.length()) return "";
        char ch = s.charAt(idx);
        if(ch == 'x') return moveX(s, idx+1) + 'x';
        return ch + moveX(s, idx+1);
    }
}
