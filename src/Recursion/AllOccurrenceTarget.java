package Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class AllOccurrenceTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter Target: ");
        int k = sc.nextInt();
        System.out.println(allIdx(arr,0,k));
    }
    public static ArrayList<Integer> allIdx(int[] arr, int idx, int k){
        if(idx == arr.length) return new ArrayList<>();
        ArrayList<Integer> rec = allIdx(arr, idx+1, k);
        if(arr[idx] == k) rec.add(0, idx);
        return rec;
    }
}
