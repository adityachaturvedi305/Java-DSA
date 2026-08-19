package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class CheckEqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of first array: ");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] brr = new int[m];
        System.out.println("Enter elements of second array: ");
        for(int i = 0; i< m; i++) brr[i] = sc.nextInt();
        if(n!=m) {
            System.out.println("Not equal!");
            return;
        }
        for(int i=0; i<n; i++){
            if(arr[i]!=brr[i]){
                System.out.println("Not equal!");
                return;
            }
        }
        System.out.println("Arrays are equal");
    }
}
