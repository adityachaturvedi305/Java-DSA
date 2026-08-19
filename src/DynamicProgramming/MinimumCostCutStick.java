package DynamicProgramming;

import java.util.Arrays;

public class MinimumCostCutStick {
    static int[][] dp;
    public int minCost(int n, int[] cuts) {
        int[] arr = new int[cuts.length+2];
        int i;
        for(i = 0; i < cuts.length; i++){
            arr[i] = cuts[i];
        }
        arr[i++] = 0;
        arr[i] = n;
        Arrays.sort(arr);
        int m = arr.length;
        dp = new int[m-1][m-1];
        for(i = 0; i < m-1; i++){
            Arrays.fill(dp[i], -1);
        }
        return costs(1, arr.length-2, arr);
    }

    public int costs(int i, int j, int[] arr) {
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k = i; k <= j; k++){
            int len = arr[j+1] - arr[i-1];
            int tc = costs(i, k-1, arr) + costs(k+1, j, arr) + len;
            min = Math.min(min, tc);
        }
        return dp[i][j] = min;
    }
}
