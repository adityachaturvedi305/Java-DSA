package basics.PracticeForCodethon;

import java.util.Scanner;

public class ArmstrongOrNarcissisticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int orig = n;
        int helper = n;
        int digits = 0;
        while(n!=0){
            digits++;
            n /= 10;
        }
        int sum = 0;
        while(helper!=0){
            int ld = helper%10;
            sum += (int)Math.pow(ld,digits);
            helper /= 10;
        }
        if(sum == orig) System.out.println("Armstrong number");
        else System.out.println("Not a Armstrong number");
    }

}
