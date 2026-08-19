package Arrays1D;

import java.util.Scanner;

public class Segregate0sAnd1sMethod2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int i=0, j = n -1;
        while (i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==0) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
}
