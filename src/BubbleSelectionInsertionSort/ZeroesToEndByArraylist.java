package BubbleSelectionInsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeroesToEndByArraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        // add non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        // add remaining zeros
        while (list.size() < n) {
            list.add(0);
        }

        // copy back to array
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        print(arr);
    }
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
