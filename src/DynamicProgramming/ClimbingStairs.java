package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        if(n > 1) dp[1] = dp[0]+1;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }

//    static int[] dp;
//    public int climbStairs(int n) {
//        dp = new int[n];
//        Arrays.fill(dp, -1);
//        return climb(0,n);
//    }
//
//    public int climb(int initial, int n) {
//        if(initial >= n-1) return 1;
//        if(dp[initial] != -1) return dp[initial];
//        return dp[initial] = climb(initial+1, n) + climb(initial+2, n);
//    }
}
