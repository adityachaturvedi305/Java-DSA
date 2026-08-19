package Arrays1D;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] brr = new int[m];
        System.out.print("Enter elements: ");
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        // Convert arrays to ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int x : arr) list1.add(x);
        for (int x : brr) list2.add(x);

        ArrayList<Integer> result = new ArrayList<>();

        int i = list1.size() - 1;
        int j = list2.size() - 1;
        int carry = 0;

        // Add from right to left
        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += list1.get(i--);
            if (j >= 0) sum += list2.get(j--);

            result.add(0, sum % 10); // insert at beginning
            carry = sum / 10;
        }

        if (carry > 0) {
            result.add(0, carry);
        }

        System.out.println("Result: " + result);
    }
}
