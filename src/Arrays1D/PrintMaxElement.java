package Arrays1D;

import java.util.Scanner;

public class PrintMaxElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        int max = Integer.MIN_VALUE;
        int max = arr[0];
        for (int i = 0; i < n; i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.print("The max of an array is : "+max);
    }
}
