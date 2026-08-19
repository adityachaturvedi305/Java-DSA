package BubbleSelectionInsertionSort;

import java.util.Scanner;

public class ZeroToEndAnotherMethod {
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
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        print(arr);
    }
}
