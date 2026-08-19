package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[3];
        dp[0] = arr[0];
        if(n == 1) return arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        if(n == 2) return dp[1];
        for (int i = 2; i < n; i++){
            dp[2] = Math.max(arr[i] + dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[n-1];
    }

//    public int rob(int[] arr) {
//        int n = arr.length;
//        int[] dp = new int[n];
//        dp[0] = arr[0];
//        if(n > 1) dp[1] = Math.max(arr[0], arr[1]);
//        for (int i = 2; i < n; i++){
//            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
//        }
//        return dp[n-1];
//    }

//    static int[] dp;
//    public int rob(int[] arr) {
//        int n = arr.length;
//        dp = new int[n];
//        Arrays.fill(dp, -1);
//        return sticker(0, arr);
//    }
//
//    public int sticker(int idx, int[] arr) {
//        if(idx >= arr.length) return 0;
//        if(dp[idx] != -1) return dp[idx];
//        int pick = arr[idx] + sticker(idx+2, arr);
//        int skip = sticker(idx+1, arr);
//        return dp[idx] = Math.max(pick, skip);
//    }
}
