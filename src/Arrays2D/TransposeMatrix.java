package Arrays2D;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int m = sc.nextInt();
        System.out.print("Enter coloumn : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int row = arr.length;
        int col = arr[0].length;
        int[][] brr = new int[col][row];
        // Transpose
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                brr[j][i] = arr[i][j];
            }
        }
        // Print Transpose
        System.out.println("Transpose Matrix:");
        for(int i=0; i<brr.length; i++){
            for(int j=0; j<brr[0].length; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
