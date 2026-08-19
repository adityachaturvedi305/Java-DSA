package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class InterchangeAcrossRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for (n x n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j <n; j++){
            int temp = arr[0][j];
            arr[0][j] = arr[n-1][j];
            arr[n-1][j] = temp;
        }
        for (int[] a : arr){
            for (int ele : a) System.out.print(ele+" ");
            System.out.println();
        }
    }
}
