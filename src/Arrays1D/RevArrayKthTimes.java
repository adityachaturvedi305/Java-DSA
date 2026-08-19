package Arrays1D;

import java.util.Scanner;

public class RevArrayKthTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter reverse kth position: ");
        int k = sc.nextInt();
        for(int i = 0; i < n; i += k){
            int end = i + k - 1;
            if(end >= n) end = n - 1;
            rev(arr, i, end);
        }
        for(int x : arr) System.out.print(x + " ");
    }
    static void rev(int[] a, int s, int e){
        while(s < e){
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
}
