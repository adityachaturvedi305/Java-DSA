package Arrays2D;

import java.util.Scanner;

public class ColSum {
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
        ColSum obj = new ColSum();
        int[] result = obj.colSum(arr);
        System.out.println("Col sums:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public int[] colSum(int[][] arr){
        int[] brr = new int[arr[0].length];
        for(int j=0; j<arr[0].length; j++){
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                sum += arr[i][j];
            }
            brr[j] = sum;
        }
        return brr;
    }
}
