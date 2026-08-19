package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] arr, int x) {
        int n = arr.length;
        int[][] dp = new int[2][x + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int skip = (i > 0) ? dp[0][j] : ((j == 0) ? 0 : Integer.MAX_VALUE);
                if (j < arr[i]) dp[1][j] = skip;
                else {
                    int take = dp[1][j - arr[i]];
                    int pick = (take == Integer.MAX_VALUE) ? take : take + 1;
                    dp[1][j] = Math.min(pick, skip);
                }
            }
            // copy current row to previous row
            for (int j = 0; j < dp[0].length; j++) {
                dp[0][j] = dp[1][j];
            }
        }
        int ans = dp[1][x];
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

//    public int coinChange(int[] arr, int x) {
//        int n = arr.length;
//        int[][] dp = new int[n][x + 1];
//        for(int i = 0; i < dp.length; i++) {
//            for(int j = 0; j < dp[0].length; j++){
//                int skip = (i > 0) ? dp[i-1][j] : ((j == 0) ? 0 : Integer.MAX_VALUE);
//                if(j < arr[i]) dp[i][j] = skip;
//                else {
//                    int take = dp[i][j - arr[i]];
//                    int pick = (take == Integer.MAX_VALUE) ? take : take + 1;
//                    dp[i][j] = Math.min(pick, skip);
//                }
//            }
//        }
//        int ans = dp[n-1][x];
//        return (ans == Integer.MAX_VALUE) ? -1 : ans;
//    }

//    static int[][] dp;
//    public int coinChange(int[] arr, int x) {
//        dp = new int[arr.length][x + 1];
//        for (int i = 0; i < arr.length; i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        int ans = coin(arr.length-1, arr, x);
//        return (ans == Integer.MAX_VALUE) ? -1 : ans;
//    }
//
//    private int coin(int i, int[] arr, int x) {
//        if(i < 0) {
//            if(x == 0) return 0;
//            else return Integer.MAX_VALUE;
//        }
//        if (dp[i][x] != -1) return dp[i][x];
//        int skip = coin(i-1, arr, x);
//        if(x < arr[i]) return dp[i][x] = skip;
//        int take = coin(i,arr,x-arr[i]);
//        int pick = (take == Integer.MAX_VALUE) ? take : take + 1;
//        return dp[i][x] = Math.min(pick, skip);
//    }

//    static int[][] dp;
//    public int coinChange(int[] arr, int x) {
//        dp = new int[arr.length][x + 1];
//        for (int i = 0; i < arr.length; i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        int ans = coin(0, arr, x);
//        return ans == Integer.MAX_VALUE ? -1 : ans;
//    }
//    private int coin(int i, int[] arr, int x) {
//        if (i == arr.length) return x == 0 ? 0 : Integer.MAX_VALUE;
//        if (dp[i][x] != -1) return dp[i][x];
//        int skip = coin(i + 1, arr, x);
//        int pick = Integer.MAX_VALUE;
//        if (arr[i] <= x) {
//            int take = coin(i, arr, x - arr[i]);
//            if (take != Integer.MAX_VALUE) {
//                pick = take + 1;
//            }
//        }
//        return dp[i][x] = Math.min(pick, skip);
//    }
}
