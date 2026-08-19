package Strings;
import java.util.Scanner;
public class SubstringCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int n = s.length(), m = p.length();
        int count = 0;
        for(int i=0; i<=n-m; i++){
            if(s.substring(i,i+m).equals(p)) count++;
        }
        if(count==0) System.out.println(-1);
        else System.out.println(count);
    }
}
