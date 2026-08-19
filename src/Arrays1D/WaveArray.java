package Arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array : ");
        for (int
             i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0; i<size-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.print("Wave Array: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
