package Recursion;
public class ReverseStringUsingRecursion {
    public static void main(String[] args){
        String s = "hello";
        char[] arr = s.toCharArray();
        reverse(arr, 0, arr.length-1);
        System.out.println(new String(arr));
    }
    public static void reverse(char[] arr, int i, int j){
        if(i >= j) return;
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i+1, j-1);
    }
}
