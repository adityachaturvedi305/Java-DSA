package IfElse;

import java.util.Scanner;

public class Age_Clasification {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if(age<13) System.out.println("Child");
        else if(age>=13 && age<=19) System.out.println("Teen");
        else System.out.println("Adult");
    }
}
