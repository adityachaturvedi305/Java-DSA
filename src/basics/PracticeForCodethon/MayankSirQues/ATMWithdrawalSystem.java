package basics.PracticeForCodethon.MayankSirQues;

import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance : ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount : ");
        double wd = sc.nextDouble();
        if (wd % 100 == 0 && wd <= balance && (balance - wd) >= 1000) {
            System.out.println("Withdrawal successful");
            System.out.println("Withdrawal amount: " + wd);
            System.out.println("Remaining balance: " + (balance - wd));
        } else {
            System.out.println("Withdrawal failed");
            System.out.println("Reason: Amount must be multiple of 100 and minimum balance of 1000 must remain");
        }
        sc.close();
    }
}
