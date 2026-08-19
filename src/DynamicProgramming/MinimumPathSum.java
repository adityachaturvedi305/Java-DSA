package DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i==0 && j==0) dp[i][j] = grid[i][j];
                else if(i==0) dp[i][j] = grid[i][j] + dp[i][j-1];
                else if(j==0) dp[i][j] = grid[i][j] + dp[i-1][j];
                else dp[i][j] = grid[i][j] + Math.min(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[m-1][n-1];
    }
//    static int[][] dp;
//    public int minPathSum(int[][] grid) {
//        int m = grid.length, n = grid[0].length;
//        dp = new int[m+1][n+1];
//        return minSum(0, 0, grid);
//    }
//
//    public int minSum(int i, int j, int[][] grid) {
//        int m = grid.length, n = grid[0].length;
//        if(i >= m || j >= n) return Integer.MAX_VALUE;
//        if(i == m - 1 && j == n - 1) return grid[i][j];
//        if(dp[i][j] != 0) return dp[i][j];
//        return dp[i][j] = grid[i][j] + Math.min(minSum(i + 1, j, grid), minSum(i, j + 1, grid));
//    }

//    public int minPathSum(int[][] grid) {
//        return minSum(0, 0, grid);
//    }
//
//    public int minSum(int i, int j, int[][] grid) {
//        int m = grid.length, n = grid[0].length;
//        if(i >= m || j >= n) return Integer.MAX_VALUE;
//        if(i == m - 1 && j == n - 1) return grid[i][j];
//        return grid[i][j] + Math.min(minSum(i + 1, j, grid), minSum(i, j + 1, grid));
//    }
}
