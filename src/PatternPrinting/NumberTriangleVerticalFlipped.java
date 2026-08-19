package PatternPrinting;

import java.util.Scanner;

public class NumberTriangleVerticalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){ //determine print
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
