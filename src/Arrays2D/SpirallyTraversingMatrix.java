package Arrays2D;
import java.util.Scanner;
public class SpirallyTraversingMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int m = sc.nextInt();
        System.out.print("Enter column : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int first_row = 0, last_row = m - 1;
        int first_column = 0, last_column = n - 1;
        while(first_row <= last_row && first_column <= last_column){
            // right
            for(int j = first_column; j <= last_column; j++){
                System.out.print(arr[first_row][j] + " ");
            }
            first_row++;
            // down
            for(int i = first_row; i <= last_row; i++){
                System.out.print(arr[i][last_column] + " ");
            }
            last_column--;
            // left
            if(first_row <= last_row){
                for(int j = last_column; j >= first_column; j--){
                    System.out.print(arr[last_row][j] + " ");
                }
                last_row--;
            }
            // up
            if(first_column <= last_column){
                for(int i = last_row; i >= first_row; i--){
                    System.out.print(arr[i][first_column] + " ");
                    System.out.println();
                }
                first_column++;
            }
        }
    }
}
