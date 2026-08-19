package Recursion;

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Sorted ? : "+check(arr,0));
    }
    public static boolean check(int[] arr, int idx){
        if(idx == arr.length-1) return true;
        if(arr[idx]>arr[idx+1]) return false;
        return check(arr, idx+1);
    }
}
