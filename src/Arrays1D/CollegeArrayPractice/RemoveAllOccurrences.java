package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter remove element: ");
        int k = sc.nextInt();
        int j = 0;
        for (int i=0; i<n; i++){
            if(arr[i] != k) arr[j++] = arr[i];
        }
        for (int i=0; i<j; i++) System.out.print(arr[i]+" ");
    }
}
