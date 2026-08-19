package Strings;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        if(s.length()!=p.length()){
            System.out.println("NO");
            return;
        }
        if((s+s).contains(p)) System.out.println("YES");
        else System.out.println("NO");
    }
}
