package Recursion;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(countOccur(n,k));
    }

    private static int countOccur(int n, int k) {
        if(n==0) return 0;
        if(n%10==k) return 1 + countOccur(n/10,k);
        else return countOccur(n/10,k);
    }
}
