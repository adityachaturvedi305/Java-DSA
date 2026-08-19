package DynamicProgramming;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        int[] dp = new int[3];
        dp[0] = arr[0];
        if(n == 1) return arr[0];
        dp[1] = arr[1];
        if(n == 2) return Math.min(dp[0], dp[1]);
        for(int i = 2; i < n; i++){
            dp[2] = arr[i] + Math.min(dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return Math.min(dp[1], dp[0]);
    }

//    static int[] dp;
//    public int minCostClimbingStairs(int[] arr) {
//        int n = arr.length;
//        dp = new int[n];
//        Arrays.fill(dp, -1);
//        return Math.min(minCost(0, arr), minCost(1, arr));
//    }
//
//    public int minCost(int idx, int[] arr){
//        if(idx >= arr.length) return 0;
//        if(dp[idx] != -1) return dp[idx];
//        return dp[idx] = arr[idx] + Math.min(minCost(idx+1, arr), minCost(idx+2, arr));
//    }
}
