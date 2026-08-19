package Strings;

import java.util.Scanner;

public class BracketString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (true){
            String t = s;
            s = s.replace("()","");
            s = s.replace("{}","");
            s = s.replace("[]","");
            if(s.equals(t)) break;
        }
        if(s.isEmpty()) System.out.println("VALID");
        else System.out.println("INVALID");
    }
}
