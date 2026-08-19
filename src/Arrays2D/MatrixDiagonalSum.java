package Arrays2D;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int diagonalSum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i == j) diagonalSum += arr[i][j];
                else if(i + j == row - 1) diagonalSum += arr[i][j];
            }
        }
        System.out.print("Diagonal sum: "+diagonalSum);
    }
}
