package Arrays2D;

import java.util.Scanner;

public class MinOutOfMaxRowElements {
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
        int minElement = Integer.MAX_VALUE;
        for(int i=0; i<m; i++){
            int maxElement = Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                if(maxElement < arr[i][j]) maxElement = arr[i][j];
            }
            if(maxElement<minElement) minElement = maxElement;
        }
        System.out.println("Minimum element out of max row element is "+minElement);
    }
}
