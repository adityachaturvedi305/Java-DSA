package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class KthPositiveElementInSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Enter Kth element : ");
        int k = sc.nextInt();
        int low = 0, high = n - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;
            if (missing >= k) high = mid - 1;
            else low = mid + 1;
        }
        int result = low + k;
        System.out.println("Kth missing positive number is : " + result);
    }
}
