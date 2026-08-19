package Strings;
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();
        System.out.print(compare(str1,str2));
        sc.close();
    }
    public static int compare(String str1, String str2){
        int i=0, j=0;
        while(i<str1.length() && j<str2.length()){
            char a = str1.charAt(i++);
            char b = str2.charAt(j++);
            if(a != b ) return (int)(a-b);
        }
        return str1.length() - str2.length();
    }
}