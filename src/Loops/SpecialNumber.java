package Loops;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int orignal_number = n;
        int sum = 0;
        int product = 1;
        while (n!=0){
            sum += n%10;
            n/=10;
        }
        while (orignal_number!=0){
            product *= orignal_number%10;
            orignal_number/=10;
        }
        if(sum==product) System.out.print("This is special number");
        else System.out.print("This is not special number");
    }
}
