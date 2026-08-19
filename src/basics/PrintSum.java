package basics;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double x = sc.nextDouble();
        System.out.print("Enter second number : ");
        double y = sc.nextDouble();
        System.out.print("Enter third number : ");
        double z = sc.nextDouble();
        System.out.print("The sum is : ");
        System.out.println(x + y + z);
    }
}
