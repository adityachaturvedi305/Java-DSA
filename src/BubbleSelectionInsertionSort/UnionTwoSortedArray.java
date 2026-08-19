package BubbleSelectionInsertionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnionTwoSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an 1st array : ");
        int x = sc.nextInt();
        int[] a = new int[x];
        System.out.print("Enter the elements of an 1st array : ");
        for (int i = 0; i < x; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Enter the size of an 2nd array : ");
        int y = sc.nextInt();
        int[] b = new int[y];
        System.out.print("Enter the elements of an 2nd array : ");
        for (int j = 0; j < y; j++){
            b[j] = sc.nextInt();
        }
        Arrays.sort(b);
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                addIfNotPresent(union, a[i]);
                i++;
            }
            else if (a[i] > b[j]) {
                addIfNotPresent(union, b[j]);
                j++;
            }
            else { // a[i] == b[j]
                addIfNotPresent(union, a[i]);
                i++;
                j++;
            }
        }

        // Remaining elements
        while (i < a.length) {
            addIfNotPresent(union, a[i]);
            i++;
        }

        while (j < b.length) {
            addIfNotPresent(union, b[j]);
            j++;
        }
        System.out.print(union);
    }

    // Helper method to avoid duplicates
    static void addIfNotPresent(ArrayList<Integer> list, int val) {
        if (list.size() == 0 || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }
}
