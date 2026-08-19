package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInSortedRotateArrayMethod1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        if (n == 0) return;
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Enter rotation count : ");
        int d = sc.nextInt();
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        // -------- FIND PIVOT --------
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) low = mid + 1;
            else high = mid;
        }
        int pivot = low;
        System.out.println("Pivot index: " + pivot);
        System.out.println("Pivot element: " + arr[pivot]);

        // -------- SEARCH TARGET --------
        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        int index;
        if (target >= arr[pivot] && target <= arr[n - 1]) index = binarySearch(arr, pivot, n - 1, target);
        else index = binarySearch(arr, 0, pivot - 1, target);
        if (index != -1) System.out.println("Target found at index: " + index);
        else System.out.println("Target not found");
    }
    // Standard Binary Search
    public static int binarySearch(int[] arr, int low, int high, int target){
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void reverse(int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
