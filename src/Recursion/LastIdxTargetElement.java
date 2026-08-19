package Recursion;

import java.util.Scanner;

public class LastIdxTargetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target element: ");
        int k = sc.nextInt();
        System.out.println("Last idx: "+ lastIdx(arr, arr.length-1, k));
    }
    public static int lastIdx(int[] arr, int idx, int k){
        if(idx < 0) return -1;
        if(arr[idx] == k) return idx;
        return lastIdx(arr, idx-1, k);
    }
}
