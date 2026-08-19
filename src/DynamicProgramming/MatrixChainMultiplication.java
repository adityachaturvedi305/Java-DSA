package DynamicProgramming;

import java.util.Arrays;

public class MatrixChainMultiplication {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n-1][n-1];
        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j < n -1; j++){
                if(i >= j){
                    dp[i][j] = 0;
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for(int k = i; k < j; k++){
                    int x = arr[i] * arr[k+1] * arr[j+1];
                    int tc = dp[i][k] + dp[k+1][j] + x;
                    min = Math.min(min, tc);
                }
                dp[i][j] = min;
            }
        }
        return dp[0][n-2];
    }

//    static int[][] dp;
//    static int matrixMultiplication(int arr[]) {
//        int n = arr.length;
//        dp = new int[n-1][n-1];
//        for(int i = 0; i < n-1; i++){
//            Arrays.fill(dp[i], -1);
//        }
//        return mcm(0, n-2, arr);
//    }
//
//    static int mcm(int i, int j, int[] arr) {
//        if(i == j) return 0;
//        if(dp[i][j] != -1) return dp[i][j];
//        int min = Integer.MAX_VALUE;
//        for(int k = i; k < j; k++){
//            int x = arr[i] * arr[k+1] * arr[j+1];
//            int tc = mcm(i,k, arr) + mcm(k+1,j, arr) + x;
//            min = Math.min(min, tc);
//        }
//        return dp[i][j] = min;
//    }

//    public static void main(String[] args) {
//        int[][] arr = {{1,2}, {2,3}, {3,4}};
//        int n = arr.length;
//        System.out.println(mcm(0, n-1, arr));
//    }
//
//    private static int mcm(int i, int j, int[][] arr) {
//        if(i == j) return 0;
//        int min = Integer.MAX_VALUE;
//        for(int k = i; k < j; k++){
//            int x = arr[i][0] * arr[k][1] * arr[j][1];
//            int tc = mcm(i,k, arr) + mcm(k+1,j, arr) + x;
//            min = Math.min(min, tc);
//        }
//        return min;
//    }

}
