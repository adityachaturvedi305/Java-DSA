package PatternPrinting;

import java.util.Scanner;

public class NumberPyramidMast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp = n-1;
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= nsp; j++){ // Another method --> j <= n-1
                System.out.print("  ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print(k+" ");
            }
            int a = i-1;
            for(int q = 1; q <= i-1; q++){
                System.out.print(a+" ");
                a--;
            }
            nsp--;
            System.out.println();
        }
    }
}
