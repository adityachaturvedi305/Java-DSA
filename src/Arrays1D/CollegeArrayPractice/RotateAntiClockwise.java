package Arrays1D.CollegeArrayPractice;
import java.util.Scanner;
public class RotateAntiClockwise {
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
        while(top<bot && left<right){
            int temp = arr[top][left] ;
            for(int i=top; i<bot; i++) arr[i][left] = arr[i+1][left];
            for(int j=left; j<right; j++) arr[bot][j] = arr[bot][j+1];
            for(int i=bot; i>top; i--) arr[i][right] = arr[i-1][right];
            for(int j=right; j>top; j--) arr[top][j] = arr[top][j-1];
            arr[top][left+1] = temp;
            top++;
            bot--;
            left++;
            right--;
        }
        System.out.println("Rotated Matrix:");
        for(int i=0; i<n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}