package BinarySearchOnAnswer;

import java.util.Arrays;

public class AggressiveCows {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 1, high = arr[arr.length - 1] - arr[0];
        int ans = 0;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(maxDis(mid, arr) >= k){
                low = mid + 1;
                ans = mid;
            }
            else high = mid - 1;
        }
        return ans;
    }

    public int maxDis(int mid, int[] arr) {
        int cows = 1;
        int last = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - last >= mid) {
                cows++;
                last = arr[i];
            }
        }
        return cows;
    }
}
