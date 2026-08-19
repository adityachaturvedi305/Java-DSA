package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int fact(int x){
        int f = 1;
        for(int i = 1; i<=x; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args){
        // nCr = n!/r!(n-r)! & nPr = n!/(n-r)!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

//        int nfact = 1;
//        for(int i = 1; i<=n; i++){
//            nfact *= i;
//        }
//        int rfact = 1;
//        for(int i = 1; i<=n; i++){
//            rfact *= i;
//        }
//        int nrfact = 1;
//        for(int i = 1; i<=n-r; i++){
//            nrfact *= i;
//        }
//        int ncr = nfact/(rfact*nrfact);

        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);
    }
}
