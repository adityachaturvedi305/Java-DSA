package Arrays1D.CollegeArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter first array elements: ");
        for (int i=0; i<a; i++) arr[i] = sc.nextInt();
        System.out.print("Enter second array size: ");
        int b = sc.nextInt();
        int[] brr = new int[b];
        System.out.println("Enter second array elements: ");
        for (int i = 0; i< b; i++) brr[i] = sc.nextInt();
        int[] c = new int[a+b];
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i=0, j=0,k=0;
        while (i<a && j<b){
            if(arr[i]<=brr[j]) c[k++] = arr[i++];
            else c[k++] = brr[j++];
        }
        while (i<a) c[k++] = arr[i++];
        while (j<b) c[k++] = brr[j++];
        for (int ele : c) System.out.print(ele+" ");
    }
}
