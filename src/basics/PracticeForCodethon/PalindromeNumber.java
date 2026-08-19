package basics.PracticeForCodethon;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Not a Palindrome number");
            return;
        }
        int orig = n;
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n /= 10;
        }
        if(rev==orig) System.out.println("Palindrome number");
        else System.out.println("Not a Palindrome number");
    }

}
