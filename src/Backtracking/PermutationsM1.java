package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsM1 {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] check = new boolean[arr.length];
        permutations(arr, check, temp, ans);
        return ans;
    }

    public void permutations(int[] arr, boolean[] check, List<Integer> temp, List<List<Integer>> ans) {
        int n = arr.length;
        if(n == temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < n; i++){
            if (check[i]) continue;
            temp.add(arr[i]);
            check[i] = true;
            permutations(arr, check, temp, ans);
            temp.remove(temp.size() - 1);
            check[i] = false;
        }
    }
}
