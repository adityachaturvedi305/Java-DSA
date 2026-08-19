package CyclicSort;

import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int length = arr.length; // 1 to n
        int i = 0;
        while(i< length){
            if(arr[i] == i+1 || arr[i] <= 0 || arr[i]>length || arr[i] == arr[arr[i]-1]) i++;
            else swap(arr,i,arr[i]-1);
        }
        for(i=0; i< arr.length; i++){
            if(arr[i]!=i+1) System.out.println(i+1);
        }
        System.out.println(length+1);
    }
    public static void swap(int[] arr,int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
