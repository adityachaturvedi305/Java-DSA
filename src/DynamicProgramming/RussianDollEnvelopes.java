package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] arr) {
        Arrays.sort(arr, (a, b) -> (a[0] != b[0]) ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1]));
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] a : arr){
            if(ans.isEmpty() || a[1] > ans.getLast()) ans.add(a[1]);
            else replaceWithLowerBound(a[1], ans);
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

//    public int maxEnvelopes(int[][] arr) {
//
//        Arrays.sort(arr, (a, b) -> {
//            if(a[0] == b[0]) return a[1] - b[1];
//            return a[0] - b[0];
//        });
//
//        int n = arr.length;
//
//        int[] dp = new int[n];
//        int max = 1;
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < i; j++){
//                if(arr[j][0] < arr[i][0] && arr[j][1] < arr[i][1]){
//                    dp[i] = Math.max(dp[i], dp[j]);
//                }
//            }
//            dp[i] += 1;
//            max = Math.max(max, dp[i]);
//        }
//
//        return max;
//    }
}
