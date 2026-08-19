package IfElse;

import java.util.Scanner;

public class CheckDigitOrCharOrSpchar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') System.out.print("Character");
        else if(ch>='0' && ch<='9') System.out.print("Digit");
        else System.out.print("Special character");
    }
}
