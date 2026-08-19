package Arrays2D;

import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of matrix");
        transpose(arr);
        print(arr);
        System.out.println("Rotated matrix (90 degree clockwise):");
        reverse(arr);
    }
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
