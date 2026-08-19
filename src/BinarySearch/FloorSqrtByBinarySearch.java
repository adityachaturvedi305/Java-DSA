package BinarySearch;

import java.util.Scanner;

public class FloorSqrtByBinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int low = 0;
        int high = n;
        int sqrt = 0;
        while (low<=high){
            int mid = low + (high-low)/2;
            if ((long)mid == n/mid){
                sqrt = mid;
                break;
            }
            else if ((long)mid<n/mid){
                sqrt = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        System.out.print("The square root of the number is "+sqrt);
    }
}
