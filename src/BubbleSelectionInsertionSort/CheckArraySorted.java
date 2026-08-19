package BubbleSelectionInsertionSort;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]) flag = false;
            else flag = true;
        }
        if(flag==true) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
