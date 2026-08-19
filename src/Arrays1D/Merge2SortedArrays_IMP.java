package Arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArrays_IMP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st array size : ");
        int x = sc.nextInt();
        int[] a = new int[x];
        System.out.print("Enter 1st array elements : ");
        for (int i = 0; i < x; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Enter 2nd array size : ");
        int y = sc.nextInt();
        int[] b = new int[y];
        System.out.print("Enter 2nd array elements : ");
        for (int j = 0; j < y; j++){
            b[j] = sc.nextInt();
        }
        Arrays.sort(b);
        int[] c = new int[a.length+b.length];
        merge(c,a,b);
        for (int element : c) System.out.print(element+" ");
        System.out.println();
    }
    public static void merge(int[] c, int[] a, int[] b){
        int i=0, j=0, k=0;
        while (i< a.length && j< b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
//            k++;
        }
        if (i==a.length){ // a array khatam --> b ke bache hue element lo
            while (j< b.length){
                c[k] = b[j];
                j++;
                k++;

            }
        }
        else {
            while (i< a.length){
                c[k] = a[i];
                i++;
                k++;

            }
        }
    }
}
