package CyclicSort;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int length = 1 + arr.length; // 1 to n
        int i = 0;
        while(i< arr.length){
            if(arr[i] == i+1 || arr[i] == length) i++;
            else{
                int idx = arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for(i=0; i< arr.length; i++){
            if(arr[i]!=i+1) System.out.println(i+1);
        }
        System.out.println(length);
    }
    public static void swap(int[] arr,int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
