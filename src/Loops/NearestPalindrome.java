package Loops;

import java.util.Scanner;

public class NearestPalindrome {
    public static  boolean ispalindrome(int num){
        int orignal_number = num;
        int reverse = 0;
        while(num!=0){
            reverse = reverse*10 + num%10;
            num /= 10;
        }
        return orignal_number == reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(ispalindrome(n)){
            System.out.print("Number itself palindrome");
            return;
        }
        int lower = n-1;
        int upper = n+1;
        while (true){
            if(ispalindrome(lower)){
                System.out.print("Nearest palindrome : "+lower);
                break;
            }
            else if(ispalindrome(upper)){
                System.out.print("Nearest palindrome : "+upper);
                break;
            }
            lower--;
            upper++;
        }
    }
}
