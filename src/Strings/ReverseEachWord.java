package Strings;
import java.util.Scanner;
import java.lang.StringBuilder;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            while(i >= 0 && s.charAt(i) == ' ') i--;
            int j = i;
            while(i >= 0 && s.charAt(i) != ' ') i--;
            if(j >= 0){
                ans.append(s.substring(i+1, j+1));
                ans.append(" ");
            }
        }
        System.out.println(ans.toString().trim());
    }
}
