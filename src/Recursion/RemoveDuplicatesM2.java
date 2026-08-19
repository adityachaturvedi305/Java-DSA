package Recursion;
import java.util.Scanner;
public class RemoveDuplicatesM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(remDup(s, 0));
    }
    private static String remDup(String s, int idx){
        if(idx == s.length()) return "";
        char ch = s.charAt(idx);
        String rem = remDup(s, idx+1);
        if(rem.indexOf(ch) != -1) return rem;
        return ch + rem;
    }
}
