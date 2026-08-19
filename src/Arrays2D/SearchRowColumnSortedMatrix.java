package Arrays2D;

import java.util.Scanner;

public class SearchRowColumnSortedMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        print(arr);
        System.out.print("Enter target");
        int k = sc.nextInt();
        int i=0, j=arr[0].length - 1; // last column
        int m = arr.length;
        boolean target = false;
        while (j>=0 && i<m){
            if(arr[i][j]>k) j--;
            else if(arr[i][j]<k) i++;
            else {
                target = true;
                break;
            }
        }
        if(target==true) System.out.println("Target present");
        else System.out.println("Target not present");
    }
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
