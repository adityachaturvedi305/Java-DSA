package Arrays1D;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter that element : ");
        int target = sc.nextInt();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < n; i++){
            if(target == arr[i]){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag==false) System.out.print("Element not found");
        else System.out.print("Element found at index "+index);
    }
}
