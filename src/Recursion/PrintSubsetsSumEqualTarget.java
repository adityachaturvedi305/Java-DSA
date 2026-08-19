package Recursion;

public class PrintSubsetsSumEqualTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;
        subsets(arr, 0, 0, target, "");
    }
    static void subsets(int[] arr, int idx, int sum, int target, String ans) {
        // when sum matches target
        if (sum == target) {
            System.out.println(ans);
            return;
        }
        // stop when array ends
        if (idx == arr.length) {
            return;
        }
        // include current element
        subsets(arr, idx + 1, sum + arr[idx], target, ans + arr[idx] + " ");
        // exclude current element
        subsets(arr, idx + 1, sum, target, ans);
    }
}
