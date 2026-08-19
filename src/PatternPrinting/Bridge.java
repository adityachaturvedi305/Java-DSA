package PatternPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1;
        int nst = n-1;
        for(int i = 1; i <= n -1; i++){
            for(int j = 1; j <= nst; j++){ // Another method --> j <= n+1-i
                System.out.print("* ");
            }
            for(int k = 1; k <= nsp; k++){ // Another method --> k <= 2*i-1
                System.out.print("  ");
            }
            for(int l = 1; l <= nst; l++){
                System.out.print("* ");
            }
            nsp+=2;
            nst--;
            System.out.println();
        }
    }
}
