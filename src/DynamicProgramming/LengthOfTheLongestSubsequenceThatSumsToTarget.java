package DynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class LengthOfTheLongestSubsequenceThatSumsToTarget {
    static int[][] dp;
    public int lengthOfLongestSubsequence(List<Integer> arr, int k) {
        dp = new int[arr.size()][k + 1];
        for (int i = 0; i < arr.size(); i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = longestSubsequence(0, 0, arr, k);
        return ans < 0 ? -1 : ans;
    }

    private int longestSubsequence(int i,int sum , List<Integer> arr, int k) {
        if (sum > k) return Integer.MIN_VALUE;
        if(i == arr.size()){
            if (sum == k) return 0;
            return Integer.MIN_VALUE;
        }
        if(dp[i][sum] != -1) return dp[i][sum];
        int skip = longestSubsequence(i+1,sum , arr, k);
        int pick = 1 + longestSubsequence(i+1, sum + arr.get(i), arr, k);
        return dp[i][sum] = Math.max(pick, skip);
    }
}
