package BinarySearchOnAnswer;

public class CapacityToShipPackagesWithinXDays {
    public int shipWithinDays(int[] arr, int d) {
        int low = Integer.MIN_VALUE, high = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > low) low = arr[i];
            high += arr[i];
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(days(mid, arr) <= d){
                high = mid - 1;
                ans = mid;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public int days(int capacity, int[] arr) {
        int days = 0, c = capacity;
        for(int ele : arr){
            if(c >= ele) c -= ele;
            else {
                days++;
                c = capacity - ele;
            }
        }
        days++;
        return days;
    }
}
