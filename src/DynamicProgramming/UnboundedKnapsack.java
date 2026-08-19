package DynamicProgramming;

import java.util.Arrays;

public class UnboundedKnapsack {
    static int[][] dp;
    public int knapsack(int val[], int wt[], int capacity) {
        int n = val.length;
        dp = new int[n][capacity + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0,val, wt, capacity);
    }

    public int helper(int i, int val[], int wt[], int C){
        if(val.length == i) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int pick = 0;
        if(wt[i] <= C) pick = val[i] + helper(i, val, wt, C - wt[i]);
        int skip = helper(i+1, val, wt,C);

        return dp[i][C] = Math.max(pick, skip);
    }

//    public int knapsack(int val[], int wt[], int capacity) {
//        return helper(0,val, wt, capacity);
//    }
//
//    public int helper(int i, int val[], int wt[], int C){
//        if(val.length == i) return 0;
//        int pick = 0;
//        if(wt[i] <= C) pick = val[i] + helper(i, val, wt, C - wt[i]);
//        int skip = helper(i+1, val, wt,C);
//
//        return Math.max(pick, skip);
//    }
}
