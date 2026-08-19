package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n];
        for(int i=0; i<n; i++){
            brr[i] = arr[i];
        }
        System.out.println("Result array: ");
        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}
