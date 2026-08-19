package Strings;
import java.util.Scanner;
public class SubstringBigString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st: ");
        String s = sc.nextLine();
        System.out.print("Enter 2nd: ");
        String p = sc.nextLine();
        int[] freq = new int[256];
        for(char ch : p.toCharArray()) freq[ch]++;
        int i = 0, j = 0, min = Integer.MAX_VALUE;
        int st = 0, count = p.length();
        while (j<s.length()){
            if(freq[s.charAt(j)]>0) count--;
            freq[s.charAt(j)]--;
            j++;
            while (count==0){
                if(j-i<min){
                    min = j-i;
                    st = i;
                }
                freq[s.charAt(i)]++;
                if(freq[s.charAt(i)]>0) count++;
                i++;
            }
        }
        if(min == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(s.substring(st,st+min));
    }
}
