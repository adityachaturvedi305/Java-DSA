package basics.PracticeForCodethon;

import java.util.Scanner;

public class AdamsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int orig = n;
        int sq = n*n;
        int revSq = 0;
        while (sq!=0){
            revSq = revSq *10 + sq%10;
            sq /= 10;
        }
        int sqRoot = (int)Math.round(Math.sqrt(revSq));
        if (sqRoot * sqRoot != revSq) {
            System.out.println("Not a Adams number");
            return;
        }
        int revSqRoot = 0;
        while (sqRoot!=0){
            revSqRoot = revSqRoot*10+sqRoot%10;
            sqRoot /= 10;
        }
        if(revSqRoot==orig) System.out.println("Adams number");
        else System.out.println("Not a Adams number");
    }

}
