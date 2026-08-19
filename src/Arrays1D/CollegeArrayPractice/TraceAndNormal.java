package Arrays1D.CollegeArrayPractice;

import java.util.Scanner;

public class TraceAndNormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int trace = 0;
        int normal = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==j){
                    trace += arr[i][j];
                }
                normal+= arr[i][j]*arr[i][j];
            }
        }
        normal = (int)Math.sqrt(normal);
        if(rows == cols) System.out.println("Trace = " + trace);
        else System.out.println("Trace not possible (not a square matrix)");
        System.out.println("Normal = " + normal);
    }
}
