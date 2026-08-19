package basics;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double x = sc.nextDouble();
        double a = x * x;
        System.out.print("The square of a number is : ");
        System.out.print(a);
    }
}
