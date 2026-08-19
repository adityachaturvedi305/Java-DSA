package Arrays2D;

import java.util.Scanner;

public class TargetElement {
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
        System.out.print("Enter target : ");
        int k = sc.nextInt();
        boolean target = false;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==k) target = true;
            }
        }
        if(target==true) System.out.print("Target is present");
        else System.out.print("Target is not present");
    }
}
