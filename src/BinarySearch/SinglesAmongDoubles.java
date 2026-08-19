package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SinglesAmongDoubles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // edge cases
        if (n == 1) {
            System.out.print(arr[0]);
            return;
        }
        else if (arr[n-1] != arr[n-2]) {
            System.out.print(arr[n-1]);
            return;
        }
        else if (arr[0] != arr[1]) {
            System.out.print(arr[0]);
            return;
        }

        int low = 1;          // changed
        int high = n - 2;     // changed
        int single = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;

            // FIX 1: correct assignment
            if (arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) {
                single = arr[mid];
                break;
            }

            int f = mid, s = mid;

            if (arr[mid-1] == arr[mid]) f = mid - 1;
            else if (arr[mid] == arr[mid+1]) s = mid + 1;

            int left_count = f - low; // (f-1-low)+1
            // right_count = high - s; // high-(s+1)+1

            if (left_count % 2 == 0) {
                low = s + 1;
            } else {
                high = f - 1;
            }
        }

        System.out.print("The single element is "+single);
    }
}
