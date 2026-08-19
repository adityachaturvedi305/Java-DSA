package BinarySearch;

import java.util.Scanner;

public class FloorSqrt {
    public static void main(String[] args){
        // root of any number is from 0 to that number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sqrt = 0;
        for (int i=0; i<n; i++){
            if(i*i > n) break;
            sqrt=i;
        }
        System.out.print("The square root is "+sqrt);
    }
}
