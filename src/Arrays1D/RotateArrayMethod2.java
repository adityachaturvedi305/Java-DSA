package Arrays1D;

import java.util.Scanner;

public class RotateArrayMethod2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotation value d : ");
        int d = sc.nextInt();
        d = d % n;

        int[] brr = new int[n];
        int index = 0;

        // copy elements from d to n-1
        for (int i = d; i < n; i++){
            brr[index] = arr[i];
            index++;
        }

        // copy first d elements
        for (int i = 0; i < d; i++){
            brr[index] = arr[i];
            index++;
        }

        System.out.print("Rotated array : ");
        for (int ele : brr){
            System.out.print(ele + " ");
        }
    }
}
