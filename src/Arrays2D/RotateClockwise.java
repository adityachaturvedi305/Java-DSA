package Arrays2D;

import java.util.Scanner;

public class RotateClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (for n x n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0 , left = 0;
        int bot = n-1 , right = n-1;
        while (top<bot && left<right){
            int temp = arr[top][left];
            for (int j = left; j < right; j++) arr[top][j] = arr[top][j + 1];
            for (int i = top; i < bot; i++) arr[i][right] = arr[i + 1][right];
            for (int j = right; j > left; j--) arr[bot][j] = arr[bot][j - 1];
            for (int i = bot; i > top + 1; i--) arr[i][left] = arr[i - 1][left];
            arr[top + 1][left] = temp;
            top++;
            bot--;
            left++;
            right--;
        }
        for (int[] a : arr){
            for (int ele : a) System.out.print(ele+" ");
            System.out.println();
        }
    }
}
