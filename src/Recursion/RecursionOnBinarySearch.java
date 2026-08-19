package Recursion;
import java.util.Arrays;
import java.util.Scanner;
public class RecursionOnBinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        int n = arr.length;
        return helper(arr,target,0,n-1);
    }
    public static int helper(int[] arr,int target,int low, int high){
        if(low>high) return -1;
        int mid = low+(high-low)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return helper(arr,target,low,mid-1);
        else return helper(arr,target,mid+1,high);
    }
}
