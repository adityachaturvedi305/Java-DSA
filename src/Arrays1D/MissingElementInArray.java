package Arrays1D;

import java.util.Scanner;

public class MissingElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        n = n + 1; // 1 to n tak numbers honge arr me
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for (int element : arr){
            arraySum += element;
        }
        System.out.print((int)(sum - arraySum)+" is the Mising element");
    }
}
