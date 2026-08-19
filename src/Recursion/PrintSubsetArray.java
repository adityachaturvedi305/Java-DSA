package Recursion;

public class PrintSubsetArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subset(arr,"",0);
    }
    private static void subset(int[] arr, String ans,int idx) {
        if(idx == arr.length){
            System.out.println(ans);
            return;
        }
        subset(arr,ans+arr[idx],idx+1);
        subset(arr,ans,idx+1);
    }
}
