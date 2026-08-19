package BubbleSelectionInsertionSort;

import java.util.Scanner;

public class SelectionSortHW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int max = arr[i];
            int mindex = i;
            for(int j=n-1; j>=i; j--){
                if(arr[j]<max){
                    max = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
