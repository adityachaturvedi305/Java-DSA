package Strings;

import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        StringBuilder ans = new StringBuilder();
        int i = 0 , j = 1;
        while (j<sorted.length()){
            if(sorted.charAt(i) == sorted.charAt(j)) j++;
            else {
                ans.append(sorted.charAt(i));
                i = j;
                j++;
            }
        }
        ans.append(sorted.charAt(i));
        System.out.println(ans);
    }
}
