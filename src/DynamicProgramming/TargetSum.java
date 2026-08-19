package DynamicProgramming;

import java.util.Arrays;

public class TargetSum {
    static int[][] dp;
    static int absSum;
    public int findTargetSumWays(int[] arr, int target) {
        absSum = 0;
        for(int ele : arr) absSum += Math.abs(ele);
        dp = new int[arr.length][2*absSum + 1];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return findWays(0, 0, target, arr);
    }

    private int findWays(int i,int sum ,int target, int[] arr) {
        if(i == arr.length){
            if(target == sum) return 1;
            else return 0;
        }
        if(dp[i][sum+absSum] != -1) return dp[i][sum+absSum];
        int add = findWays(i+1,sum+arr[i] ,target, arr);
        int remove = findWays(i+1,sum-arr[i] ,target, arr);
        return dp[i][sum+absSum] = add + remove;
    }
}
