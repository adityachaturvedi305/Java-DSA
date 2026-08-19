package Recursion;

import java.util.Scanner;

public class FirstIdxTargetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target element: ");
        int k = sc.nextInt();
        System.out.println("First idx: "+ firstIdx(arr,0,k));
    }
    public static int firstIdx(int[] arr, int idx,int k){
        if(idx == arr.length) return -1;
        if(arr[idx] == k) return idx;
        return firstIdx(arr, idx+1, k);
    }
}
