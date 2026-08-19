package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class Sort2DArrayGivenColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (for n x n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter column for sort: ");
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i][k]>arr[j][k]){
                    int temp = arr[i][k];
                    arr[i][k] = arr[j][k];
                    arr[j][k] = temp;
                }
            }
        }
        for(int[] a : arr){
            for(int ele : a) System.out.print(ele+" ");
            System.out.println();
        }
    }
}
