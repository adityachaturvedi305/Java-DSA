package Recursion;

import java.util.Scanner;

public class UniqueWayPathsPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();
        pathPrint(0,0,row-1,col-1,"");
    }
    private static void pathPrint(int cr, int cc, int m, int n, String Paths) {
        if(cr == m && cc == n){
            System.out.println(Paths);
            return;
        }
        if(cr > m || cc > n){
            return;
        }
        pathPrint(cr, cc+1, m, n, Paths+"R");
        pathPrint(cr+1, cc, m, n, Paths+"D");
    }
}
