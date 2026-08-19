package BinarySearchOnAnswer;

public class SmallestDivisor {
    public int smallestDivisor(int[] arr, int k) {
        int low = 1, high = Integer.MIN_VALUE;
        for(int ele : arr) high = Math.max(ele, high);
        int ans = 0;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(divisorSum(arr, mid) <= k){
                high = mid - 1;
                ans = mid;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public long divisorSum(int[] arr, int divisor) {
        long sum = 0;
        for(int ele : arr){
            if(ele % divisor == 0) sum += ele/divisor;
            else sum += ele/divisor + 1;
        }
        return sum;
    }
}
