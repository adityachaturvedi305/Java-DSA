package DynamicProgramming;

import java.util.Arrays;

public class Knapsack {
    public int knapsack(int capacity, int val[], int wt[]) {
        int[][] dp = new int[wt.length][capacity + 1];
        for (int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++){
                int skip = (i > 0) ? dp[i-1][j] : 0;
                if(wt[i] > j) dp[i][j] = skip;
                else {
                    int pick = val[i] + ((i > 0) ? dp[i-1][j-wt[i]] : 0);
                    dp[i][j] = Math.max(pick, skip);
                }
            }
        }
        return dp[wt.length-1][capacity];
    }

//    static int[][] dp;
//    public int knapsack(int capacity, int val[], int wt[]) {
//        int n = val.length;
//        dp = new int[n][capacity + 1];
//        for (int i = 0; i < n; i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        return helper(n-1, capacity, val, wt);
//    }
//    public int helper(int i, int capacity, int[] val, int[] wt){
//        if(i < 0) return 0;
//        if(dp[i][capacity] != -1) return dp[i][capacity];
//        int skip = helper(i-1, capacity, val, wt);
//        if(wt[i]>capacity) return dp[i][capacity] = skip;
//        int pick = val[i] + helper(i-1, capacity - wt[i], val, wt);
//        return dp[i][capacity] = Math.max(pick, skip);
//    }

//    public int knapsack(int capacity, int val[], int wt[]) {
//        return helper(0, capacity, val, wt);
//    }
//
//    public int helper(int i, int capacity, int[] val, int[] wt){
//        if(i == val.length) return Integer.MIN_VALUE;
////        if(i == val.length) {
////            if (capacity >= 0) return 0; // valid ans
////            else return Integer.MIN_VALUE;
////        }
//        int skip = helper(i+1, capacity, val, wt);
//        if(wt[i]>capacity) return skip;
//        int pick = val[i] + helper(i+1, capacity - wt[i], val, wt);
//        return Math.max(pick, skip);
//    }
}
