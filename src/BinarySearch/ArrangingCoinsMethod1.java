package BinarySearch;

import java.util.Scanner;

public class ArrangingCoinsMethod1 {
    public static int sqrt(int n){
        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;
            long sq = (long) mid * mid;

            if (sq == n){
                return mid;
            }
            else if (sq < n){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        long value = 8L * n + 1;
        int k = (sqrt((int)value) - 1) / 2;
        System.out.print("The value of k is "+k);
    }
}
