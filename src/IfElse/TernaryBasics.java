package IfElse;

import java.util.Scanner;

public class TernaryBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        // condition ? Sach : jhooth
        System.out.println(n+" "+((n%2 == 0) ? "Even" : "Odd"));
    }
}
