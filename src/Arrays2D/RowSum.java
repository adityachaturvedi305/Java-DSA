package Arrays2D;

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter cols: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        RowSum obj = new RowSum();
        int[] result = obj.rowSum(arr);
        System.out.println("Row sums:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public int[] rowSum(int[][] arr){
        int[] brr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            brr[i] = sum;
        }
        return brr;
    }
}
