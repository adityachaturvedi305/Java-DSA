package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
//        if(n<0) n = -n;
        int sum = 0;
        while (n != 0){
            sum += (n%10); // (n % 10) gives the last digit of number 'n'
            n /= 10;
        }
       if(sum>0)  System.out.println(sum);
       else System.out.println(-sum);
    }
}
