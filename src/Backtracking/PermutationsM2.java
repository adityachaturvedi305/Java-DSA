package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsM2 {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(0, arr, ans);
        return ans;
    }
    public void permutations(int idx, int[] arr, List<List<Integer>> ans) {
        if (idx == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int ele : arr) temp.add(ele);
            ans.add(temp);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            permutations(idx + 1, arr, ans);
            swap(arr, idx, i); // backtrack
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
