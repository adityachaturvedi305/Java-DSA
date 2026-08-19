package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] dp = new int[n]; // lis right to left
        dp[n-1] = 1;
        int maxLen = 1;
        for(int i = n-2; i >= 0; i--){
            int max = 0;
            for(int j = i+1; j < n; j++){
                if(arr[j] % arr[i] == 0) max = Math.max(max, dp[j]);
            }
            dp[i] = 1+max;
            maxLen =  Math.max(maxLen, dp[i]);
        }
        int idx = 0;
        for(int i = 0; i < n; i++) if(dp[i] == maxLen) idx = i;
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[idx]);
        while (dp[idx] > 1) {
            for (int j = idx + 1; j < n; j++) {
                if (arr[j] % arr[idx] == 0 && dp[j] == dp[idx] - 1) {
                    ans.add(arr[j]);
                    idx = j;
                    break;
                }
            }
        }
        return ans;
    }
}
