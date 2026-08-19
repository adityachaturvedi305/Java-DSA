package BinarySearch;

import java.util.Scanner;

public class SearchInSortedRotateArrayMethod2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        if (n == 0) return;
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter rotation count : ");
        int d = sc.nextInt();
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        System.out.print("Enter target to search : ");
        int target = sc.nextInt();
        int low = 0, high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                result = mid;
                break;
            }
            else if (arr[low] <= arr[mid]) { // left sorted
                if (arr[low] <= target && target < arr[mid]) high = mid - 1;
                else low = mid + 1;
            }
            else { // right sorted
                if (arr[mid] < target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        if (result != -1)
            System.out.println("Target found at index : " + result);
        else
            System.out.println("Target not found");
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
