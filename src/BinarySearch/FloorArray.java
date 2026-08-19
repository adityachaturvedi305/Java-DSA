package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int idx = -1;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target) high = mid-1;
            else{
                idx = mid;
                low = mid+1;
            }
        }
        if (idx == -1) {
            System.out.println("Floor does not exist");
        } else {
            System.out.println("Floor idx is: " + idx);
        }
    }
}
