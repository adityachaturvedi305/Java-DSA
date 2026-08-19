package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element: ");
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == k){
                System.out.println("Element found at idx: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
