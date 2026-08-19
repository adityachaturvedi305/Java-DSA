package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplySquareMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (n): ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) A[i][j] = sc.nextInt();
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) B[i][j] = sc.nextInt();
        }
        // Matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) C[i][j] += A[i][k] * B[k][j];
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(C[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
