package PatternPrinting;

import java.util.Scanner;

public class DiamondMethod1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for(int i = 1; i < n; i++){ // detemine lines
            for(int j = 1; j <= nsp; j++){ // Another method --> i <= n-1
                System.out.print("  ");
            }

            for(int k = 1; k <= nst; k++){ // Another method --> k <= 2*i-1
                System.out.print("* ");
            }
            nsp--;
            nst+=2;

            System.out.println();
        }
        nsp = 1;
        nst = 2*n-3;
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= nsp; j++){ // Another method --> i <= n-1
                System.out.print("  ");
            }

            for(int k = 1; k <= nst; k++){ // Another method --> k <= 2*i-1
                System.out.print("* ");
            }
            nsp++;
            nst-=2;

            System.out.println();
        }
    }
}
