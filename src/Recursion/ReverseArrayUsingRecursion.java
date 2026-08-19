package Recursion;

import java.util.Scanner;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int i=0, j= arr.length-1;
        reverse(arr,i,j);
        for(int ele : arr) System.out.print(ele+" ");
    }
    public static void reverse(int[] arr, int i, int j){
        if(i>=j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr,i+1,j-1);
    }
}
