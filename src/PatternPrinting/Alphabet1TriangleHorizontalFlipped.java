package PatternPrinting;

import java.util.Scanner;

public class Alphabet1TriangleHorizontalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <=n+1-i; j++){ //determine print
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
