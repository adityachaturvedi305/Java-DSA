package PatternPrinting;

import java.util.Scanner;

public class Numbers1Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= n; j++){ //determine print
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
