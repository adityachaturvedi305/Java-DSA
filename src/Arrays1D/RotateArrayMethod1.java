package Arrays1D;

import java.util.Scanner;

public class RotateArrayMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        if (n == 0) return;
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation count : ");
        int d = sc.nextInt();
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        System.out.print("Rotated Array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void reverse(int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }


    }
}
