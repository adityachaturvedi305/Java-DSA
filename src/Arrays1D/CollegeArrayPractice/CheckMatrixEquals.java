package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class CheckMatrixEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows for first matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns for first matrix: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements for first matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter rows for second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter columns for second matrix: ");
        int cols2 = sc.nextInt();
        int[][] brr = new int[rows2][cols2];
        System.out.println("Enter elements for second matrix: ");
        for(int i = 0; i< rows2; i++){
            for(int j = 0; j< cols2; j++){
                brr[i][j] = sc.nextInt();
            }
        }
        if(rows != rows2 || cols != cols2){
            System.out.println("Matrices are not equal!");
            return;
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] != brr[i][j]){
                    System.out.println("Matrices are not equal!");
                    return;
                }
            }
        }
        System.out.println("Matrices are equal");
    }
}
