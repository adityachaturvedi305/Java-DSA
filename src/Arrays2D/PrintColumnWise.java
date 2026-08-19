package Arrays2D;

import java.util.Scanner;

public class PrintColumnWise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int m = sc.nextInt();
        System.out.print("Enter coloumn : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=0; j<n;j++){
            for(int i=0; i<m; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
