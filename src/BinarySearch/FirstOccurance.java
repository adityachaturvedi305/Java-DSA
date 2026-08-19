package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurance {
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
        boolean flag = false;
        int low = 0;
        int high = n-1;
        int idx = Integer.MAX_VALUE;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target) high = mid-1;
            else if(arr[mid]<target) low = mid+1;
            else{ // arr[mid] == target
                idx = mid;
                high = mid-1;
            }
        }
        System.out.print("First occurence : "+idx);
    }
}
