package DynamicProgramming;

public class LongestBitonicSubsequence {
    public static int longestBitonicSequence(int n, int[] arr) {
        int[] dp1 = new int[n]; // lis left to right
        dp1[0] = 1;
        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]) max = Math.max(max, dp1[j]);
            }
            dp1[i] = 1+max;
        }

        int[] dp2 = new int[n]; // lis right to left
        dp2[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            int max = 0;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[i]) max = Math.max(max, dp2[j]);
            }
            dp2[i] = 1+max;
        }

        int maxLength = 0;
        for (int i = 0; i < n; i++) if(dp1[i] != 1 && dp2[i] != 1) maxLength = Math.max(maxLength,dp1[i]+dp2[i]-1);
//        return dp[n-1]; // 2 3 4 5 6 1
        return maxLength;
    }
}
