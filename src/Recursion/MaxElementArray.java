package Recursion;
import java.util.Scanner;
public class MaxElementArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Max element: "+print(arr,0));
    }
    private static int print(int[] arr, int idx) {
        if(idx == arr.length - 1) return arr[idx];
        int rec = print(arr, idx + 1);
        return Math.max(arr[idx], rec);
    }
}
