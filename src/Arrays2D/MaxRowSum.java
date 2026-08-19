package Arrays2D;

import java.util.Scanner;

public class MaxRowSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int m = sc.nextInt();
        System.out.print("Enter column : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max_row_sum = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0; i<m; i++){
            int row_sum = 0;
            for(int j=0; j<n; j++){
                row_sum += arr[i][j];
            }
            if(max_row_sum<row_sum){
                max_row_sum = row_sum;
                idx = i;
            }
        }
        System.out.println("The maximum row sum is "+max_row_sum+" and the index is "+idx);
    }
}
