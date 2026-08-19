package Recursion;

import java.util.Scanner;

public class UniquePathsMethod1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int col = sc.nextInt();
        System.out.println(Paths(row, col));
    }
    public static int Paths(int row, int col){
        // invalid case
        if(row == 0 || col == 0) return 0;
        // base case
        if(row == 1 && col == 1) return 1;
        return Paths(row - 1, col) + Paths(row, col - 1);
    }
}
