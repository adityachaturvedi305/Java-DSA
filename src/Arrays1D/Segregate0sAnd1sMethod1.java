package Arrays1D;

import java.util.Scanner;

public class Segregate0sAnd1sMethod1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int numberOfZeros = 0;
        int numberOfOnes = 0;
        for (int element : arr){
            if (element==0) numberOfZeros++;
            else numberOfOnes++;
        }
        for (int i = 0; i<size; i++){
            if (i<numberOfZeros) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.print("Segmented elements : ");
        for (int element : arr){
            System.out.print(element+" ");
        }
    }
}
