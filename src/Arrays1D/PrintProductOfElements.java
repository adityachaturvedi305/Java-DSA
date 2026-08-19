package Arrays1D;

import java.util.Scanner;

public class PrintProductOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for (int i = 0; i < n; i++){
            product *= arr[i];
        }
        System.out.print("The product of an array is : "+product);
    }
}
