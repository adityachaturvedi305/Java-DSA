package IfElse;

import java.util.Scanner;

public class StudentsCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if (n%5 == 0 && n%3 == 0) System.out.println("Ram");
        else if (n%3 == 0) System.out.println("Tarun");
        else if (n%5 == 0) System.out.println("Riya");
        else System.out.println("Aditya");
    }
}
