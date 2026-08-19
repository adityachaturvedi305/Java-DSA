package BubbleSelectionInsertionSort;

import java.util.Scanner;

public class ZerosToEnd {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){ // n-1 passes
            for(int j = 0; j <n-i-1; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}
