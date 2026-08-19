package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        k = k%n;
        rev(arr, 0, k);
        rev(arr, 0, n - 1);
        rev(arr, 0, k - 1);
        System.out.print("Rotated Array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    private static void rev(int[] arr, int i, int j) {
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
