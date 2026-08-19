package BubbleSelectionInsertionSort;

import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        for(int i = 0; i<k; i++){
            int min = arr[i];
            int mindex = i;
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
        System.out.print(arr[k-1]); // Time complexity --> O(n*k)

    }
}
