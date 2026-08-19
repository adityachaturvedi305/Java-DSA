package PatternPrinting;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= n; j++){ //determine print
                if(i == j || j == n+1-i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
