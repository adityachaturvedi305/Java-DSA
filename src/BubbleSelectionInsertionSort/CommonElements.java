package BubbleSelectionInsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
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
        int[] c = new int[Math.min(a.length, b.length)];
        int i=0,j=0,k=0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]) {
                c[k++] = a[i];
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else j++;
        }
        for (int p = 0; p < k; p++) {
            System.out.print(c[p] + " ");
        }
    }
}
