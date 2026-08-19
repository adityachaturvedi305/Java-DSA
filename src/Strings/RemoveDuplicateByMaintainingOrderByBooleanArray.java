package Strings;

import java.lang.StringBuilder;
import java.util.Scanner;

public class RemoveDuplicateByMaintainingOrderByBooleanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        StringBuilder ans = new StringBuilder();
        boolean[] arr = new boolean[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']==false){
                ans.append(ch);
                arr[ch-'a'] = true;
            }
        }
        System.out.println(ans);
    }
}
