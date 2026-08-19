package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int peak = 0;
        int low = 1;
        int high = n-2;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                peak = arr[mid];
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid+1;
            else high=mid-1;
        }
        System.out.print("The peak element is : "+peak);
    }
}
