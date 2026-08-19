package Recursion;

public class LinearSearchByRecursion {
    public static void main(String[] args) {
        int[] arr = {1,23,44,54,3,4,3};
        System.out.println(linearSearch(arr,0,23));
    }
    public static int linearSearch(int[] arr, int idx, int k){
        if(idx == arr.length) return -1;
        else if(arr[idx] == k) return idx;
        return linearSearch(arr, idx+1, k);
    }
}
