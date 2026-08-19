package Strings;

import java.lang.StringBuilder;
import java.util.Scanner;

public class ReverseTheWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        int i = s.length(), j = s.length()-1;
        while (j>=0){
            char ch = s.charAt(j);
            if(ch != ' ') {
                j--;
            }
            else {
                ans.append(s.substring(j+1, i)).append(" ");
                i = j;
                j--;
            }
        }
        ans.append(s.substring(0,i));
        System.out.println(ans);
    }

}
