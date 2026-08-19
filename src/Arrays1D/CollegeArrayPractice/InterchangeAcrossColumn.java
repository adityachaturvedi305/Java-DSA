package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class InterchangeAcrossColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for (n x n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int temp = arr[i][0];
            arr[i][0] = arr[i][n-1];
            arr[i][n-1] = temp;
        }
        for (int[] a : arr) {
            for (int ele : a) System.out.print(ele + " ");
            System.out.println();
        }
    }
}
