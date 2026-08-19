package PatternPrinting;

import java.util.Scanner;

public class pyramidHwPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<nsp; j++){
                System.out.print("  ");
            }
            for(int k=0; k<nst; k++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }

}
