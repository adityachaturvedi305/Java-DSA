package Recursion;

import java.util.Scanner;

public class UniquePathsMethod2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int col = sc.nextInt();
        System.out.println(Paths(row, col));
    }
    public static int Paths(int row, int col){
        return uniquePaths(0,0,row-1,col-1);
    }
    public static int uniquePaths(int currentRow,int currentColumn, int lastRow, int lastColumn ){
        if(currentRow==lastRow && currentColumn==lastColumn) return 1;
        if(currentRow>lastRow || currentColumn>lastColumn) return 0;
        int right = uniquePaths(currentRow,currentColumn+1,lastRow,lastColumn);
        int down = uniquePaths(currentRow+1,currentColumn,lastRow,lastColumn);
        return right + down;
    }
}
