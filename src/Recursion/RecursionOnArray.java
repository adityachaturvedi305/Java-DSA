package Recursion;

import java.util.Scanner;

public class RecursionOnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
//        recPrint(arr,0);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        System.out.print(exist(arr, target,0));
    }
    public static boolean exist(int[] arr, int target, int idx){
        if(arr.length==idx) return false;
        if(arr[idx] == target) return true;
        return exist(arr,target,idx+1);
    }
    public static void recPrint(int[] arr,int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);
    }
}
