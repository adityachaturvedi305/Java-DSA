package Arrays1D;

import java.util.Scanner;

public class MultiplyOddAddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if(arr[i]%2 != 0) System.out.print(2*arr[i]+" ");
            else System.out.print((arr[i]+10)+" ");
        }
    }
}
