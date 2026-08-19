package Strings;

import java.util.Scanner;

public class PassingStringToMethod {
    public static void change(String str){
        str = "Raghav";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String str = sc.nextLine();
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
}
