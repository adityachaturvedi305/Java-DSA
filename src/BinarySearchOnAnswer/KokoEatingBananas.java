package BinarySearchOnAnswer;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] arr, int h) {
        int low = 1, high = Integer.MIN_VALUE;
        for(int ele : arr) high = Math.max(high, ele);
        int speed = 1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(hours(arr, mid) <= h){
                high = mid - 1;
                speed = mid;
            }
            else low = mid + 1;
        }
        return speed;
    }

    public long hours(int[] arr, int speed) {
        long h = 0;
        for(int ele : arr){
            if(ele % speed == 0) h += ele/speed;
            else h += ele/speed + 1;
        }
        return h;
    }
}
