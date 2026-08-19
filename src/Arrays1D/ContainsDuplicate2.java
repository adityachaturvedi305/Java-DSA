package Arrays1D;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int j = map.get(arr[i]);
                if(i - j <= k) return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
