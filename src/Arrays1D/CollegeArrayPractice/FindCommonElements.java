package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class FindCommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int a = sc.nextInt();
        String[] arr = new String[a];
        System.out.println("Enter first array elements: ");
        for (int i=0; i<a; i++) arr[i] = sc.next();
        System.out.print("Enter second array size: ");
        int b = sc.nextInt();
        String[] brr = new String[b];
        System.out.println("Enter first array elements: ");
        for (int i = 0; i<b; i++) brr[i] = sc.next();
        int n = Math.min(a,b);
        String[] c = new String[n];
        int k = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i].equals(brr[j])) {
                    c[k++] = arr[i];
                    break;
                }
            }
        }
        System.out.println("Common elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
