package CyclicSort;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int length = arr.length;
        int i = 0;
        while(i< length){
            int correctIdx = arr[i]-1;
            if(arr[i] == i+1 || arr[correctIdx] == arr[i]) i++;
            else swap(arr,i,correctIdx);
        }
        for(i=0; i< arr.length; i++){
            if(arr[i]!=i+1) ans.add(arr[i]);
        }
        System.out.println(ans);
    }
    public static void swap(int[] arr,int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
