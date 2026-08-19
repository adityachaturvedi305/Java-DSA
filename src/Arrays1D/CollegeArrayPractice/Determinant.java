package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class Determinant {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for (n x n) matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
        }
        int res = det(arr, n);
        System.out.println("Determinant = " + res);
    }
    public static int det(int[][] arr, int n){
        if(n == 1) return arr[0][0];
        if(n == 2) return arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];
        int det = 0;
        int sign = 1;
        for(int j = 0; j < n; j++){
            int[][] temp = new int[n-1][n-1];
            getCof(arr, temp, 0, j, n);
            det += sign * arr[0][j] * det(temp, n-1);
            sign = -sign;
        }
        return det;
    }
    public static void getCof(int[][] arr, int[][] temp, int a, int b, int n){
        int p = 0, q = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != a && j != b){
                    temp[p][q++] = arr[i][j];
                    if(q == n-1){
                        q = 0;
                        p++;
                    }
                }
            }
        }
    }
}
