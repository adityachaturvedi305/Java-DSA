package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber2 {
    // Space Optimized Method

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int first = stick(0, n-2, nums);
        int last = stick(1, n-1, nums);
        return Math.max(first, last);
    }

    public int stick(int st, int end, int[] arr){
        int m = end - st + 1;
        int[] dp = new int[3];
        dp[0] = arr[st];
        if(m == 1) return dp[0];
        dp[1] = Math.max(arr[st], arr[st + 1]);
        for(int i = 2; i < m; i++) {
            dp[2] = Math.max(arr[st + i] + dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[1];
    }

    // Tabulation Method

//    public int rob(int[] nums) {
//        int n = nums.length;
//        if (n == 1) return nums[0];
//        int first = stick(0, n-2, nums);
//        int last = stick(1, n-1, nums);
//        return Math.max(first, last);
//    }
//
//    public int stick(int st, int end, int[] arr){
//        int m = end - st + 1;
//        int[] dp = new int[m];
//        dp[0] = arr[st];
//        if(m == 1) return dp[0];
//        dp[1] = Math.max(arr[st], arr[st + 1]);
//        for(int i = 2; i < m; i++) {
//            dp[i] = Math.max(arr[st + i] + dp[i - 2], dp[i - 1]);
//        }
//        return dp[m - 1];
//    }

    // Recursion + Memoization

//    static int[] dp;
//    public int rob(int[] nums) {
//        int n = nums.length;
//        dp = new int[n];
//        Arrays.fill(dp, -1);
//        if (n == 1) return nums[0];
//        int first = stick(0, n-2, nums);
//        dp = new int[n];
//        Arrays.fill(dp, -1);
//        int last = stick(1, n-1, nums);
//        return Math.max(first, last);
//    }
//
//    public int stick(int st, int end, int[] arr){
//        if(st > end) return 0;
//        if(dp[st] != -1) return dp[st];
//        int pick = arr[st] + stick(st+2, end, arr);
//        int skip = stick(st+1, end, arr);
//        return dp[st] = Math.max(pick , skip);
//    }

    // Recursive Method

//    public int rob(int[] nums) {
//        int n = nums.length;
//        if (n == 1) return nums[0];
//        int first = stick(0, n-2, nums);
//        int last = stick(1, n-1, nums);
//        return Math.max(first, last);
//    }
//
//    public int stick(int st, int end, int[] arr){
//        if(st > end) return 0;
//        int pick = arr[st] + stick(st+2, end, arr);
//        int skip = stick(st+1, end, arr);
//        return Math.max(pick , skip);
//    }
}
