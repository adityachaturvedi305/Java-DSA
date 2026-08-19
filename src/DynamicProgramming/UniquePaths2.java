package DynamicProgramming;

import java.util.Arrays;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] dp = new int[2][n];
        dp[0][0] = (arr[0][0] == 1) ? 0 : 1;
        // First row
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 1) dp[0][j] = 0;
            else dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            int cur = i % 2;
            int prev = 1 - cur;
            // First column
            if (arr[i][0] == 1) dp[cur][0] = 0;
            else dp[cur][0] = dp[prev][0];
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 1) dp[cur][j] = 0;
                else dp[cur][j] = dp[prev][j] + dp[cur][j - 1];
            }
        }
        return dp[(m - 1) % 2][n - 1];
    }
//    static int[][] dp;
//    public int uniquePathsWithObstacles(int[][] arr) {
//        int m = arr.length, n = arr[0].length;
//        dp = new int[m+1][n+1];
//        return paths(m-1 , n-1, arr);
//    }
//
//    public int paths(int row , int col, int[][] arr){
//        if(row < 0 || col < 0) return 0;
//        if(arr[row][col] == 1) return 0;
//        if(dp[row][col] != 0) return dp[row][col];
//        if(row == 0 && col == 0) return 1;
//        return dp[row][col] = paths(row-1, col, arr) + paths(row, col-1, arr);
//    }

//    public int uniquePathsWithObstacles(int[][] arr) {
//        int m = arr.length, n = arr[0].length;
//        if(arr[0][0] == 1) return 0;
//        return paths(m-1 , n-1, arr);
//    }
//
//    public int paths(int row , int col, int[][] arr){
//        if(row < 0 || col < 0) return 0;
//        if(arr[row][col] == 1) return 0;
//        if(row == 0 && col == 0) return 1;
//        return paths(row-1, col, arr) + paths(row, col-1, arr);
//    }
}
