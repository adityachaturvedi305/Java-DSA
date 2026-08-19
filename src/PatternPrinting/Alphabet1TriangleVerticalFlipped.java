package PatternPrinting;

import java.util.Scanner;

public class Alphabet1TriangleVerticalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){ //determine print
                System.out.print((char)(k+64)+" ");
            }
            System.out.println();
        }
    }
}
