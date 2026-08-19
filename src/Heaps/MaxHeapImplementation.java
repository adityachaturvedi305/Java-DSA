package Heaps;
import java.util.Arrays;
class MaxHeap{
    int[] arr;
    int idx;
    void add(int val){
        if(idx == arr.length){
            System.out.println("MaxHeap is full!");
            return;
        }
        arr[idx++] = val;
        int root = idx-1;
        while(root != 1) {
            int parent = root / 2;
            if(arr[root] > arr[parent]) {
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else break;
        }
    }
    int remove() {
        if(size() == 0){
            System.out.println("MaxHeap is empty!");
            return -1;
        }
        int max = arr[1];
        int root = 1;
        arr[1] = arr[idx - 1];
        idx--;
        // Rearrangement
        while(root <= size()) {
            int left = 2 * root;
            int right = 2 * root + 1;
            int leftVal = (left <= size()) ? arr[left] : Integer.MIN_VALUE;
            int rightVal = (right <= size()) ? arr[right] : Integer.MIN_VALUE;
            if(arr[root] >= leftVal && arr[root] >= rightVal) break;
            else {
                if(leftVal > rightVal) { // left child se swap karna hai
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                }
                else { // right child se swap karna hai
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }
        }
        return max;
    }
    int peek(){
        if(size() == 0){
            System.out.println("MaxHeap is empty!");
            return -1;
        }
        return arr[1];
    }
    int size(){
        return idx-1;
    }
    void display(){
        for(int i = 1; i < idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    MaxHeap(int capacity){
        arr = new int[capacity+1];
    }
}
public class MaxHeapImplementation {
    public static void main(String[] args) {

    }
}
