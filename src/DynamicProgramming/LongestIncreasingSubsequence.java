package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : arr){
            if(ans.isEmpty() || ele > ans.getLast()) ans.add(ele);
            else replaceWithLowerBound(ele, ans);
        }
        return ans.size();
    }

    private void replaceWithLowerBound(int ele, ArrayList<Integer> ans) {
        int low = 0, high = ans.size()-1, lb = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(ans.get(mid) >= ele){
                lb = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        ans.set(lb, ele);
    }

//    public int lengthOfLIS(int[] arr) {
//        int n = arr.length, maxlen = 0;
//        int[] dp = new int[n];
//        dp[0] = 1;
//        for(int i = 0; i < n; i++){
//            int max = 0;
//            for(int j = 0; j < i; j++){
//                if(arr[j] < arr[i]) max = Math.max(max, dp[j]);
//            }
//            dp[i] = 1+max;
//            maxlen = Math.max(maxlen, dp[i]);
//        }
////        return dp[n-1]; // 2 3 4 5 6 1
//        return maxlen;
//    }

//    static int[][] dp;
//    public int lengthOfLIS(int[] arr) {
//        dp = new int[arr.length][arr.length+1];
//        for(int i = 0; i < arr.length; i++){
//            Arrays.fill(dp[i], -1);
//        }
//        return lis(0, -1, arr);
//    }
//
//    private int lis(int idx, int prev, int[] arr) {
//        if(idx == arr.length) return 0;
//        if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
//        int skip = lis(idx+1, prev, arr);
//        if(prev != -1 && arr[idx] <= arr[prev]) return dp[idx][prev+1] = skip;
//        int pick = 1 + lis(idx+1, idx, arr);
//        return dp[idx][prev+1] = Math.max(pick,skip);
//    }
}
