package Arrays2D;

import java.util.Scanner;

public class SnakePattern {
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
        System.out.println("Result -->");
        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
