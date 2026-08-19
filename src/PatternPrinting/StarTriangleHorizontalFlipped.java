package PatternPrinting;

import java.util.Scanner;

public class StarTriangleHorizontalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n; // number of stars to be printed in each lines
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= a; j++){ // Other method --> j <= n+1-i
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
    }
}
