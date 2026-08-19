package Recursion;
import java.util.Scanner;
public class ElementExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int k = sc.nextInt();
        System.out.println("Element exist: "+ check(arr,0, k));
    }
    private static boolean check(int[] arr, int idx,int k) {
        if(idx == arr.length) return false;
        if(k == arr[idx]) return true;
        return check(arr, idx+1, k);
    }
}
