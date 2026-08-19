package MergeSort;

import java.util.Scanner;

public class CountInversions {
    static int count;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        count = 0;
        mergeSort(arr);
        System.out.println(count);
    }
    private static void mergeSort(int[] arr) {
        if (arr.length == 1) return;
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i = 0; i< a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i< b.length; i++) b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while (i< a.length && j< b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else {
                count += (a.length-i);
                c[k++] = b[j++];
            }
        }
        while (i< a.length) c[k++] = a[i++];
        while (j< b.length) c[k++] = b[j++];
    }
}
//        int count = 0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]<arr[j]) count++;
//            }
//        }
//        System.out.println(count);