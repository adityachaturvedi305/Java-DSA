package Strings;

import java.util.Scanner;

public class CostOfTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.length() != t.length()){
            System.out.println(-1);
            return;
        }
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != t.charAt(i)) count++;
        }
        System.out.println(count);
    }
}
