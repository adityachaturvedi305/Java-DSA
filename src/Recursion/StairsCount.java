package Recursion;

import java.util.Scanner;

public class StairsCount {
    public static void main(String[] args){
        // max jump allowed is 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countWays = ways(n);
        System.out.println(countWays);
    }
    public static int ways(int n){
        if(n < 0) return 0;
        if(n == 0) return 1;
        return ways(n-1)+ ways(n-2);
    }
}
