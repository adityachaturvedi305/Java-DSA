package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class PrintBoundaryElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for (n x n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Resulted array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i == n-1 || j == 0 || j == n-1) System.out.print(arr[i][j]+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
