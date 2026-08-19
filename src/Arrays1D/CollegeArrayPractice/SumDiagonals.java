package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class SumDiagonals {
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
        int pDia = 0;
        int sDia = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j) pDia += arr[i][j];
                if(i+j==n-1) sDia += arr[i][j];
            }
        }
        System.out.print("The principle diagonal sum: "+pDia+"\nThe secondary diagonal sum: "+sDia);
    }
}
