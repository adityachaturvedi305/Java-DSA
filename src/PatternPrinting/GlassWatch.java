package PatternPrinting;

import java.util.Scanner;

public class GlassWatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int nst = n;
        int mid = n/2+1;
        int nsp = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");

            }
            for(int j=1; j<=nst; j++){
                System.out.print("*"+" ");
            }
            if(mid>i){
                nsp++;
                nst-=2;
            }
            else {
                nsp--;
                nst+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
