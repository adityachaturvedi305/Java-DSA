package DynamicProgramming;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for(int ele : arr) sum += ele;
        if(sum % 2 != 0) return false;
        int target = sum/2;
        int[][] dp = new int[arr.length][target+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++){
                boolean ans = false;
                boolean skip = (i > 0) ? dp[i-1][j] == 1 : (j == 0);
                if(j - arr[i] < 0) ans  = skip;
                else {
                    boolean pick = (i > 0) ? (dp[i-1][j- arr[i]] == 1) : (j == 0);
                    ans = skip || pick;
                }
                dp[i][j] = (ans) ? 1 : 0;
            }
        }
        return dp[arr.length-1][target] == 1;
    }

//    static int[][] dp;
//    public boolean canPartition(int[] arr) {
//        int sum = 0;
//        for(int ele : arr) sum += ele;
//        if(sum % 2 != 0) return false;
//        int target = sum/2;
//        dp = new int[arr.length][target+1];
//        for (int i = 0; i < arr.length; i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        return subset(0, arr, target);
//    }
//    static boolean subset(int i, int[] arr, int k){
//        if(k < 0) return false;
//        if(i == arr.length){
//            if(k == 0) return true;
//            else return false;
//        }
//        if(dp[i][k] != -1) return (dp[i][k] == 1);
//        boolean ans = false;
//        boolean skip = subset(i+1, arr, k);
//        boolean pick = subset(i+1, arr,k - arr[i]);
//        ans = skip || pick;
//        dp[i][k] = (ans) ? 1 : 0;
////        if(ans) dp[i][k] = dp[i][k] = 1;
////        else dp[i][k] = 0;
//        return ans;
//    }
}
