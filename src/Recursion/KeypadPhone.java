package Recursion;

import java.util.Scanner;

public class KeypadPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String digits = sc.nextLine();
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // 0 to 9
        solve(digits, 0, "", keypad);
    }
    private static void solve(String digits, int idx, String ans, String[] keypad) {
        if(idx == digits.length()){
            System.out.println(ans);
            return;
        }
        char digit = digits.charAt(idx);
        String letters = keypad[digit - '0'];
        for(int i=0; i<letters.length(); i++){
            char ch = letters.charAt(i);
            solve(digits, idx + 1, ans + ch, keypad);
        }
    }

}
