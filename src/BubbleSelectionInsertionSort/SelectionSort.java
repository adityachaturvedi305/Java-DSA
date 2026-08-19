package BubbleSelectionInsertionSort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1; i++){
            int min = arr[i];
            int mindex = 0;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
