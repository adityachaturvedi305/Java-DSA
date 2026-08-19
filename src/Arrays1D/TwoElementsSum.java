package Arrays1D;

import java.util.Scanner;

public class TwoElementsSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int taget = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if(arr[i]+arr[j] == taget) System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }

    }
}
