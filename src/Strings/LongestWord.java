package Strings;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int maxLength = 0;
        int i = 0, j = 0;
        int st = 0, end = 0;
        while (j<s.length()){
            char ch = s.charAt(j);
            if(ch != ' ') j++;
            else {
                int length = j-i;
                if(length>maxLength){
                    maxLength = length;
                    st = i;
                    end = j;
                }
                j++;
                i = j;
            }
        }
        int length = j-i;
        if(length>maxLength){
            maxLength = length;
            st = i;
            end = j;
        }
        System.out.println(s.substring(st,end));
    }

}
