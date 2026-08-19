package DynamicProgramming;

import java.util.Arrays;

public class SubsetSum {
//    static int[][] dp;
//    static Boolean isSubsetSum(int arr[], int sum) {
//        dp = new int[arr.length][sum+1];
//        for (int i = 0; i < arr.length; i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        return subset(arr.length-1, arr, sum);
//    }
//
//    static boolean subset(int i, int[] arr, int k){
//        if(i < 0){
//            if(k == 0) return true;
//            else return false;
//        }
//        if(dp[i][k] != -1) return (dp[i][k] == 1);
//        boolean ans = false;
//        boolean skip = subset(i-1, arr, k);
//        if(k - arr[i] < 0) return skip
//        boolean pick = subset(i-1, arr,k - arr[i]);
//        ans = skip || pick;
//        dp[i][k] = (ans) ? 1 : 0;
//        return ans;
//    }

//    static boolean flag;
//    static Boolean isSubsetSum(int arr[], int sum) {
//        flag = false;
//        subset(0, arr, sum);
//        return flag;
//    }
//
//    static void subset(int i, int[] arr, int k){
//        if(k == 0){
//            flag = true;
//            return;
//        }
//        if(i == arr.length || k < 0 || flag) return;
//        subset(i+1, arr,k - arr[i]);
//        subset(i+1, arr, k);
//    }
//    private static boolean subset(int i, int sum, int[] arr, int target) {
//        if (i == arr.length) {
//            if (sum == target) return true;
//            else return false;
//        }
//        boolean pick = subset(i + 1, sum + arr[i], arr, target);
//        boolean skip = subset(i + 1, sum, arr, target);
//        return pick || skip;
//    }
}
