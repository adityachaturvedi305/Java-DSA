package Strings;

import java.lang.StringBuilder;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        int i=0, j=1;
        while (j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else {
                ans.append(s.charAt(i));
                ans.append(j-i);
                i = j;
                j++;
            }
        }
        ans.append(s.charAt(i));
        ans.append(j-i);
        System.out.println(ans);
    }
}
