package BubbleSelectionInsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        int i = 0, j = arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==target) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                break;
            }
            else if(arr[i]+arr[j]>target) j--;
            else i++;
        }

    }
}
