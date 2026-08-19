package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                int original = num;
                int sum = 0;
                int digits = 0;

                // Count number of digits
                int temp = num;
                while (temp != 0) {
                    digits++;
                    temp /= 10;
                }

                // Calculate Armstrong sum
                temp = num;
                while (temp != 0) {
                    int digit = temp % 10;
                    sum += Math.pow(digit, digits);
                    temp /= 10;
                }

                // Check
                if (sum == original) {
                    System.out.println(original + " is an Armstrong number");
                } else {
                    System.out.println(original + " is NOT an Armstrong number");
                }
    }
}
