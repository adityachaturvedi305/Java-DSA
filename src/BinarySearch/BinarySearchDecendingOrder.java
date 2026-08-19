package BinarySearch;

import java.util.Scanner;

public class BinarySearchDecendingOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n-1; i++){
            int swaps = 0;
            for (int j=0; j<n-1-i; j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int low = 0;
        int high = n-1;
        boolean flag = false;
        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid]==target){
                flag = true;
                break;
            }
            else if(arr[mid]>target) low = mid+1;
            else high = mid-1;
        }
        if(flag == true) System.out.print("The target is present in the array");
        else System.out.print("The target is not present in the array");
    }
}
