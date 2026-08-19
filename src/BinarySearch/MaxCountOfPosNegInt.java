package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MaxCountOfPosNegInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // Count negative numbers
        int low = 0, high = n - 1;
        int negIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < 0) {
                negIndex = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int negative = negIndex + 1;

        // Count positive numbers
        low = 0;
        high = n - 1;
        int posIndex = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > 0) {
                posIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int positive = n - posIndex;

        System.out.println("Negative count = " + negative);
        System.out.println("Positive count = " + positive);
        System.out.println("Maximum count = " + Math.max(negative, positive));
    }
}
